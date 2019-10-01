package sustain.synopsis.sketch.query;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import sustain.synopsis.sketch.dataset.feature.FeatureType;
import sustain.synopsis.sketch.graph.DataContainer;
import sustain.synopsis.sketch.graph.Vertex;
import sustain.synopsis.sketch.serialization.SerializationException;
import sustain.synopsis.sketch.serialization.SerializationInputStream;

public class SynthQuery extends Query {

    private List<DataContainer> containers = new ArrayList<>();

    public SynthQuery() {

    }

    public SynthQuery(SerializationInputStream in)
    throws IOException, SerializationException {
        super(in);
    }

    public List<DataContainer> result() {
        return containers;
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
            containers.add(container);
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
}

