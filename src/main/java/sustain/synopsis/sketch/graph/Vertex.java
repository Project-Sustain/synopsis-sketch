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
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import sustain.synopsis.sketch.dataset.feature.Feature;
import sustain.synopsis.sketch.serialization.ByteSerializable;
import sustain.synopsis.sketch.serialization.SerializationException;
import sustain.synopsis.sketch.serialization.SerializationInputStream;
import sustain.synopsis.sketch.serialization.SerializationOutputStream;

/**
 * Provides a lightweight generic implementation of a graph vertex backed by a
 * TreeMap for extensibility.  This provides the basis of the hybrid
 * trees/graphs used in the system. Vertices store labels that extend the
 * Comparable interface to ensure they can be ordered properly in the TreeMap.
 *
 * @author malensek
 */
public class Vertex implements ByteSerializable {

    protected Feature label;
    protected DataContainer data;
    protected TreeMap<Feature, Vertex> edges = new TreeMap<>();

    public Vertex() {
        label = new Feature();
    }

    public Vertex(Feature label) {
        this.label = label;
    }

    public Vertex(Feature label, DataContainer data) {
        this.label = label;
        this.data = data;
    }

    public Vertex(Vertex v) {
        this.label = v.label;
        this.data = v.data;
    }

    /**
     * Determines whether two vertices are connected.
     *
     * @param label the label of the vertex to search for
     * @return true if the Vertex label is found on a connecting edge.
     */
    public boolean connectedTo(Feature label) {
        return edges.containsKey(label);
    }

    /**
     * Determines whether two vertices are connected.
     *
     * @param v the vertex to search for
     * @return true if the Vertex is found on a connecting edge.
     */
    public boolean connectedTo(Vertex v) {
        return edges.containsValue(v);
    }

    /**
     * Retrieve a neighboring Vertex.
     *
     * @param label Neighbor's label.
     * @return Neighbor Vertex.
     */
    public Vertex getNeighbor(Feature label) {
        return edges.get(label);
    }

    public Vertex getFirstNeighbor() {
        if (edges.isEmpty()) {
            return null;
        }

        return edges.firstEntry().getValue();
    }

    /**
     * Retrieves the {@link NavigableMap} of neighboring vertices less than the
     * specified value.
     *
     * @param label label value to compare against
     * @param inclusive whether or not to include the label's value while doing
     *     comparisons
     * @return {@link NavigableMap} of neighboring vertices
     */
    public NavigableMap<Feature, Vertex> getNeighborsLessThan(
            Feature label, boolean inclusive) {
        return edges.headMap(label, inclusive);
    }

    /**
     * Retrieves the {@link NavigableMap} of neighboring vertices greater than
     * the specified value.
     *
     * @param label label value to compare against
     * @param inclusive whether or not to include the label's value while doing
     *     comparisons
     * @return {@link NavigableMap} of neighboring vertices
     */
    public NavigableMap<Feature, Vertex> getNeighborsGreaterThan(
            Feature label, boolean inclusive) {
        return edges.tailMap(label, inclusive);
    }

    /**
     * Retrieves the {@link NavigableMap} of neighboring vertices within the
     * range specified.
     *
     * @param from the beginning of the range (inclusive)
     * @param to the end of the range (exclusive)
     * @return {@link NavigableMap} of neighboring vertices in the specified
     *     range
     */
    public NavigableMap<Feature, Vertex> getNeighborsInRange(
            Feature from, Feature to) {

        return getNeighborsInRange(from, true, to, false);
    }

    /**
     * Retrieves the {@link NavigableMap} of neighboring vertices within the
     * range specified.
     *
     * @param from the beginning of the range
     * @param fromInclusive whether to include 'from' in the range of values
     * @param to the end of the range (exclusive)
     * @param toInclusive whether to include 'to' in the range of values
     * @return {@link NavigableMap} of neighboring vertices in the specified
     *     range
     */
    public NavigableMap<Feature, Vertex> getNeighborsInRange(
            Feature from, boolean fromInclusive,
            Feature to, boolean toInclusive) {

        return edges.subMap(from, fromInclusive, to, toInclusive);
    }

    /**
     * Retrieve the labels of all neighboring vertices.
     *
     * @return Neighbor Vertex labels.
     */
    public Set<Feature> getNeighborLabels() {
        return edges.keySet();
    }

    /**
     * Traverse all edges to return all neighboring vertices.
     *
     * @return collection of all neighboring vertices.
     */
    public Collection<Vertex> getAllNeighbors() {
        return edges.values();
    }

    public int numNeighbors() {
        return edges.size();
    }

    /**
     * Connnects two vertices.  If this vertex is already connected to the
     * provided vertex label (based on value), then the already-connected vertex
     * is returned and its DataContainer will be merged with the vertex passed
     * to this method.
     *
     * @param vertex The vertex to connect to.
     * @return Connected vertex.
     */
    protected Vertex connect(Vertex v) {
        return connect(v, false, null);
    }

    /**
     * Connnects two vertices.  If this vertex is already connected to the
     * provided vertex label (based on value), then the already-connected vertex
     * is returned and its DataContainer will be merged with the vertex passed
     * to this method.
     *
     * @param vertex The vertex to connect to.
     * @param overwriteData If set to true, any DataContainers in the
     *     destination vertex will be overwritten instead of merged.
     * @return Connected vertex.
     */
    protected Vertex connect(Vertex v, boolean overwriteData) {
        return connect(v, overwriteData, null);
    }

    /**
     * Connnects two vertices.  If this vertex is already connected to the
     * provided vertex label (based on value), then the already-connected vertex
     * is returned and its DataContainer will be merged with the vertex passed
     * to this method.
     *
     * @param vertex The vertex to connect to.
     * @param overwriteData If set to true, any DataContainers in the
     *     destination vertex will be overwritten instead of merged.
     * @param metrics A {@link GraphMetrics} instance to update as the connect
     *     operation is carred out.
     * @return Connected vertex.
     */
    protected Vertex connect(
            Vertex v, boolean overwriteData, GraphMetrics metrics) {
        Feature label = v.getLabel();
        Vertex neighbor = getNeighbor(label);
        if (neighbor == null) {
            edges.put(label, v);
            if (metrics != null) {
                metrics.addVertex();
                if (v.hasData()) {
                    metrics.addLeaf();
                }
            }
            return v;
        } else {
            if (neighbor.hasData() && overwriteData == false) {
                DataContainer container = neighbor.getData();
                container.merge(v.getData());
            } else {
                neighbor.setData(v.getData());
            }
            return neighbor;
        }
    }

    public Vertex disconnect(Feature label) {
        return this.edges.remove(label);
    }

    public Vertex disconnect(Vertex vertex) {
        return this.edges.remove(vertex.label);
    }

    /**
     * Removes all the edges from this Vertex, severing any connections with
     * neighboring vertices.
     */
    public void disconnectAll() {
        edges.clear();
    }

    /**
     * Add and connect a collection of vertices in the form of a traversal path,
     * starting with this vertex.
     *
     * @param path Collection of vertices to connect
     */
    public void addPath(Iterator<Vertex> path) {
        addPath(path, null);
    }

    /**
     * Add and connect a collection of vertices in the form of a traversal path,
     * starting with this vertex.
     *
     * @param path Collection of vertices to connect
     * @param metrics A {@link GraphMetrics} instance to populate as the path is
     *     added.
     */
    public void addPath(Iterator<Vertex> path, GraphMetrics metrics) {
        if (path.hasNext()) {
            Vertex vertex = path.next();
            Vertex connection = connect(vertex, false, metrics);
            connection.addPath(path, metrics);
        }
    }

    /**
     * Retrieves the label associated with this vertex.
     */
    public Feature getLabel() {
        return label;
    }

    public void setLabel(Feature label) {
        this.label = label;
    }

    public DataContainer getData() {
        return data;
    }

    /**
     * Retrieves whether or not this vertex has an associated
     * {@link DataContainer}.
     */
    public boolean hasData() {
        return data != null;
    }

    public void setData(DataContainer container) {
        this.data = container;
    }

    /**
     * Retrieves the number of descendant vertices for this {@link Vertex}.
     *
     * @return number of descendants (children)
     */
    public long numDescendants() {
        long total = this.getAllNeighbors().size();
        for (Vertex child : this.getAllNeighbors()) {
            total += child.numDescendants();
        }

        return total;
    }

    /**
     * Retrieves the number of descendant edges for this {@link Vertex}.
     *
     * @return number of descendant edges.
     */
    public long numDescendantEdges() {
        long total = 0;
        int numNeighbors = this.getAllNeighbors().size();

        if (numNeighbors > 0) {
            total = numNeighbors + numNeighbors - 1;
        }

        for (Vertex child : this.getAllNeighbors()) {
            total += child.numDescendantEdges();
        }

        return total;
    }

    public long numLeaves() {
        long total = 0;
        if (this.numNeighbors() == 0) {
            total++;
        } else {
            for (Vertex child : this.getAllNeighbors()) {
                total += child.numLeaves();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "V: [" + label.toString() + "] "
            + "(" + this.getAllNeighbors().size() + ")";
    }

    @Deserialize
    public Vertex(SerializationInputStream in)
    throws IOException, SerializationException {
        this(in, null);
    }

    public Vertex(SerializationInputStream in, GraphMetrics metrics)
    throws IOException, SerializationException {
        this.label = new Feature(in);
        this.data = new DataContainer(in);

        int neighbors = in.readInt();
        for (int i = 0; i < neighbors; ++i) {
            Vertex v = new Vertex(in);
            this.connect(v, false, metrics);
        }
    }

    @Override
    public void serialize(SerializationOutputStream out)
    throws IOException {
        this.label.serialize(out);
        if (this.hasData() == false) {
            this.data = new DataContainer();
        }
        this.data.serialize(out);
        out.writeInt(this.numNeighbors());
        for (Vertex v : this.getAllNeighbors()) {
            v.serialize(out);
        }
    }
}
