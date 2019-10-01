package sustain.synopsis.sketch.query;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import sustain.synopsis.sketch.dataset.feature.FeatureType;
import sustain.synopsis.sketch.graph.DataContainer;
import sustain.synopsis.sketch.graph.Vertex;
import sustain.synopsis.sketch.serialization.SerializationException;
import sustain.synopsis.sketch.serialization.SerializationInputStream;

public class MetaQuery extends Query {

    private DataContainer aggregateData = new DataContainer();

    public MetaQuery() {

    }

    public MetaQuery(SerializationInputStream in)
    throws IOException, SerializationException {
        super(in);
    }

    public DataContainer result() {
        return aggregateData;
    }

    @Override
    public void execute(Vertex root)
    throws IOException, QueryException {
        this.query(root);
    }

    private void query(Vertex vertex)
    throws IOException, QueryException {
        DataContainer container = vertex.getData();
        if (container != null) {
            foundMatch(container);
        }

        if (vertex.numNeighbors() == 0) {
            /* This is a leaf node */
            return;
        }

        String childFeature = vertex.getFirstNeighbor().getLabel().getName();
        List<Expression> expList = this.expressions.get(childFeature);
        if (expList != null) {
            Set<Vertex> matches = evaluate(vertex, expList);
            for (Vertex match : matches) {
                if (match == null) {
                    continue;
                }

                if (match.getLabel().getType() == FeatureType.NULL) {
                    continue;
                }

                query(match);
            }
        } else {
            /* No expression operates on this vertex. Consider all children. */
            for (Vertex neighbor : vertex.getAllNeighbors()) {
                query(neighbor);
            }
        }
    }

    private void foundMatch(DataContainer container) {
        this.aggregateData.merge(container);
    }

}

