package com.playthatchord.model.constant;

public class ChordConstant {

    public static class Fret {
        public static final int MUTE = -1;
        public static final int OPEN = 0;
        public static final int _1   = 1;
        public static final int _2   = 2;
        public static final int _3   = 3;
        public static final int _4   = 4;
        public static final int _5   = 5;
        public static final int _6   = 6;
        public static final int _7   = 7;
        public static final int _8   = 8;
        public static final int _9   = 9;
        public static final int _10  = 10;
        public static final int _11  = 11;
        public static final int _12  = 12;
        public static final int _13  = 13;
        public static final int _14  = 14;
        public static final int _15  = 15;
        public static final int _16  = 16;
        public static final int _17  = 17;
        public static final int _18  = 18;
        public static final int _19  = 19;
        public static final int _20  = 20;
        public static final int _21  = 21;
        public static final int _22  = 22;
    }

    public static class Fingering {
        public static final String MUTE  = "M";
        public static final String OPEN   = "O";
        public static final String THUMB  = "T";
        public static final String INDEX  = "I";
        public static final String MIDDLE = "M";
        public static final String RING   = "R";
        public static final String PINKY  = "P";
    }


    public static class Notes {
        public static final String MUTE   = "-";
        public static final String A      = "A";
        public static final String AsBb   = "<html><p style=\"font-size: 9px\">A#|Bb<p></html>";
        public static final String B      = "B";
        public static final String C      = "C";
        public static final String CsDb   = "<html><p style=\"font-size: 9px\">C#|Db<p></html>";
        public static final String D      = "D";
        public static final String DsEb   = "<html><p style=\"font-size: 9px\">D#|Eb<p></html>";
        public static final String E      = "E";
        public static final String F      = "F";
        public static final String FsGb   = "<html><p style=\"font-size: 9px\">F#|Gb<p></html>";
        public static final String G      = "G";
        public static final String GsAb   = "<html><p style=\"font-size: 9px\">G#|Ab<p></html>";
    }


    public static class ChordDisplayOption {
        public static final int Notes = 1;
        public static final int Fingering = 2;
    }


    public static class CommonMajorFingering {
        public static final String[] barChords_1 = {
                Fingering.INDEX,
                Fingering.INDEX,
                Fingering.MIDDLE,
                Fingering.PINKY,
                Fingering.RING,
                Fingering.INDEX
        };

        public static final String[] barChords_2 = {
                Fingering.INDEX,
                Fingering.PINKY,
                Fingering.RING,
                Fingering.MIDDLE,
                Fingering.INDEX,
                Fingering.MUTE
        };

        public static final String[] cShapeLike = {
                Fingering.INDEX,
                Fingering.MIDDLE,
                Fingering.INDEX,
                Fingering.RING,
                Fingering.PINKY,
                Fingering.MUTE
        };
    }


    public static class CommonMinorFingering {
        public static final String[] barChords_1 = {
                Fingering.INDEX,
                Fingering.INDEX,
                Fingering.INDEX,
                Fingering.PINKY,
                Fingering.RING,
                Fingering.INDEX
        };

        public static final String[] barChords_2 = {
                Fingering.INDEX,
                Fingering.MIDDLE,
                Fingering.PINKY,
                Fingering.RING,
                Fingering.INDEX,
                Fingering.MUTE
        };


        public static final String[] dShapeLike = {
                Fingering.MIDDLE,
                Fingering.PINKY,
                Fingering.RING,
                Fingering.INDEX,
                Fingering.MUTE,
                Fingering.MUTE
        };
    }
}
