
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/gpu_info.mojom
//

package org.chromium.gpu.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class VideoCodecProfile {


    public static final int VIDEO_CODEC_PROFILE_UNKNOWN = (int) (-1L);

    public static final int H264PROFILE_BASELINE = (int) (0L);

    public static final int H264PROFILE_MAIN = H264PROFILE_BASELINE + 1;

    public static final int H264PROFILE_EXTENDED = H264PROFILE_MAIN + 1;

    public static final int H264PROFILE_HIGH = H264PROFILE_EXTENDED + 1;

    public static final int H264PROFILE_HIGH10PROFILE = H264PROFILE_HIGH + 1;

    public static final int H264PROFILE_HIGH422PROFILE = H264PROFILE_HIGH10PROFILE + 1;

    public static final int H264PROFILE_HIGH444PREDICTIVEPROFILE = H264PROFILE_HIGH422PROFILE + 1;

    public static final int H264PROFILE_SCALABLEBASELINE = H264PROFILE_HIGH444PREDICTIVEPROFILE + 1;

    public static final int H264PROFILE_SCALABLEHIGH = H264PROFILE_SCALABLEBASELINE + 1;

    public static final int H264PROFILE_STEREOHIGH = H264PROFILE_SCALABLEHIGH + 1;

    public static final int H264PROFILE_MULTIVIEWHIGH = H264PROFILE_STEREOHIGH + 1;

    public static final int VP8PROFILE_ANY = H264PROFILE_MULTIVIEWHIGH + 1;

    public static final int VP9PROFILE_PROFILE0 = VP8PROFILE_ANY + 1;

    public static final int VP9PROFILE_PROFILE1 = VP9PROFILE_PROFILE0 + 1;

    public static final int VP9PROFILE_PROFILE2 = VP9PROFILE_PROFILE1 + 1;

    public static final int VP9PROFILE_PROFILE3 = VP9PROFILE_PROFILE2 + 1;

    public static final int HEVCPROFILE_MAIN = VP9PROFILE_PROFILE3 + 1;

    public static final int HEVCPROFILE_MAIN10 = HEVCPROFILE_MAIN + 1;

    public static final int HEVCPROFILE_MAIN_STILL_PICTURE = HEVCPROFILE_MAIN10 + 1;

    public static final int DOLBYVISION_PROFILE0 = HEVCPROFILE_MAIN_STILL_PICTURE + 1;

    public static final int DOLBYVISION_PROFILE4 = DOLBYVISION_PROFILE0 + 1;

    public static final int DOLBYVISION_PROFILE5 = DOLBYVISION_PROFILE4 + 1;

    public static final int DOLBYVISION_PROFILE7 = DOLBYVISION_PROFILE5 + 1;

    public static final int THEORAPROFILE_ANY = DOLBYVISION_PROFILE7 + 1;

    public static final int AV1PROFILE_PROFILE_MAIN = THEORAPROFILE_ANY + 1;

    public static final int AV1PROFILE_PROFILE_HIGH = AV1PROFILE_PROFILE_MAIN + 1;

    public static final int AV1PROFILE_PROFILE_PRO = AV1PROFILE_PROFILE_HIGH + 1;


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private VideoCodecProfile() {}

}