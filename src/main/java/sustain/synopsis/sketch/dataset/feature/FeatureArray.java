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

package sustain.synopsis.sketch.dataset.feature;

import sustain.synopsis.sketch.serialization.ByteSerializable;
import sustain.synopsis.sketch.serialization.SerializationException;
import sustain.synopsis.sketch.serialization.SerializationInputStream;
import sustain.synopsis.sketch.serialization.SerializationOutputStream;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Manages a multidimensional array of {@link Feature} instances.
 *
 * @author malensek
 */
public class FeatureArray implements ByteSerializable {

    private static final Logger logger = Logger.getLogger("sustain.synopsis.sketch");

    private int[] dimensions;
    private int[] offsets;

    private List<Feature> features;

    private boolean named;
    private String name;

    private boolean typed;
    private FeatureType type;

    /**
     * Creates a new FeatureArray with the specified dimensions and a specific
     * {@link FeatureType} and Feature name.  A FeatureArray created with these
     * parameters will not allow variable FeatureTypes to be inserted into the
     * array, and will not allow variable Feature names to be used.  Specifying
     * the Feature name and FeatureType ahead of time reduces the amount of
     * information tracked by the array, as well as the amount of information
     * that must be serialized.
     *
     * @param dimensions A list of dimensions.  For example, passing {10} would
     * create a 1D array with 10 elements.  Passing {10, 100} would create a 2D
     * array with a total of 1000 elements.
     */
    public FeatureArray(String name, FeatureType type, int... dimensions) {
        this(type, dimensions);

        this.named = true;
        this.name = name;
    }

    /**
     * Creates a new FeatureArray with the specified dimensions and a specific
     * {@link FeatureType}.  A FeatureArray created with these parameters will
     * not allow variable FeatureTypes to be inserted into the array.
     *
     * @param dimensions A list of dimensions.  For example, passing {10} would
     * create a 1D array with 10 elements.  Passing {10, 100} would create a 2D
     * array with a total of 1000 elements.
     */
    public FeatureArray(FeatureType type, int... dimensions) {
        this(dimensions);

        this.typed = true;
        this.type = type;
    }

    /**
     * Creates a new FeatureArray with the specified dimensions.  FeatureArrays
     * created in this way will allow variable names and FeatureTypes of its
     * children Features, which offers the most flexibility but also consumes
     * the most memory and/or serialization processing time.
     *
     * @param dimensions A list of dimensions.  For example, passing {10} would
     * create a 1D array with 10 elements.  Passing {10, 100} would create a 2D
     * array with a total of 1000 elements.
     */
    public FeatureArray(int... dimensions) {
        constructBackingStore(dimensions);
    }

    /**
     * Creates a flat (1D) array that will be used to store Feature values for
     * the given dimensions.
     *
     * @param dimensions The dimensions of the array; for example, (10, 30)
     * would produce a 2D array of size 10x30.
     */
    private void constructBackingStore(int... dimensions) {
        this.dimensions = dimensions;

        /* Determine the overall size of the (collapsed) array */
        int size = 1;
        for (int i = 0; i < dimensions.length; ++i) {
            if (dimensions[i] <= 0) {
                throw new IllegalArgumentException("Invalid array dimension");
            }
            size = size * dimensions[i];
        }
        Feature nullFeature = new Feature();
        features = new ArrayList<>(Collections.nCopies(size, nullFeature));
        calculateOffsets(dimensions);
    }

    /**
     * Determines array offsets given the specified dimensions.
     */
    private void calculateOffsets(int... dimensions) {
        offsets = new int[dimensions.length];
        for (int i = 0; i < dimensions.length; ++i) {
            offsets[i] = 1;
            for (int j = i + 1; j < dimensions.length; ++j) {
                offsets[i] = offsets[i] * dimensions[j];
            }
        }
    }

    /**
     * Creates a FeatureArray from a Java array.  The type of the array is
     * ascertained from the Java type.
     *
     * @param name Name of the Features in this FeatureArray
     * @param features Java array containing feature values
     */
    public FeatureArray(String name, Object features) {
        this.named = true;
        this.name = name;
        this.typed = true;

        int[] dimensions = getMaxDimensions(features);
        constructBackingStore(dimensions);
        PrimitiveArray(features);
    }

    /**
     * Converts a ND native array to a FeatureArray.
     *
     * @param array multidimensional native array to convert.
     */
    private void PrimitiveArray(Object array) {
        AtomicInteger counter = new AtomicInteger();
        convertPrimitiveArray(counter, array);
    }

    /**
     * Recursive method for converting a native array to a FeatureArray.  This
     * method scans through the native array, creating Feature instances and
     * populating the FeatureArray as it goes.
     *
     * @param counter used to track the 1D array indices as they are populated
     * @param array multidimensional native array to convert
     */
    private void convertPrimitiveArray(AtomicInteger counter, Object array) {
        try {
            Array.getLength(array);
        } catch (Exception e) {
            /* Not an array */
            int index = counter.getAndIncrement();
            Feature feature;
            try {
                feature = Feature.fromPrimitiveType(array);

                if (this.type == null) {
                    this.type = feature.getType();
                }
            } catch (NullPointerException npe) {
                /* A null pointer here means that there was nothing in the array
                 * that was passed in, so we convert it to a NullFeature. */
                feature = new Feature();
            }
            features.set(index, feature);
            return;
        }

        Object[] castedArray = ((Object[]) array);
        for (int i = 0; i < castedArray.length; ++i) {
            convertPrimitiveArray(counter, castedArray[i]);
        }
    }

    /**
     * Determines the largest dimensions of a multidimensional Java array --
     * this is useful because Java arrays can be jagged, whereas Galileo arrays
     * are not.
     *
     * @param features Multidimensional java array of features
     *
     * @return Maximum dimensions of the array passed in
     */
    private int[] getMaxDimensions(Object features) {
        List<Integer> maxes = new ArrayList<>();
        getMaxDimensions(0, maxes, features);

        int[] dimensions = new int[maxes.size()];
        for (int i = 0; i < maxes.size(); ++i) {
            dimensions[i] = maxes.get(i);
        }
        return dimensions;
    }

    /**
     * Recursive method to scan for the largest dimensions in the array.  Since
     * Java arrays can be jagged, each element's size must be checked.
     *
     * @param level Current dimension being scanned (0 = first dim of array)
     * @param maxes The largest sized array seen so far, for each level.  This
     * is updated as the scan takes place.
     * @param features Feature arrays to scan
     */
    private void getMaxDimensions(
            int level, List<Integer> maxes, Object features) {
        int length;
        try {
            length = Array.getLength(features);
        } catch (Exception e) {
            /* Not an array */
            return;
        }

        if (maxes.size() < level + 1) {
            maxes.add(length);
        } else if (maxes.get(level) < length) {
            maxes.set(level, length);
        }

        Object[] castedFeatures = (Object[]) features;
        for (int i = 0; i < castedFeatures.length; ++i) {
            getMaxDimensions(level + 1, maxes, castedFeatures[i]);
        }
    }

    /**
     * Converts multidimensional array indices into the raw 1D array index used
     * to represent the array.
     *
     * @param indices list of multidimensional array indices.
     *
     * @return raw index corresponding to the indices in the backing store.
     */
    private int getIndex(int... indices) {
        if (indices.length != dimensions.length) {
            throw new IllegalArgumentException("Index array must match "
                    + "array rank.");
        }
        checkIndexBounds(indices);

        int index = 0;
        for (int i = 0; i < indices.length; ++i) {
            index = index + offsets[i] * indices[i];
        }
        return index;
    }

    /**
     * Ensures that the provided indices are not out of bounds.
     */
    private void checkIndexBounds(int... indices) {
        for (int i = 0; i < dimensions.length; ++i) {
            if (indices[i] >= dimensions[i]) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    /**
     * Retrieves the Feature at the provided indices.
     */
    public Feature get(int... indices) {
        int index = getIndex(indices);
        Feature feature = features.get(index);
        if (this.named == false) {
            return feature;
        } else {
            return new Feature(this.name, feature);
        }
    }

    /**
     * Sets the value of the Feature at the provided indices.
     */
    public void set(Feature feature, int... indices) {
        if (this.typed) {
            if (feature.getType() != this.type) {
                throw new IllegalArgumentException("FeatureType mismatch. "
                        + "Array Type: " + this.type + "; "
                        + "Feature Type: " + feature.getType());
            }
        }
        int index = getIndex(indices);
        features.set(index, feature);
    }

    /**
     * Clears the Feature at the provided indices.  This would be the same as
     * setting the array element to a NullFeatureData instance.
     */
    public void erase(int... indices) {
        int index = getIndex(indices);
        features.set(index, new Feature());
    }

    public boolean isNamed() {
        return this.named;
    }

    public String getName() {
        return this.name;
    }

    public boolean isTyped() {
        return this.typed;
    }

    public FeatureType getType() {
        return this.type;
    }

    /**
     * Retrieves the rank (dimensionality) of this array.
     */
    public int getRank() {
        return dimensions.length;
    }

    /**
     * Gets the size of the dimensions in this array.
     */
    public int[] getDimensions() {
        return dimensions;
    }

    /**
     * Retrieves the overall size of the (flattened) array.
     */
    public int getSize() {
        return features.size();
    }

    @Deserialize
    public FeatureArray(SerializationInputStream in)
    throws IOException {
        this.named = in.readBoolean();
        if (this.named) {
            this.name = in.readString();
        }

        this.typed = in.readBoolean();
        if (this.typed) {
            this.type = FeatureType.fromInt(in.readInt());
        }

        int rank = in.readInt();
        dimensions = new int[rank];
        for (int i = 0; i < rank; ++i) {
            dimensions[i] = in.readInt();
        }
        calculateOffsets(dimensions);

        int numFeatures = in.readInt();
        features = new ArrayList<>(numFeatures);
        Feature nullFeature = new Feature();
        for (int i = 0; i < numFeatures; ++i) {
            Feature feature = nullFeature;
            try {
                feature = new Feature(in);
            } catch (SerializationException e) {
                logger.log(Level.WARNING, "Error deserializing FeatureArray "
                        + "element", e);
            }
            features.add(feature);
        }
    }

    @Override
    public void serialize(SerializationOutputStream out)
    throws IOException {
        out.writeBoolean(this.named);
        if (named) {
            out.writeString(this.name);
        }

        out.writeBoolean(this.typed);
        if (typed) {
            out.writeInt(this.type.toInt());
        }

        out.writeInt(getRank());
        for (int dim : dimensions) {
            out.writeInt(dim);
        }

        out.writeInt(features.size());
        for (Feature feature : features) {
            out.writeSerializable(feature);
        }
    }
}
