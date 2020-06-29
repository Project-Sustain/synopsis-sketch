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

package sustain.synopsis.sketch.stat;

import java.io.IOException;

import org.apache.commons.math3.util.FastMath;

import sustain.synopsis.sketch.serialization.ByteSerializable;
import sustain.synopsis.sketch.serialization.SerializationInputStream;
import sustain.synopsis.sketch.serialization.SerializationOutputStream;

public class RunningStatisticsND implements ByteSerializable {

    private long n;

    private double[] mean;
    private double[] m2;
    private double[] min;
    private double[] max;

    private double[] ss;

    public RunningStatisticsND() {

    }

    public RunningStatisticsND (int dimensions) {
        this.initialize(dimensions);
    }

    public RunningStatisticsND(double... samples) {
        this(samples.length);
        put(samples);
    }

    public RunningStatisticsND(RunningStatisticsND that) {
        this.copyFrom(that);
    }

    /**
     * Initializes all instance variables based on a given number of dimensions.
     * Useful for constructing new instances or resetting already existing
     * instances.
     *
     * @param dimensions Number of dimensions to initialize
     */
    private void initialize(int dimensions) {
        this.n = 0;

        this.mean = new double[dimensions];
        this.m2 = new double[dimensions];
        this.min = new double[dimensions];
        this.max = new double[dimensions];

        for (int d = 0; d < dimensions; ++d) {
            this.min[d] = Double.MAX_VALUE;
            this.max[d] = Double.MIN_VALUE;
        }

        this.ss = new double[dimensions * (dimensions - 1) / 2];
    }

    private boolean initialized() {
        return mean != null;
    }

    private void copyFrom(RunningStatisticsND that) {
        if (that.initialized() == false) {
            return;
        }

        initialize(that.dimensions());
        this.n = that.n;
        for (int i = 0; i < that.dimensions(); ++i) {
            this.mean[i] = that.mean[i];
            this.m2[i] = that.m2[i];
            this.min[i] = that.min[i];
            this.max[i] = that.max[i];
        }
        for (int i = 0; i < that.ss.length; ++i) {
            this.ss[i] = that.ss[i];
        }
    }

    /**
     * Converts a 2D matrix index (i, j) to a 1D array position.
     *
     * @return corresponding array position.
     */
    private int index1D(int i, int j) {
        int dims = this.dimensions();
        return (dims * (dims - 1) / 2)
            - (dims - i) * ((dims - i) - 1) / 2 + j - i - 1;
    }

    /**
     * Add a new set of samples to the running statistics.
     */
    public void put(double... samples) {
        if (this.initialized() == false) {
            initialize(samples.length);
        }

        if (samples.length != this.dimensions()) {
            throw new IllegalArgumentException("Input dimension mismatch: "
                    + samples.length + " =/= " + this.dimensions());
        }

        n++;

        for (int i = 0; i < this.dimensions() - 1; ++i) {
            for (int j = i + 1; j < this.dimensions(); ++j) {
                double dx = samples[i] - mean[i];
                double dy = samples[j] - mean[j];
                int index = index1D(i, j);
                ss[index] += dx * dy * n / (n + 1);
            }
        }

        for (int d = 0; d < this.dimensions(); ++d) {
            double delta = samples[d] - mean[d];
            mean[d] = mean[d] + delta / n;
            m2[d] = m2[d] + delta * (samples[d] - mean[d]);

            min[d] = FastMath.min(min[d], samples[d]);
            max[d] = FastMath.max(max[d], samples[d]);
        }
    }

    public void merge(RunningStatisticsND that) {
        if (this.initialized() == false) {
            this.copyFrom(that);
            return;
        }

        if (this.dimensions() != that.dimensions()) {
            throw new IllegalArgumentException("Dimension mismatch: "
                    + this.dimensions() + " =/= " + that.dimensions() + "; "
                    + "merge operations require equal number of dimensions.");
        }

        long newN = n + that.n;

        for (int i = 0; i < this.dimensions() - 1; ++i) {
            for (int j = i + 1; j < this.dimensions(); ++j) {
                double dx = that.mean[i] - this.mean[i];
                double dy = that.mean[j] - this.mean[j];
                int index = index1D(i, j);
                ss[index] += that.ss[index] + this.n * that.n * dx * dy
                    / (this.n + that.n);
            }
        }

        for (int d = 0; d < this.dimensions(); ++d) {
            double delta = this.mean[d] - that.mean[d];
            this.mean[d] =
                (this.n * this.mean[d] + that.n * that.mean[d]) / newN;
            this.m2[d] += that.m2[d] + delta * delta * this.n * that.n / newN;

            min[d] = FastMath.min(this.min[d], that.min[d]);
            max[d] = FastMath.max(this.max[d], that.max[d]);
        }

        this.n = newN;
    }

    public void clear() {
        this.initialize(this.dimensions());
    }

    public int dimensions() {
        if (this.initialized() == false) {
            return 0;
        }

        return mean.length;
    }

    public long count() {
        return this.n;
    }

    public double mean(int dimension) {
        return this.mean[dimension];
    }

    public double std(int dimension) {
        return FastMath.sqrt(var(dimension));
    }

    public double var(int dimension) {
        return var(dimension, 1.0);
    }

    public double var(int dimension, double ddof) {
        if (n == 0) {
            return Double.NaN;
        }

        return m2[dimension] / (n - ddof);
    }

    public double min(int dimension) {
        return this.min[dimension];
    }

    public double max(int dimension) {
        return this.max[dimension];
    }

    public double[] means() {
        return this.mean;
    }

    public double[] stds() {
        double[] stds = new double[this.dimensions()];
        for (int i = 0; i < this.dimensions(); ++i) {
            stds[i] = this.std(i);
        }

        return stds;
    }

    public double[] vars() {
        double[] vars = new double[this.dimensions()];
        for (int i = 0; i < this.dimensions(); ++i) {
            vars[i] = this.var(i);
        }

        return vars;
    }

    public double[] mins() {
        return this.min;
    }

    public double[] maxes() {
        return this.max;
    }

    public double[] m2() {
        return this.m2;
    }

    public double[] ss() {
        return this.ss;
    }

    public void setN(long n) {
        this.n = n;
    }

    public void setMean(double[] mean) {
        this.mean = mean;
    }

    public void setM2(double[] m2) {
        this.m2 = m2;
    }

    public void setMin(double[] min) {
        this.min = min;
    }

    public void setMax(double[] max) {
        this.max = max;
    }

    public void setSs(double[] ss) {
        this.ss = ss;
    }

    @Deserialize
    public RunningStatisticsND(SerializationInputStream in)
    throws IOException {
        int dimensions = in.readInt();
        if (dimensions == 0) {
            return;
        }
        this.mean = new double[dimensions];
        this.m2 = new double[dimensions];
        this.min = new double[dimensions];
        this.max = new double[dimensions];
        this.ss = new double[dimensions * (dimensions - 1) / 2];

        this.n = in.readLong();

        for (int i = 0; i < dimensions; ++i) {
            mean[i] = in.readDouble();
            m2[i] = in.readDouble();
            min[i] = in.readDouble();
            max[i] = in.readDouble();
        }

        for (int i = 0; i < this.ss.length; ++i) {
            ss[i] = in.readDouble();
        }
    }

    @Override
    public void serialize(SerializationOutputStream out)
    throws IOException {
        out.writeInt(this.dimensions());
        if (this.dimensions() == 0) {
            return;
        }

        out.writeLong(n);

        for (int i = 0; i < this.dimensions(); ++i) {
            out.writeDouble(mean[i]);
            out.writeDouble(m2[i]);
            out.writeDouble(min[i]);
            out.writeDouble(max[i]);
        }

        for (int i = 0; i < ss.length; ++i) {
            out.writeDouble(ss[i]);
        }
    }

}
