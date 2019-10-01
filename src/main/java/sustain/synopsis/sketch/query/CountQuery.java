package sustain.synopsis.sketch.query;

import sustain.synopsis.sketch.graph.CountContainer;
import sustain.synopsis.sketch.graph.GraphMetrics;
import sustain.synopsis.sketch.graph.Vertex;

public class CountQuery extends RelationalQuery {

    public CountQuery(GraphMetrics metrics) {
        super(metrics);
    }

    public CountContainer getCount(Vertex vertex) {
        CountContainer cc = new CountContainer();
        count(vertex, cc);
        return cc;
    }

    private void count(Vertex vertex, CountContainer container) {
        if (pruned.contains(vertex)) {
            return;
        }

        /* Add one vertex */
        container.a++;

        if (vertex.numNeighbors() == 0) {
            /* Add one leaf */
            container.b++;
        }

        for (Vertex v : vertex.getAllNeighbors()) {
            if (pruned.contains(v) == false) {
                count(v, container);
            }
        }
    }

}
