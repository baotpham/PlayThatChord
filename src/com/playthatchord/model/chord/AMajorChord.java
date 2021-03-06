package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.*;

public class AMajorChord {

    public ChordStructure create() {

        ChordStructure chordStructure = new ChordStructure();


        int[] fretsLocation1 = {
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.OPEN,
                ChordConstant.Fret._2,
                ChordConstant.Fret._2,
                ChordConstant.Fret._2,
                ChordConstant.Fret.OPEN,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames1 = {
                ChordConstant.Notes.E,
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.A,
                ChordConstant.Notes.E,
                ChordConstant.Notes.A,
                ChordConstant.Notes.MUTE,
        };
        String[] fingerings1 = {
                ChordConstant.Fingering.OPEN,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.OPEN,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation1 = new ChordShape(fretsLocation1, noteNames1, fingerings1);



        int[] fretsLocation2 = {
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret._6,
                ChordConstant.Fret._7,
                ChordConstant.Fret._7,
                ChordConstant.Fret._5
        };
        String[] noteNames2 = {
                ChordConstant.Notes.A,
                ChordConstant.Notes.E,
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.A,
                ChordConstant.Notes.E,
                ChordConstant.Notes.A,
        };
        ChordShape variation2 = new ChordShape(fretsLocation2, noteNames2, ChordConstant.CommonMajorFingering.barChords_1);



        int[] fretsLocation3 = {
                ChordConstant.Fret._12,
                ChordConstant.Fret._12,
                ChordConstant.Fret._14,
                ChordConstant.Fret._14,
                ChordConstant.Fret._14,
                ChordConstant.Fret._12,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames3 = {
                ChordConstant.Notes.E,
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.A,
                ChordConstant.Notes.E,
                ChordConstant.Notes.A,
                ChordConstant.Notes.MUTE,
        };
        ChordShape variation3 = new ChordShape(fretsLocation3, noteNames3, ChordConstant.CommonMajorFingering.barChords_2);



        int[] fretsLocation4 = {
                ChordConstant.Fret._9,
                ChordConstant.Fret._9,
                ChordConstant.Fret._10,
                ChordConstant.Fret._9,
                ChordConstant.Fret._11,
                ChordConstant.Fret._12,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames4 = {
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.A,
                ChordConstant.Notes.E,
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.A,
                ChordConstant.Notes.MUTE,
        };
        ChordShape variation4 = new ChordShape(fretsLocation4, noteNames4, ChordConstant.CommonMajorFingering.cShapeLike);






        ChordShape[] chordShapes = new ChordShape[] {variation1, variation2, variation3, variation4};

        String description = "The A major chord consists of the three different tones A (1), C# (3) and E (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "You can get the tones of that major chord by going up from the root A to the major 3rd C# by moving up 4 frets (=2 whole-steps). Then you move up a minor 3rd (1 whole-step + 1 half-step = 3 frets) to E. Major 3rd + minor 3rd together result in a perfect 5th. So E is called the 5th of A.\n" +
                "\n" +
                "If you take a look at the intervals on the fretboard diagrams, you can see the root as 1, the major 3rd as 3 and the 5th as a 5. Only if the chord differs from that, additions are made to the chord symbol. A major chord is notated with just the root. In contrast a A minor chord is written Am or A-, because it has a minor 3rd C (m3) instead of the major 3rd C#. You may also find minor chords written with just the root as lowercase letter in older song books, but I would consider that way of writing as outdated and obsolete.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Major chords appear by nature on the 1st, 4th and 5th degree of a major scale by stacking two third over each note. The 1st, 4th and 5th degree of the major scale are called tonic, subdominat and dominant.\n" +
                "\n" +
                "That means that in a song in the key of A major you may find the chords A, D and E, a song in the key of D may be accompanied with the chords D, G and A and in a song in the key of E major you may hear the chords E, A and B. Many songs (especially in folk, african or reggae music) are solely accompanied by those three major chords.";

        chordStructure.setRootNote(new ANote());
        chordStructure.setThirdNote(new CsharpDflatNote());
        chordStructure.setFifthNote(new ENote());
        chordStructure.setChordShapes(chordShapes);
        chordStructure.setChordDescription(description);

        return chordStructure;
    }


}
