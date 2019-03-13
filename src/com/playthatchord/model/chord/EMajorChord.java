package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.*;

public class EMajorChord {

    public ChordStructure create() {

        ChordStructure chordStructure = new ChordStructure();


        int[] fretsLocation1 = {
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.OPEN,
                ChordConstant.Fret.OPEN,
                ChordConstant.Fret._1,
                ChordConstant.Fret._2,
                ChordConstant.Fret._2,
                ChordConstant.Fret.OPEN
        };
        String[] noteNames1 = {
                ChordConstant.Notes.E,
                ChordConstant.Notes.B,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.E,
                ChordConstant.Notes.B,
                ChordConstant.Notes.E,
        };
        String[] fingerings1 = {
                ChordConstant.Fingering.OPEN,
                ChordConstant.Fingering.OPEN,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.OPEN
        };
        ChordShape variation1 = new ChordShape(fretsLocation1, noteNames1, fingerings1);



        int[] fretsLocation2 = {
                ChordConstant.Fret._7,
                ChordConstant.Fret._7,
                ChordConstant.Fret._9,
                ChordConstant.Fret._9,
                ChordConstant.Fret._9,
                ChordConstant.Fret._7,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames2 = {
                ChordConstant.Notes.B,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.E,
                ChordConstant.Notes.B,
                ChordConstant.Notes.E,
                ChordConstant.Notes.MUTE,
        };
        String[] fingerings2 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation2 = new ChordShape(fretsLocation2, noteNames2, fingerings2);



        int[] fretsLocation3 = {
                ChordConstant.Fret._12,
                ChordConstant.Fret._12,
                ChordConstant.Fret._12,
                ChordConstant.Fret._13,
                ChordConstant.Fret._14,
                ChordConstant.Fret._14,
                ChordConstant.Fret._12
        };
        String[] noteNames3 = {
                ChordConstant.Notes.E,
                ChordConstant.Notes.B,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.E,
                ChordConstant.Notes.B,
                ChordConstant.Notes.E,
        };
        String[] fingerings3 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.INDEX
        };
        ChordShape variation3 = new ChordShape(fretsLocation3, noteNames3, fingerings3);



        int[] fretsLocation4 = {
                ChordConstant.Fret._4,
                ChordConstant.Fret._4,
                ChordConstant.Fret._5,
                ChordConstant.Fret._4,
                ChordConstant.Fret._6,
                ChordConstant.Fret._7,
                ChordConstant.Fret.OPEN
        };
        String[] noteNames4 = {
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.E,
                ChordConstant.Notes.B,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.E,
                ChordConstant.Notes.E,
        };
        String[] fingerings4 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.OPEN
        };
        ChordShape variation4 = new ChordShape(fretsLocation4, noteNames4, fingerings4);



        int[] fretsLocation5 = {
                ChordConstant.Fret._12,
                ChordConstant.Fret._12,
                ChordConstant.Fret._12,
                ChordConstant.Fret._13,
                ChordConstant.Fret._14,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames5 = {
                ChordConstant.Notes.E,
                ChordConstant.Notes.B,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.E,
                ChordConstant.Notes.MUTE,
                ChordConstant.Notes.MUTE,
        };
        String[] fingerings5 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MUTE,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation5 = new ChordShape(fretsLocation5, noteNames5, fingerings5);





        ChordShape[] chordShapes = new ChordShape[] {variation1, variation2, variation3, variation4, variation5};

        String description = "The E major chord consists of the three different tones E (1), G# (3) and B (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "You can get the tones of that major chord by going up from the root E to the major 3rd G# by moving up 4 frets (=2 whole-steps). Then you move up a minor 3rd (1 whole-step + 1 half-step = 3 frets) to B. Major 3rd + minor 3rd together result in a perfect 5th. So B is called the 5th of E.\n" +
                "\n" +
                "If you take a look at the intervals on the fretboard diagrams, you can see the root as 1, the major 3rd as 3 and the 5th as a 5. Only if the chord differs from that, additions are made to the chord symbol. A major chord is notated with just the root. In contrast a E minor chord is written Em or E-, because it has a minor 3rd G (m3) instead of the major 3rd G#. You may also find minor chords written with just the root as lowercase letter in older song books, but I would consider that way of writing as outdated and obsolete.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Major chords appear by nature on the 1st, 4th and 5th degree of a major scale by stacking two third over each note. The 1st, 4th and 5th degree of the major scale are called tonic, subdominat and dominant.\n" +
                "\n" +
                "That means that in a song in the key of E major you may find the chords E, A and B, a song in the key of A may be accompanied with the chords A, D and E and in a song in the key of B major you may hear the chords B, E and F#. Many songs (especially in folk, african or reggae music) are solely accompanied by those three major chords.";

        chordStructure.setRootNote(new ENote());
        chordStructure.setThirdNote(new GsharpAflatNote());
        chordStructure.setFifthNote(new BNote());
        chordStructure.setChordShapes(chordShapes);
        chordStructure.setChordDescription(description);

        return chordStructure;
    }

}
