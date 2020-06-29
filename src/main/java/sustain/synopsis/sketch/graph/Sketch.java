/*
 *
 * Software in the Sustain Ecosystem are Released Under Terms of Apache Software License 
 *
 * This research has been supported by funding from the US National Science Foundation's CSSI program through awards 1931363, 1931324, 1931335, and 1931283. The project is a joint effort involving Colorado State University, Arizona State University, the University of California-Irvine, and the University of Maryland - Baltimore County. All redistributions of the software must also include this information. 
 *
 * TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION
 *
 *
 * 1. Definitions.
 *
 * "License" shall mean the terms and conditions for use, reproduction, and distribution as defined by Sections 1 through 9 of this document.
 *
 * "Licensor" shall mean the copyright owner or entity authorized by the copyright owner that is granting the License.
 *
 * "Legal Entity" shall mean the union of the acting entity and all other entities that control, are controlled by, or are under common control with that entity. For the purposes of this definition, "control" means (i) the power, direct or indirect, to cause the direction or management of such entity, whether by contract or otherwise, or (ii) ownership of fifty percent (50%) or more of the outstanding shares, or (iii) beneficial ownership of such entity.
 *
 * "You" (or "Your") shall mean an individual or Legal Entity exercising permissions granted by this License.
 *
 * "Source" form shall mean the preferred form for making modifications, including but not limited to software source code, documentation source, and configuration files.
 *
 * "Object" form shall mean any form resulting from mechanical transformation or translation of a Source form, including but not limited to compiled object code, generated documentation, and conversions to other media types.
 *
 * "Work" shall mean the work of authorship, whether in Source or Object form, made available under the License, as indicated by a copyright notice that is included in or attached to the work (an example is provided in the Appendix below).
 *
 * "Derivative Works" shall mean any work, whether in Source or Object form, that is based on (or derived from) the Work and for which the editorial revisions, annotations, elaborations, or other modifications represent, as a whole, an original work of authorship. For the purposes of this License, Derivative Works shall not include works that remain separable from, or merely link (or bind by name) to the interfaces of, the Work and Derivative Works thereof.
 *
 * "Contribution" shall mean any work of authorship, including the original version of the Work and any modifications or additions to that Work or Derivative Works thereof, that is intentionally submitted to Licensor for inclusion in the Work by the copyright owner or by an individual or Legal Entity authorized to submit on behalf of the copyright owner. For the purposes of this definition, "submitted" means any form of electronic, verbal, or written communication sent to the Licensor or its representatives, including but not limited to communication on electronic mailing lists, source code control systems, and issue tracking systems that are managed by, or on behalf of, the Licensor for the purpose of discussing and improving the Work, but excluding communication that is conspicuously marked or otherwise designated in writing by the copyright owner as "Not a Contribution."
 *
 * "Contributor" shall mean Licensor and any individual or Legal Entity on behalf of whom a Contribution has been received by Licensor and subsequently incorporated within the Work.
 *
 * 2. Grant of Copyright License. Subject to the terms and conditions of this License, each Contributor hereby grants to You a perpetual, worldwide, non-exclusive, no-charge, royalty-free, irrevocable copyright license to reproduce, prepare Derivative Works of, publicly display, publicly perform, sublicense, and distribute the Work and such Derivative Works in Source or Object form.
 *
 * 3. Grant of Patent License. Subject to the terms and conditions of this License, each Contributor hereby grants to You a perpetual, worldwide, non-exclusive, no-charge, royalty-free, irrevocable (except as stated in this section) patent license to make, have made, use, offer to sell, sell, import, and otherwise transfer the Work, where such license applies only to those patent claims licensable by such Contributor that are necessarily infringed by their Contribution(s) alone or by combination of their Contribution(s) with the Work to which such Contribution(s) was submitted. If You institute patent litigation against any entity (including a cross-claim or counterclaim in a lawsuit) alleging that the Work or a Contribution incorporated within the Work constitutes direct or contributory patent infringement, then any patent licenses granted to You under this License for that Work shall terminate as of the date such litigation is filed.
 *
 * 4. Redistribution. You may reproduce and distribute copies of the Work or Derivative Works thereof in any medium, with or without modifications, and in Source or Object form, provided that You meet the following conditions:
 *
 * You must give any other recipients of the Work or Derivative Works a copy of this License; and
 * You must cause any modified files to carry prominent notices stating that You changed the files; and
 * You must retain, in the Source form of any Derivative Works that You distribute, all copyright, patent, trademark, and attribution notices from the Source form of the Work, excluding those notices that do not pertain to any part of the Derivative Works; and
 * If the Work includes a "NOTICE" text file as part of its distribution, then any Derivative Works that You distribute must include a readable copy of the attribution notices contained within such NOTICE file, excluding those notices that do not pertain to any part of the Derivative Works, in at least one of the following places: within a NOTICE text file distributed as part of the Derivative Works; within the Source form or documentation, if provided along with the Derivative Works; or, within a display generated by the Derivative Works, if and wherever such third-party notices normally appear. The contents of the NOTICE file are for informational purposes only and do not modify the License. You may add Your own attribution notices within Derivative Works that You distribute, alongside or as an addendum to the NOTICE text from the Work, provided that such additional attribution notices cannot be construed as modifying the License. 
 *
 * You may add Your own copyright statement to Your modifications and may provide additional or different license terms and conditions for use, reproduction, or distribution of Your modifications, or for any such Derivative Works as a whole, provided Your use, reproduction, and distribution of the Work otherwise complies with the conditions stated in this License.
 * 5. Submission of Contributions. Unless You explicitly state otherwise, any Contribution intentionally submitted for inclusion in the Work by You to the Licensor shall be under the terms and conditions of this License, without any additional terms or conditions. Notwithstanding the above, nothing herein shall supersede or modify the terms of any separate license agreement you may have executed with Licensor regarding such Contributions.
 *
 * 6. Trademarks. This License does not grant permission to use the trade names, trademarks, service marks, or product names of the Licensor, except as required for reasonable and customary use in describing the origin of the Work and reproducing the content of the NOTICE file.
 *
 * 7. Disclaimer of Warranty. Unless required by applicable law or agreed to in writing, Licensor provides the Work (and each Contributor provides its Contributions) on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied, including, without limitation, any warranties or conditions of TITLE, NON-INFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A PARTICULAR PURPOSE. You are solely responsible for determining the appropriateness of using or redistributing the Work and assume any risks associated with Your exercise of permissions under this License.
 *
 * 8. Limitation of Liability. In no event and under no legal theory, whether in tort (including negligence), contract, or otherwise, unless required by applicable law (such as deliberate and grossly negligent acts) or agreed to in writing, shall any Contributor be liable to You for damages, including any direct, indirect, special, incidental, or consequential damages of any character arising as a result of this License or out of the use or inability to use the Work (including but not limited to damages for loss of goodwill, work stoppage, computer failure or malfunction, or any and all other commercial damages or losses), even if such Contributor has been advised of the possibility of such damages.
 *
 * 9. Accepting Warranty or Additional Liability. While redistributing the Work or Derivative Works thereof, You may choose to offer, and charge a fee for, acceptance of support, warranty, indemnity, or other liability obligations and/or rights consistent with this License. However, in accepting such obligations, You may act only on Your own behalf and on Your sole responsibility, not on behalf of any other Contributor, and only if You agree to indemnify, defend, and hold each Contributor harmless for any liability incurred by, or claims asserted against, such Contributor by reason of your accepting any such warranty or additional liability. 
 *
 * END OF TERMS AND CONDITIONS */
package sustain.synopsis.sketch.graph;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NavigableMap;
import java.util.logging.Logger;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import sustain.synopsis.sketch.dataset.Metadata;
import sustain.synopsis.sketch.dataset.Pair;
import sustain.synopsis.sketch.dataset.feature.Feature;
import sustain.synopsis.sketch.dataset.feature.FeatureType;
import sustain.synopsis.sketch.serialization.SerializationException;
import sustain.synopsis.sketch.serialization.SerializationInputStream;
import sustain.synopsis.sketch.stat.RunningStatisticsND;

public class Sketch {

    private GraphMetrics metrics = new GraphMetrics();
    public GeoTrie geoTrie = new GeoTrie();

    private static final Logger logger = Logger.getLogger("sustain.synopsis.sketch");

    /** The root vertex. */
    private Vertex root = new Vertex();

    /** Describes each level in the Feature hierarchy. */
    private Map<String, HierarchyLevel> levels = new HashMap<>();

    /**
     * We maintain a separate Queue with Feature names inserted in
     * hierarchical order.  While levels.keySet() contains the same information,
     * there is no contractual obligation for HashMap to return the keyset in
     * the original insertion order (although in practice, it probably does).
     */
    private Queue<String> features = new LinkedList<>();

    /**
     * Tracks information about each level in the graph hierarchy.
     */
    private class HierarchyLevel {

        public HierarchyLevel(int order, FeatureType type) {
            this.order = order;
            this.type = type;
        }

        public int order;
        public FeatureType type;

    }

    public Sketch() {

    }

    /**
     * Creates a HierarchicalGraph with a set Feature hierarchy.  Features are
     * entered into the hierarchy in the order they are received.
     *
     * @param hierarchy Graph hierarchy represented as a
     * {@link FeatureHierarchy}.
     */
    public Sketch(FeatureHierarchy hierarchy) {
        for (Pair<String, FeatureType> feature : hierarchy) {
            getOrder(feature.a, feature.b);
        }
    }

    /**
     * When a path does not contain a particular Feature, we use a null feature
     * (FeatureType.NULL) to act as a "wildcard" in the graph so that the path
     * stays linked together. The side effect of this is that 'less than'
     * comparisons may return wildcards, which are removed with this method.
     *
     * @param map The map to remove the first NULL element from. If the map has
     * no elements or the first element is not a NULL FeatureType, then no
     * modifications are made to the map.
     */
    private void removeWildcard(NavigableMap<Feature, Vertex> map) {
        if (map.size() <= 0) {
            return;
        }

        Feature first = map.firstKey();
        if (first.getType() == FeatureType.NULL) {
            map.remove(first);
        }
    }

    /**
     * Adds a new {@link Path} to the Hierarchical Graph.
     */
    public void addPath(Path path, Metadata metadata)
    throws FeatureTypeMismatchException, GraphException {
        if (path.size() == 0) {
            throw new GraphException("Attempted to add empty path!");
        }

        checkFeatureTypes(path);
        addNullFeatures(path);
        reorientPath(path);
        optimizePath(path);

        double[] values = new double[path.size() - 2];
        for (int i = 1; i < path.size() - 1; ++i) { // skip time and location features
            // 2018-01-10 rammerd - added metadata argument and setting value
            //values[i] = path.get(i).getLabel().getDouble();
            String attributeName = path.get(i).getLabel().getName();
            values[i-1] = metadata.getAttribute(attributeName).getDouble();
        }
        RunningStatisticsND rsnd = new RunningStatisticsND(values);
        DataContainer container = new DataContainer(rsnd);

        /* Place the path payload (traversal result) at the end of this path. */
        path.get(path.size() - 1).setData(container);

        GraphMetrics oldMetrics = null;
        try {
            oldMetrics = (GraphMetrics) this.metrics.clone();
        } catch (Exception e) { }
        root.addPath(path.iterator(), this.metrics);

        if (oldMetrics.equals(this.metrics) == false) {
            long a = this.metrics.getVertexCount() - oldMetrics.getVertexCount();
            long b = this.metrics.getLeafCount() - oldMetrics.getLeafCount();
            geoTrie.addHash(
                    path.get(path.size() - 1).getLabel().getString(),
                    new CountContainer(a, b));
        }
    }

    /**
     * This method ensures that the Features in the path being added have the
     * same FeatureTypes as the current hierarchy.  This ensures that different
     * FeatureTypes (such as an int and a double) get placed on the same level
     * in the hierarchy.
     *
     * @param path the Path to check for invalid FeatureTypes.
     *
     * @throws FeatureTypeMismatchException if an invalid type is found
     */
    private void checkFeatureTypes(Path path)
    throws FeatureTypeMismatchException {
        for (Feature feature : path.getLabels()) {

            /* If this feature is NULL, then it's effectively a wildcard. */
            if (feature.getType() == FeatureType.NULL) {
                continue;
            }

            HierarchyLevel level = levels.get(feature.getName());
            if (level != null) {
                if (level.type != feature.getType()) {
                    throw new FeatureTypeMismatchException(
                            "Feature insertion at graph level " + level.order
                            + " is not possible due to a FeatureType mismatch. "
                            + "Expected: " + level.type + ", "
                            + "found: " + feature.getType() + "; "
                            + "Feature: <" + feature + ">");
                }
            }
        }
    }

    /**
     * For missing feature values, add a null feature to a path.  This maintains
     * the graph structure for sparse schemas or cases where a feature reading
     * is not available.
     */
    private void addNullFeatures(Path path) {
        Set<String> unknownFeatures = new HashSet<>(levels.keySet());
        for (Feature feature : path.getLabels()) {
            unknownFeatures.remove(feature.getName());
        }

        /* Create null features for missing values */
        for (String featureName : unknownFeatures) {
            Vertex v = new Vertex();
            v.setLabel(new Feature(featureName));
            path.add(v);
        }
    }

    /**
     * Reorients a nonhierarchical path in place to match the current graph
     * hierarchy.
     */
    private void reorientPath(Path path) {
        if (path.size() == 1) {
            /* This doesn't need to be sorted... */
            getOrder(path.get(0).getLabel());
            return;
        }

        path.sort(new Comparator<Vertex>() {
            public int compare(Vertex a, Vertex b) {
                int o2 = getOrder(b.getLabel());
                int o1 = getOrder(a.getLabel());
                return o1 - o2;
            }
        });
    }

    /**
     * Perform optimizations on a path to reduce the number of vertices inserted
     * into the graph.
     */
    private void optimizePath(Path path) {
        /* Remove all trailing null features.  During a traversal, trailing null
         * features are unnecessary to traverse. */
        for (int i = path.size() - 1; i >= 0; --i) {
            if (path.get(i).getLabel().getType() == FeatureType.NULL) {
                path.remove(i);
            } else {
                break;
            }
        }
    }

    /**
     * Removes all null Features from a path.  This includes any Features that
     * are the standard Java null, or Features with a NULL FeatureType.
     *
     * @param path Path to remove null Features from.
     */
    private void removeNullFeatures(Path path) {
        Iterator<Vertex> it = path.iterator();
        while (it.hasNext()) {
            Feature f = it.next().getLabel();
            if (f == null || f.getType() == FeatureType.NULL) {
                it.remove();
            }
        }
    }

    /**
     * Determines the numeric order of a Feature based on the current
     * orientation of the graph.  For example, humidity features may come first,
     * followed by temperature, etc.  If the feature in question has not yet
     * been added to the graph, then it is connected to the current leaf nodes,
     * effectively placing it at the bottom of the hierarchy, and its order
     * number is set to the current number of feature types in the graph.
     *
     * @return int representing the list ordering of the Feature
     */
    private int getOrder(String name, FeatureType type) {
        int order;
        HierarchyLevel level = levels.get(name);
        if (level != null) {
            order = level.order;
        } else {
            order = addNewFeature(name, type);
        }

        return order;
    }

    private int getOrder(Feature feature) {
        return getOrder(feature.getName(), feature.getType());
    }

    /**
     * Update the hierarchy levels and known Feature list with a new Feature.
     */
    private int addNewFeature(String name, FeatureType type) {
        logger.info("New feature: " + name + ", type: " + type);
        Integer order = levels.keySet().size();
        levels.put(name, new HierarchyLevel(order, type));
        features.offer(name);

        return order;
    }

    /**
     * Retrieves the ordering of Feature names in this graph hierarchy.
     */
    public FeatureHierarchy getFeatureHierarchy() {
        FeatureHierarchy hierarchy = new FeatureHierarchy();
        for (String feature : features) {
            try {
                hierarchy.addFeature(feature, levels.get(feature).type);
            } catch (GraphException e) {
                /* If a GraphException is thrown here, something is seriously
                 * wrong. */
                logger.severe("NULL FeatureType found in graph hierarchy!");
            }
        }
        return hierarchy;
    }

    public Vertex getRoot() {
        return root;
    }

    public GraphMetrics getMetrics() {
        return this.metrics;
    }

    public void merge(SerializationInputStream in)
    throws IOException, SerializationException {
        /* Since the incoming Sketch includes a root Vertex, we need to skip
         * over it to avoid having two roots! */
        new Feature(in);
        in.readBoolean();
        int numNeighbors = in.readInt();
        for (int i = 0; i < numNeighbors; ++i) {
            merge(this.root, in);
        }
    }

    private void merge(Vertex vertex, SerializationInputStream in)
    throws IOException, SerializationException {
        Feature label = new Feature(in);
        boolean hasData = in.readBoolean();
        DataContainer data = null;
        if (hasData) {
            data = new DataContainer(in);
        }

        Vertex connection = vertex.connect(
                new Vertex(label, data), true, this.metrics);

        int numNeighbors = in.readInt();
        for (int i = 0; i < numNeighbors; ++i) {
            merge(connection, in);
        }
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
