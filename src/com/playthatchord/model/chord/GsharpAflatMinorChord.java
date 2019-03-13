package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.*;

public class GsharpAflatMinorChord {

    public ChordStructure create() {

        ChordStructure chordStructure = new ChordStructure();


        int[] fretsLocation1 = {
                ChordConstant.Fret._4,
                ChordConstant.Fret._4,
                ChordConstant.Fret._4,
                ChordConstant.Fret._4,
                ChordConstant.Fret._6,
                ChordConstant.Fret._6,
                ChordConstant.Fret._4
        };
        String[] noteNames1 = {
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.B,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.GsAb,
        };
        ChordShape variation1 = new ChordShape(fretsLocation1, noteNames1, ChordConstant.CommonMinorFingering.barChords_1);



        int[] fretsLocation2 = {
                ChordConstant.Fret._11,
                ChordConstant.Fret._12,
                ChordConstant.Fret._13,
                ChordConstant.Fret._13,
                ChordConstant.Fret._13,
                ChordConstant.Fret._11,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames2 = {
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.B,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.MUTE,
        };
        ChordShape variation2 = new ChordShape(fretsLocation2, noteNames2, ChordConstant.CommonMinorFingering.barChords_2);



        int[] fretsLocation3 = {
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret._7,
                ChordConstant.Fret._9,
                ChordConstant.Fret._8,
                ChordConstant.Fret._6,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames3 = {
                ChordConstant.Notes.B,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.MUTE,
                ChordConstant.Notes.MUTE,
        };
        ChordShape variation3 = new ChordShape(fretsLocation3, noteNames3, ChordConstant.CommonMinorFingering.dShapeLike);



        ChordShape[] chordShapes = new ChordShape[] {variation1, variation2, variation3};



        String description = "G# minor chord. The G#m consists of the tones G# (1), B (3) and D# (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "Like the major chord, the minor chord can be assembled by stacking two 3rd over a root. But in minor the order is contrary. For our G#m chord that means you go up a minor(!) 3rd first, getting B and then stack a major(!) 3rd above the B, ending up with D# as perfect 5th.\n" +
                "\n" +
                "On one string on the guitar:\n" +
                "minor 3rd = 1 whole-step + 1 half-step = 3 frets up\n" +
                "major 3rd = 2 whole-steps = 4 frets up\n" +
                "\n" +
                "Let's compare major and minor chords again one below the other:\n" +
                "\n" +
                "Major Chord:\n" +
                "major 3rd (3) + minor 3rd (m3) = perfect 5th (5)\n" +
                "G#m chord = G# (1), C (m3) and D# (5)\n" +
                "\n" +
                "Minor Chord::\n" +
                "minor 3rd (m3) + major 3rd (3) = perfect 5th (5)\n" +
                "G#m chord = G# (1), B (m3) and D# (5)\n" +
                "\n" +
                "You can notate the G# minor chord as G#m or G#-, but readability may suffer when using a minus instead of the m and writing G#- directly on a staff. You may also find minor chords written with just the root as lowercase letter in older song books, but I would recommend to avoid that outdated and obsolete way of writing.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Carried out that way, you will get minor chords on the II. (2nd), III. (3rd) and IV. (6th) scale degre of a major(!) scale. The 6th scale degree is the so called key of parallel minor, but usually scale degrees are measured based on the major scale (except e.g. II-V-I or IV-V-I progressions in minor, where the key of parallel minor is considered as the 1st scale degree.\n" +
                "\n" +
                "So in a song in the key of C major (respectively A minor) you may most likely find the chords Dm (IIm), Em (IIIm) and Am (VIm). Consequently we can find our G#m chord most likely in a song in the key of\n" +
                "F# major (G#m = IIm) = D# minor (G#m = IVm),\n" +
                "E major (G#m = IIIm) = C# minor (G#m = Vm) oder\n" +
                "B major (G#m = VIm) = G# minor (G#m = Im).\n" +
                "\n" +
                "The chord of each type relate to eachother in the same way:\n" +
                "Major scale: major chords on Ist, IVth and Vth scale degree\n" +
                "Minor scale: minor chords on Ist, IVth and Vth scale degree (equates IInd, IIIrd and VIth scale degree of the major scale).\n\n\n\n\n\n\n" +
                "Ab minor chord. The Abm consists of the tones Ab (1), B (3) and Eb (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "Like the major chord, the minor chord can be assembled by stacking two 3rd over a root. But in minor the order is contrary. For our Abm chord that means you go up a minor(!) 3rd first, getting B and then stack a major(!) 3rd above the B, ending up with Eb as perfect 5th.\n" +
                "\n" +
                "On one string on the guitar:\n" +
                "minor 3rd = 1 whole-step + 1 half-step = 3 frets up\n" +
                "major 3rd = 2 whole-steps = 4 frets up\n" +
                "\n" +
                "Let's compare major and minor chords again one below the other:\n" +
                "\n" +
                "Major Chord:\n" +
                "major 3rd (3) + minor 3rd (m3) = perfect 5th (5)\n" +
                "Abm chord = Ab (1), C (m3) and Eb (5)\n" +
                "\n" +
                "Minor Chord::\n" +
                "minor 3rd (m3) + major 3rd (3) = perfect 5th (5)\n" +
                "Abm chord = Ab (1), B (m3) and Eb (5)\n" +
                "\n" +
                "You can notate the Ab minor chord as Abm or Ab-, but readability may suffer when using a minus instead of the m and writing Ab- directly on a staff. You may also find minor chords written with just the root as lowercase letter in older song books, but I would recommend to avoid that outdated and obsolete way of writing.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Carried out that way, you will get minor chords on the II. (2nd), III. (3rd) and IV. (6th) scale degre of a major(!) scale. The 6th scale degree is the so called key of parallel minor, but usually scale degrees are measured based on the major scale (except e.g. II-V-I or IV-V-I progressions in minor, where the key of parallel minor is considered as the 1st scale degree.\n" +
                "\n" +
                "So in a song in the key of C major (respectively A minor) you may most likely find the chords Dm (IIm), Em (IIIm) and Am (VIm). Consequently we can find our Abm chord most likely in a song in the key of\n" +
                "Gb major (Abm = IIm) = Eb minor (Abm = IVm),\n" +
                "E major (Abm = IIIm) = Db minor (Abm = Vm) oder\n" +
                "B major (Abm = VIm) = Ab minor (Abm = Im).\n" +
                "\n" +
                "The chord of each type relate to eachother in the same way:\n" +
                "Major scale: major chords on Ist, IVth and Vth scale degree\n" +
                "Minor scale: minor chords on Ist, IVth and Vth scale degree (equates IInd, IIIrd and VIth scale degree of the major scale).";

        chordStructure.setRootNote(new GsharpAflatNote());
        chordStructure.setThirdNote(new BNote());
        chordStructure.setFifthNote(new DsharpEflatNote());
        chordStructure.setChordShapes(chordShapes);
        chordStructure.setChordDescription(description);

        return chordStructure;
    }

}
