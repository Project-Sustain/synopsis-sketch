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
package sustain.synopsis.sketch.util;

import sustain.synopsis.sketch.dataset.Quantizer;
import sustain.synopsis.sketch.dataset.feature.Feature;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ReducedTestConfiguration {

    public static final String[] FEATURE_NAMES = {
        //"vegitation_type_as_in_sib_surface",
        //"vegetation_surface",
        "precipitable_water_entire_atmosphere",
        //"albedo_surface",
        "visibility_surface",
        //"pressure_surface",
        //"temperature_tropopause",
        "temperature_surface",
        "relative_humidity_zerodegc_isotherm", // 0-100 range
        //"downward_lon g_wave_rad_flux_surface",
        //"upward_short_wave_rad_flux_surface",
        //"snow_depth_surface",
        //"lightning_surface", // boolean
        //"ice_cover_ice1_no_ice0_surface", // boolean
        //"categorical_snow_yes1_no0_surface", // boolean
    };

    /* Temporarily disabled features:
     * ------------------------------
     *  "convective_inhibition_surface",
     *  "transpiration_stress-onset_soil_moisture_surface",
     *  "soil_porosity_surface",
     *  "total_precipitation_surface_3_hour_accumulation", // not in all files
     *  "snow_cover_surface", // 0-100 range
     *  "total_cloud_cover_entire_atmosphere", // 0-100 range
     *  "upward_long_wave_rad_flux_surface",
     *  "pressure_tropopause",
     *  "planetary_boundary_layer_height_surface",
     *  "surface_wind_gust_surface",
     */

    public static final Duration minTemporalGranularity = Duration.ofHours(6);

    public static final Map<String, Quantizer> quantizers = new HashMap<>();

    static {
        quantizers.put("temperature_surface", new Quantizer(
                    new Feature(232.42301635742223f),
                    //new Feature(261.2430508401904f),
                    new Feature(268.6041542884687f),
                    //new Feature(271.59460256433175f),
                    new Feature(273.9606715298498f),
                    //new Feature(277.9369818746787f),
                    new Feature(280.56594739192093f),
                    //new Feature(282.1433267022663f),
                    new Feature(283.6549818746806f),
                    //new Feature(285.1009129091638f),
                    new Feature(286.2839473919228f),
                    //new Feature(287.36839566778525f),
                    new Feature(288.5842922195098f),
                    //new Feature(289.93163704709644f),
                    new Feature(291.0489473919244f),
                    //new Feature(292.0676715298558f),
                    new Feature(293.18498187468373f),
                    //new Feature(294.40087842640827f),
                    new Feature(295.41960256433964f),
                    //new Feature(296.2740163574434f),
                    new Feature(297.06270601261605f),
                    //new Feature(297.8513956677887f),
                    new Feature(298.70580946089245f),
                    //new Feature(299.5930853229617f),
                    new Feature(300.44749911606544f),
                    //new Feature(301.2361887712381f),
                    new Feature(302.0248784264108f),
                    //new Feature(302.9450163574456f),
                    //new Feature(304.588119805722f),
                    new Feature(327.7230163574538f)
        ));

        quantizers.put("temperature_tropopause", new Quantizer(
                    new Feature(186.40544433593777f),
                    //new Feature(193.84038719307839f),
                    new Feature(194.65998719307814f),
                    //new Feature(195.3625014787922f),
                    new Feature(196.1430729073634f),
                    //new Feature(197.13830147879167f),
                    new Feature(198.21158719307707f),
                    //new Feature(199.20681576450534f),
                    new Feature(200.3191300502193f),
                    //new Feature(201.6461014787903f),
                    new Feature(202.69987290736142f),
                    //new Feature(203.5975300502183f),
                    new Feature(204.5732443359323f),
                    //new Feature(205.6270157645034f),
                    new Feature(206.54418719307455f),
                    //new Feature(207.38330147878858f),
                    new Feature(208.30047290735973f),
                    //new Feature(209.3932729073594f),
                    new Feature(210.42753005021623f),
                    //new Feature(211.40324433593022f),
                    new Feature(212.4960443359299f),
                    //new Feature(213.60835862164384f),
                    new Feature(214.44747290735788f),
                    //new Feature(215.1890157645005f),
                    new Feature(215.95007290735742f),
                    //new Feature(216.78918719307146f),
                    new Feature(217.6283014787855f),
                    //new Feature(218.3893586216424f),
                    new Feature(219.11138719307075f),
                    //new Feature(219.89195862164195f),
                    new Feature(220.82864433592738f),
                    //new Feature(221.9799871930699f),
                    new Feature(223.24841576449808f),
                    //new Feature(224.84858719306902f),
                    //new Feature(228.8490157644964f),
                    new Feature(254.72495862163143f)
        ));

        quantizers.put("relative_humidity_zerodegc_isotherm", new Quantizer(
                    new Feature(0.0f),
                    //new Feature(1.9414666666663918f),
                    new Feature(4.213433333333016f),
                    //new Feature(6.021733333332981f),
                    new Feature(7.830033333332946f),
                    //new Feature(10.055633333332905f),
                    new Feature(13.764966666666167f),
                    //new Feature(18.401633333332835f),
                    new Feature(23.40923333333293f),
                    //new Feature(28.231366666666357f),
                    new Feature(33.099866666666365f),
                    //new Feature(38.24656666666607f),
                    new Feature(43.57873333333243f),
                    //new Feature(48.725433333332134f),
                    new Feature(53.22299999999854f),
                    //new Feature(57.766933333331615f),
                    new Feature(62.58906666666467f),
                    //new Feature(66.71569999999818f),
                    new Feature(70.51776666666521f),
                    //new Feature(73.48523333333216f),
                    new Feature(76.59179999999913f),
                    //new Feature(79.60563333333275f),
                    new Feature(82.06306666666632f),
                    //new Feature(84.3350333333332f),
                    new Feature(86.88520000000011f),
                    //new Feature(89.85266666666706f),
                    new Feature(92.3564666666673f),
                    //new Feature(94.35023333333416f),
                    new Feature(96.29763333333435f),
                    //new Feature(98.75506666666791f),
                    new Feature(100.0f)
        ));

        quantizers.put("snow_depth_surface", new Quantizer(
                    new Feature(0.0f),
                    //new Feature(0.0013375000000001385f),
                    new Feature(0.002850000000000139f),
                    //new Feature(0.00470625000000014f),
                    new Feature(0.007731250000000141f),
                    //new Feature(0.09133125000000025f),
                    new Feature(2.102131249999994f)
        ));

        quantizers.put("pressure_tropopause", new Quantizer(
                    new Feature(5200.393164052437f),
                    new Feature(9070.849634601085f),
                    new Feature(9444.072222832543f),
                    new Feature(9734.356458123677f),
                    new Feature(9996.994575768036f),
                    new Feature(10259.632693412395f),
                    new Feature(10522.270811056755f),
                    new Feature(10784.908928701114f),
                    new Feature(11047.547046345473f),
                    new Feature(11310.185163989832f),
                    new Feature(11600.469399280966f),
                    new Feature(11973.691987512424f),
                    new Feature(12581.906575741466f),
                    new Feature(13245.413399264058f),
                    new Feature(13839.804928669713f),
                    new Feature(14752.126811013277f),
                    new Feature(15816.502340414101f),
                    new Feature(16549.12445805365f),
                    new Feature(17516.73857569089f),
                    new Feature(18539.64492862169f),
                    new Feature(19410.497634495205f),
                    new Feature(20198.411987428386f),
                    new Feature(20903.387987421233f),
                    new Feature(21594.54092859069f),
                    new Feature(22299.516928583536f),
                    new Feature(23073.60822269333f),
                    new Feature(24124.160693270904f),
                    new Feature(25160.89010502509f),
                    new Feature(26183.796457955887f),
                    new Feature(27123.76445794635f),
                    new Feature(28381.66281087476f),
                    new Feature(29584.268928509617f),
                    new Feature(31049.513163788866f),
                    new Feature(32998.56445788668f),
                    new Feature(52212.616222392535f)
        ));

        quantizers.put("precipitable_water_entire_atmosphere", new Quantizer(
                    new Feature(0.0f),
                    //new Feature(3.944119160486341f),
                    new Feature(5.852901769182011f),
                    //new Feature(7.266814812660285f),
                    new Feature(8.574684377877688f),
                    //new Feature(10.023945247442919f),
                    new Feature(11.543901769182064f),
                    //new Feature(12.993162638747295f),
                    new Feature(14.51311916048644f),
                    //new Feature(15.820988725703844f),
                    new Feature(16.91677133439946f),
                    //new Feature(17.977206117008112f),
                    new Feature(19.21438003005154f),
                    //new Feature(20.769684377877564f),
                    new Feature(22.324988725703587f),
                    //new Feature(24.09238003005134f),
                    new Feature(26.425336551790377f),
                    //new Feature(29.005727856138098f),
                    new Feature(33.10607568222489f),
                    //new Feature(37.98407568222469f),
                    new Feature(42.64998872570276f),
                    //new Feature(47.38659742135474f),
                    //new Feature(51.5929887257024f),
                    new Feature(73.96816263874697f)
        ));

        quantizers.put("visibility_surface", new Quantizer(
                    new Feature(0.0f),
                    //new Feature(2951.9677428600316f),
                    new Feature(8348.58759998435f),
                    //new Feature(12756.513742826015f),
                    new Feature(17463.107778523776f),
                    //new Feature(21881.332814222547f),
                    new Feature(23853.57079635848f),
                    //new Feature(23941.111385643886f),
                    new Feature(23992.60584992942f),
                    //new Feature(24031.22669814357f),
                    new Feature(24062.12337671489f),
                    //new Feature(24090.445332071937f),
                    new Feature(24116.192564214703f),
                    //new Feature(24139.365073143195f),
                    new Feature(24161.250220464546f),
                    //new Feature(24183.135367785897f),
                    new Feature(24204.37683430368f),
                    //new Feature(24224.974620017892f),
                    new Feature(24246.216086535675f),
                    //new Feature(24268.101233857025f),
                    new Feature(24290.630061981945f),
                    //new Feature(24313.802570910437f),
                    new Feature(24339.549803053204f),
                    //new Feature(24367.87175841025f),
                    new Feature(24400.055798588706f),
                    //new Feature(24438.676646802858f),
                    new Feature(24492.74583430267f),
                    //new Feature(24595.734762873737f),
                    new Feature(26016.98197715446f)
        ));

        quantizers.put("upward_short_wave_rad_flux_surface", new Quantizer(
                    new Feature(0.0f),
                    //new Feature(0.5359090909088516f),
                    new Feature(1.3390909090906444f),
                    //new Feature(6.411818181817754f),
                    new Feature(14.866363636362971f),
                    //new Feature(21.96818181818096f),
                    new Feature(31.437272727271612f),
                    //new Feature(43.78090909090764f),
                    //new Feature(52.23545454545287f),
                    new Feature(178.88454545453553f)
        ));

        quantizers.put("surface_wind_gust_surface", new Quantizer(
                    new Feature(0.0f),
                    new Feature(1.0617455382347378f),
                    new Feature(1.4893705382347378f),
                    new Feature(1.8392455382347377f),
                    new Feature(2.1988392882347423f),
                    new Feature(2.6070267882347515f),
                    new Feature(3.0346517882347612f),
                    new Feature(3.4039642882347696f),
                    new Feature(3.724683038234777f),
                    new Feature(4.025964288234784f),
                    new Feature(4.3272455382347905f),
                    new Feature(4.638245538234798f),
                    new Feature(4.949245538234805f),
                    new Feature(5.289401788234812f),
                    new Feature(5.687870538234821f),
                    new Feature(6.05718303823483f),
                    new Feature(6.377901788234837f),
                    new Feature(6.698620538234844f),
                    new Feature(7.038776788234852f),
                    new Feature(7.38865178823486f),
                    new Feature(7.738526788234868f),
                    new Feature(8.117558038234865f),
                    new Feature(8.574339288234833f),
                    new Feature(9.0505580382348f),
                    new Feature(9.555933038234766f),
                    new Feature(10.265401788234717f),
                    new Feature(10.897120538234674f),
                    new Feature(11.519120538234631f),
                    new Feature(12.41324553823457f),
                    new Feature(13.268495538234511f),
                    new Feature(14.648558038234416f),
                    new Feature(17.20458928823446f),
                    new Feature(28.040995538235695f)
        ));

        quantizers.put("upward_long_wave_rad_flux_surface", new Quantizer(
                    new Feature(144.5060455322288f),
                    new Feature(264.4813788655802f),
                    new Feature(296.207378865585f),
                    new Feature(309.5177121989203f),
                    new Feature(321.36937886558877f),
                    new Feature(337.4147121989245f),
                    new Feature(349.0840455322596f),
                    new Feature(358.383045532261f),
                    new Feature(366.04104553226216f),
                    new Feature(374.06371219893003f),
                    new Feature(380.8100455322644f),
                    new Feature(386.8270455322653f),
                    new Feature(393.2087121989329f),
                    new Feature(399.59037886560054f),
                    new Feature(405.97204553226817f),
                    new Feature(411.9890455322691f),
                    new Feature(417.8237121989366f),
                    new Feature(424.57004553227097f),
                    new Feature(430.5870455322719f),
                    new Feature(435.32771219893925f),
                    new Feature(439.7037121989399f),
                    new Feature(444.26204553227393f),
                    new Feature(449.36737886560803f),
                    new Feature(455.0197121989422f),
                    new Feature(460.85437886560976f),
                    new Feature(467.96537886561083f),
                    new Feature(488.38671219894724f),
                    new Feature(636.8060455323418f)
        ));

        quantizers.put("vegitation_type_as_in_sib_surface", new Quantizer(
                    new Feature(0.0f),
                    //new Feature(0.03155000000000228f),
                    new Feature(0.07395000000000232f),
                    //new Feature(0.12165000000000237f),
                    new Feature(0.18260000000000237f),
                    //new Feature(0.28860000000000235f),
                    new Feature(0.8928000000000044f),
                    //new Feature(1.0942000000000045f),
                    new Feature(3.9668000000000303f),
                    //new Feature(5.101000000000048f),
                    new Feature(7.009000000000078f),
                    //new Feature(9.81800000000012f),
                    new Feature(10.242000000000127f),
                    //new Feature(12.171200000000157f),
                    //new Feature(15.860000000000214f),
                    new Feature(20.10000000000028f)
        ));

        quantizers.put("albedo_surface", new Quantizer(
                    new Feature(2.600000000000006f),
                    //new Feature(5.265576923076906f),
                    new Feature(5.4743269230769025f),
                    //new Feature(5.622860576923054f),
                    new Feature(5.743293269230745f),
                    //new Feature(5.855697115384589f),
                    new Feature(5.9600721153845875f),
                    //new Feature(6.060432692307663f),
                    new Feature(6.164807692307662f),
                    //new Feature(6.277211538461506f),
                    new Feature(6.40165865384612f),
                    //new Feature(6.554206730769194f),
                    new Feature(6.779014423076883f),
                    //new Feature(11.018245192307585f),
                    new Feature(13.748052884615234f),
                    //new Feature(14.775745192307525f),
                    new Feature(15.546514423076744f),
                    //new Feature(16.253052884615194f),
                    new Feature(16.959591346153644f),
                    //new Feature(17.762475961538247f),
                    new Feature(18.918629807692074f),
                    //new Feature(21.45574519230742f),
                    new Feature(27.26862980769194f),
                    //new Feature(34.3340144230767f),
                    new Feature(50.07055288461665f),
                    //new Feature(65.67862980769468f),
                    new Feature(86.1040144230767f)
        ));

        quantizers.put("pressure_surface", new Quantizer(
                    new Feature(64264.90000000174f),
                    //new Feature(80120.48597588505f),
                    new Feature(83499.7141760733f),
                    //new Feature(85735.36210119785f),
                    new Feature(88166.7580013333f),
                    //new Feature(90773.29682647852f),
                    new Feature(92844.10435159388f),
                    //new Feature(94162.82755166735f),
                    new Feature(95090.054801719f),
                    //new Feature(95852.44165176147f),
                    new Feature(96573.61840180165f),
                    //new Feature(97088.74465183035f),
                    new Feature(97542.0557518556f),
                    //new Feature(98098.3921018866f),
                    new Feature(98562.00572691242f),
                    //new Feature(99097.73702694227f),
                    new Feature(99684.98095197498f),
                    //new Feature(100107.38447699852f),
                    new Feature(100447.36780201746f),
                    //new Feature(100679.17461453038f),
                    new Feature(100838.86375203928f),
                    //new Feature(100957.34278954589f),
                    new Feature(101057.7924083015f),
                    //new Feature(101145.36387080638f),
                    new Feature(101225.20843956084f),
                    //new Feature(101299.901745815f),
                    new Feature(101369.44378956889f),
                    //new Feature(101436.41020207263f),
                    new Feature(101503.37661457637f),
                    //new Feature(101570.3430270801f),
                    new Feature(101637.30943958384f),
                    //new Feature(101706.85148333773f),
                    new Feature(101778.96915834174f),
                    //new Feature(101856.23809584606f),
                    new Feature(101943.80955835094f),
                    //new Feature(102041.6835458564f),
                    new Feature(102165.31384586329f),
                    //new Feature(102330.15424587247f),
                    new Feature(102577.41484588625f),
                    //new Feature(103051.33099591265f),
                    new Feature(105482.7268960481f)
        ));

        quantizers.put("vegetation_surface", new Quantizer(
                    new Feature(0.0f),
                    //new Feature(0.10548214285705897f),
                    new Feature(0.2802083333332467f),
                    //new Feature(0.4616547619046723f),
                    new Feature(0.649821428571336f),
                    //new Feature(0.8648690476189516f),
                    new Feature(1.133678571428471f),
                    //new Feature(1.5368928571427494f),
                    new Feature(4.224988095237941f),
                    //new Feature(12.074226190475958f),
                    new Feature(21.106226190475702f),
                    //new Feature(30.89089285714195f),
                    new Feature(42.07336904761833f),
                    //new Feature(52.55694047619f),
                    new Feature(64.27703571428547f),
                    //new Feature(78.84651190476008f),
                    new Feature(100.0f)
        ));

        quantizers.put("downward_long_wave_rad_flux_surface", new Quantizer(
                    new Feature(78.91627807617476f),
                    //new Feature(205.34037485038738f),
                    new Feature(243.67182646329638f),
                    //new Feature(260.53766517297635f),
                    new Feature(271.13108452781665f),
                    //new Feature(281.58511678588275f),
                    new Feature(290.08772968910984f),
                    //new Feature(296.4995361407237f),
                    new Feature(302.77195549556336f),
                    //new Feature(310.29885872137095f),
                    new Feature(317.96514904395275f),
                    //new Feature(324.0981813020182f),
                    new Feature(329.39489097943834f),
                    //new Feature(334.8309877536327f),
                    new Feature(340.82463291492394f),
                    //new Feature(346.9576651729894f),
                    new Feature(352.25437485040953f),
                    //new Feature(356.99353614073283f),
                    new Feature(361.7326974310561f),
                    //new Feature(366.89002001170206f),
                    new Feature(372.32611678589643f),
                    //new Feature(377.901600656865f),
                    new Feature(383.89524581815624f),
                    //new Feature(390.58582646331854f),
                    new Feature(396.9976329149324f),
                    //new Feature(402.573116785901f),
                    new Feature(407.5910522697727f),
                    //new Feature(412.60898775364444f),
                    new Feature(418.184471624613f),
                    //new Feature(425.7113748504206f),
                    //new Feature(438.39560065687414f),
                    new Feature(511.0162780762399f)
        ));

        quantizers.put("planetary_boundary_layer_height_surface", new Quantizer(
                    new Feature(0.0f),
                    new Feature(221.1000000021814f),
                    new Feature(329.70000000242914f),
                    new Feature(417.93750000263043f),
                    new Feature(497.1250000028111f),
                    new Feature(569.5250000029762f),
                    new Feature(637.400000003131f),
                    new Feature(700.7500000032755f),
                    new Feature(766.3625000034252f),
                    new Feature(834.2375000035801f),
                    new Feature(906.6375000037452f),
                    new Feature(983.5625000039207f),
                    new Feature(1060.487500004096f),
                    new Feature(1137.4125000042716f),
                    new Feature(1212.0750000044418f),
                    new Feature(1289.0000000046173f),
                    new Feature(1374.9750000048134f),
                    new Feature(1483.5750000050612f),
                    new Feature(1605.7500000053399f),
                    new Feature(1709.8250000055773f),
                    new Feature(1809.3750000058044f),
                    new Feature(1917.9750000060521f),
                    new Feature(2049.2000000063513f),
                    new Feature(2184.950000006654f),
                    new Feature(2325.225000006967f),
                    new Feature(2492.6500000073406f),
                    new Feature(2678.1750000077545f),
                    new Feature(2881.800000008209f),
                    new Feature(3171.400000008855f),
                    new Feature(3515.300000009622f),
                    new Feature(3949.7000000105913f),
                    new Feature(4461.0250000117685f),
                    new Feature(5655.625000014554f),
                    new Feature(14149.050000034356f)
        ));

        quantizers.put("lightning_surface", new Quantizer(
                    new Feature(0.0f),
                    new Feature(1.0f)
        ));

        quantizers.put("ice_cover_ice1_no_ice0_surface", new Quantizer(
                    new Feature(0.0f),
                    new Feature(1.0f)
        ));

        quantizers.put("categorical_snow_yes1_no0_surface", new Quantizer(
                    new Feature(0.0f),
                    new Feature(1.0f)
        ));
    }
}
