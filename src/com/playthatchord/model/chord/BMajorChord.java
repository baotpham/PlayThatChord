package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.*;

public class BMajorChord {

    public ChordStructure create() {

        ChordStructure chordStructure = new ChordStructure();


        int[] fretsLocation1 = {
                ChordConstant.Fret._2,
                ChordConstant.Fret._2,
                ChordConstant.Fret._4,
                ChordConstant.Fret._4,
                ChordConstant.Fret._4,
                ChordConstant.Fret._2,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames1 = {
                ChordConstant.Notes.FsGb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.B,
                ChordConstant.Notes.FsGb,
                ChordConstant.Notes.B,
                ChordConstant.Notes.MUTE,
        };
        ChordShape variation1 = new ChordShape(fretsLocation1, noteNames1, ChordConstant.CommonMajorFingering.barChords_2);


        int[] fretsLocation2 = {
                ChordConstant.Fret._7,
                ChordConstant.Fret._7,
                ChordConstant.Fret._7,
                ChordConstant.Fret._8,
                ChordConstant.Fret._9,
                ChordConstant.Fret._9,
                ChordConstant.Fret._7
        };
        String[] noteNames2 = {
                ChordConstant.Notes.B,
                ChordConstant.Notes.FsGb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.B,
                ChordConstant.Notes.FsGb,
                ChordConstant.Notes.B,
        };
        ChordShape variation2 = new ChordShape(fretsLocation2, noteNames2, ChordConstant.CommonMajorFingering.barChords_1);




        ChordShape[] chordShapes = new ChordShape[] {variation1, variation2};

        String description = "The B major chord consists of the three different tones B (1), D# (3) and F# (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "You can get the tones of that major chord by going up from the root B to the major 3rd D# by moving up 4 frets (=2 whole-steps). Then you move up a minor 3rd (1 whole-step + 1 half-step = 3 frets) to F#. Major 3rd + minor 3rd together result in a perfect 5th. So F# is called the 5th of B.\n" +
                "\n" +
                "If you take a look at the intervals on the fretboard diagrams, you can see the root as 1, the major 3rd as 3 and the 5th as a 5. Only if the chord differs from that, additions are made to the chord symbol. A major chord is notated with just the root. In contrast a B minor chord is written Bm or B-, because it has a minor 3rd D (m3) instead of the major 3rd D#. You may also find minor chords written with just the root as lowercase letter in older song books, but I would consider that way of writing as outdated and obsolete.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Major chords appear by nature on the 1st, 4th and 5th degree of a major scale by stacking two third over each note. The 1st, 4th and 5th degree of the major scale are called tonic, subdominat and dominant.\n" +
                "\n" +
                "That means that in a song in the key of B major you may find the chords B, E and F#, a song in the key of E may be accompanied with the chords E, A and B and in a song in the key of F# major you may hear the chords F#, B and C#. Many songs (especially in folk, african or reggae music) are solely accompanied by those three major chords.";

        chordStructure.setRootNote(new BNote());
        chordStructure.setThirdNote(new DsharpEflatNote());
        chordStructure.setFifthNote(new FsharpGflatNote());
        chordStructure.setChordShapes(chordShapes);
        chordStructure.setChordDescription(description);

        return chordStructure;
    }

}
