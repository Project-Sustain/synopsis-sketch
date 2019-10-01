package sustain.synopsis.sketch.adapters;

import sustain.synopsis.sketch.graph.Vertex;
import sustain.synopsis.sketch.serialization.Serializer;

public class ReadVertexBundle {

    public static void main(String[] args) throws Exception {

        Vertex root = Serializer.restoreCompressed(Vertex.class, args[0]);
        System.out.println(root.numLeaves());
        System.out.println(root.numDescendants());
        System.out.println(root.numDescendantEdges());

    }
}
