package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.*;

public class DsharpEflatMinorChord {

    public ChordStructure create() {

        ChordStructure chordStructure = new ChordStructure();


        int[] fretsLocation1 = {
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret._2,
                ChordConstant.Fret._4,
                ChordConstant.Fret._3,
                ChordConstant.Fret._1,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames1 = {
                ChordConstant.Notes.FsGb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.MUTE,
                ChordConstant.Notes.MUTE,
        };
        String[] fingerings1 = {
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MUTE,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation1 = new ChordShape(fretsLocation1, noteNames1, fingerings1);



        int[] fretsLocation2 = {
                ChordConstant.Fret._11,
                ChordConstant.Fret._11,
                ChordConstant.Fret._11,
                ChordConstant.Fret._11,
                ChordConstant.Fret._13,
                ChordConstant.Fret._13,
                ChordConstant.Fret._11
        };
        String[] noteNames2 = {
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.FsGb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.DsEb,
        };
        ChordShape variation2 = new ChordShape(fretsLocation2, noteNames2, ChordConstant.CommonMinorFingering.barChords_1);



        int[] fretsLocation3 = {
                ChordConstant.Fret._6,
                ChordConstant.Fret._6,
                ChordConstant.Fret._7,
                ChordConstant.Fret._8,
                ChordConstant.Fret._8,
                ChordConstant.Fret._6,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames3 = {
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.FsGb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.MUTE,
        };
        ChordShape variation3 = new ChordShape(fretsLocation3, noteNames3, ChordConstant.CommonMinorFingering.barChords_2);



        ChordShape[] chordShapes = new ChordShape[] {variation1, variation2, variation3};



        String description = "D# minor chord. The D#m consists of the tones D# (1), F# (3) and A# (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "Like the major chord, the minor chord can be assembled by stacking two 3rd over a root. But in minor the order is contrary. For our D#m chord that means you go up a minor(!) 3rd first, getting F# and then stack a major(!) 3rd above the F#, ending up with A# as perfect 5th.\n" +
                "\n" +
                "On one string on the guitar:\n" +
                "minor 3rd = 1 whole-step + 1 half-step = 3 frets up\n" +
                "major 3rd = 2 whole-steps = 4 frets up\n" +
                "\n" +
                "Let's compare major and minor chords again one below the other:\n" +
                "\n" +
                "Major Chord:\n" +
                "major 3rd (3) + minor 3rd (m3) = perfect 5th (5)\n" +
                "D#m chord = D# (1), G (m3) and A# (5)\n" +
                "\n" +
                "Minor Chord::\n" +
                "minor 3rd (m3) + major 3rd (3) = perfect 5th (5)\n" +
                "D#m chord = D# (1), F# (m3) and A# (5)\n" +
                "\n" +
                "You can notate the D# minor chord as D#m or D#-, but readability may suffer when using a minus instead of the m and writing D#- directly on a staff. You may also find minor chords written with just the root as lowercase letter in older song books, but I would recommend to avoid that outdated and obsolete way of writing.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Carried out that way, you will get minor chords on the II. (2nd), III. (3rd) and IV. (6th) scale degre of a major(!) scale. The 6th scale degree is the so called key of parallel minor, but usually scale degrees are measured based on the major scale (except e.g. II-V-I or IV-V-I progressions in minor, where the key of parallel minor is considered as the 1st scale degree.\n" +
                "\n" +
                "So in a song in the key of C major (respectively A minor) you may most likely find the chords Dm (IIm), Em (IIIm) and Am (VIm). Consequently we can find our D#m chord most likely in a song in the key of\n" +
                "C# major (D#m = IIm) = A# minor (D#m = IVm),\n" +
                "B major (D#m = IIIm) = G# minor (D#m = Vm) oder\n" +
                "F# major (D#m = VIm) = D# minor (D#m = Im).\n" +
                "\n" +
                "The chord of each type relate to eachother in the same way:\n" +
                "Major scale: major chords on Ist, IVth and Vth scale degree\n" +
                "Minor scale: minor chords on Ist, IVth and Vth scale degree (equates IInd, IIIrd and VIth scale degree of the major scale).\n\n\n\n\n\n" +
                "Eb minor chord. The Ebm consists of the tones Eb (1), Gb (3) and Bb (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "Like the major chord, the minor chord can be assembled by stacking two 3rd over a root. But in minor the order is contrary. For our Ebm chord that means you go up a minor(!) 3rd first, getting Gb and then stack a major(!) 3rd above the Gb, ending up with Bb as perfect 5th.\n" +
                "\n" +
                "On one string on the guitar:\n" +
                "minor 3rd = 1 whole-step + 1 half-step = 3 frets up\n" +
                "major 3rd = 2 whole-steps = 4 frets up\n" +
                "\n" +
                "Let's compare major and minor chords again one below the other:\n" +
                "\n" +
                "Major Chord:\n" +
                "major 3rd (3) + minor 3rd (m3) = perfect 5th (5)\n" +
                "Ebm chord = Eb (1), G (m3) and Bb (5)\n" +
                "\n" +
                "Minor Chord::\n" +
                "minor 3rd (m3) + major 3rd (3) = perfect 5th (5)\n" +
                "Ebm chord = Eb (1), Gb (m3) and Bb (5)\n" +
                "\n" +
                "You can notate the Eb minor chord as Ebm or Eb-, but readability may suffer when using a minus instead of the m and writing Eb- directly on a staff. You may also find minor chords written with just the root as lowercase letter in older song books, but I would recommend to avoid that outdated and obsolete way of writing.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Carried out that way, you will get minor chords on the II. (2nd), III. (3rd) and IV. (6th) scale degre of a major(!) scale. The 6th scale degree is the so called key of parallel minor, but usually scale degrees are measured based on the major scale (except e.g. II-V-I or IV-V-I progressions in minor, where the key of parallel minor is considered as the 1st scale degree.\n" +
                "\n" +
                "So in a song in the key of C major (respectively A minor) you may most likely find the chords Dm (IIm), Em (IIIm) and Am (VIm). Consequently we can find our Ebm chord most likely in a song in the key of\n" +
                "Db major (Ebm = IIm) = Bb minor (Ebm = IVm),\n" +
                "B major (Ebm = IIIm) = Ab minor (Ebm = Vm) oder\n" +
                "Gb major (Ebm = VIm) = Eb minor (Ebm = Im).\n" +
                "\n" +
                "The chord of each type relate to eachother in the same way:\n" +
                "Major scale: major chords on Ist, IVth and Vth scale degree\n" +
                "Minor scale: minor chords on Ist, IVth and Vth scale degree (equates IInd, IIIrd and VIth scale degree of the major scale).";

        chordStructure.setRootNote(new DsharpEflatNote());
        chordStructure.setThirdNote(new FsharpGflatNote());
        chordStructure.setFifthNote(new AsharpBflatNote());
        chordStructure.setChordShapes(chordShapes);
        chordStructure.setChordDescription(description);

        return chordStructure;
    }

}
