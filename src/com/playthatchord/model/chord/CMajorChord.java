package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.CNote;
import com.playthatchord.model.note.ENote;
import com.playthatchord.model.note.GNote;

public class CMajorChord {


    public ChordStructure create() {
        ChordStructure chordStructure = new ChordStructure();

        int[] fretsLocation1 = {
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.OPEN,
                ChordConstant.Fret._1,
                ChordConstant.Fret.OPEN,
                ChordConstant.Fret._2,
                ChordConstant.Fret._3,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames1 = {
                ChordConstant.Notes.E,
                ChordConstant.Notes.C,
                ChordConstant.Notes.G,
                ChordConstant.Notes.E,
                ChordConstant.Notes.C,
                ChordConstant.Notes.MUTE,
        };
        char[] fingerings1 = {
                ChordConstant.Fingering.OPEN,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.OPEN,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation1 = new ChordShape(fretsLocation1, noteNames1, fingerings1);




        int[] fretsLocation2 = {
                ChordConstant.Fret._8,
                ChordConstant.Fret._8,
                ChordConstant.Fret._8,
                ChordConstant.Fret._9,
                ChordConstant.Fret._10,
                ChordConstant.Fret._10,
                ChordConstant.Fret._8,
        };
        String[] noteNames2 = {
                ChordConstant.Notes.C,
                ChordConstant.Notes.G,
                ChordConstant.Notes.E,
                ChordConstant.Notes.C,
                ChordConstant.Notes.G,
                ChordConstant.Notes.C,
        };
        char[] fingerings2 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.INDEX
        };
        ChordShape variation2 = new ChordShape(fretsLocation2, noteNames2, fingerings2);



        int[] fretsLocation3 = {
                ChordConstant.Fret._3,
                ChordConstant.Fret._3,
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret._3,
                ChordConstant.Fret.MUTE,
        };
        String[] noteNames3 = {
                ChordConstant.Notes.G,
                ChordConstant.Notes.E,
                ChordConstant.Notes.C,
                ChordConstant.Notes.G,
                ChordConstant.Notes.C,
                ChordConstant.Notes.MUTE,
        };
        char[] fingerings3 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation3 = new ChordShape(fretsLocation3, noteNames3, fingerings3);



        int[] fretsLocation4 = {
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret._12,
                ChordConstant.Fret._13,
                ChordConstant.Fret._12,
                ChordConstant.Fret._10,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.MUTE,
        };
        String[] noteNames4 = {
                ChordConstant.Notes.E,
                ChordConstant.Notes.C,
                ChordConstant.Notes.G,
                ChordConstant.Notes.C,
                ChordConstant.Notes.MUTE,
                ChordConstant.Notes.MUTE,
        };
        char[] fingerings4 = {
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MUTE,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation4 = new ChordShape(fretsLocation4, noteNames4, fingerings4);



        int[] fretsLocation5 = {
                ChordConstant.Fret._5,
                ChordConstant.Fret._8,
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.MUTE,
        };
        String[] noteNames5 = {
                ChordConstant.Notes.C,
                ChordConstant.Notes.E,
                ChordConstant.Notes.C,
                ChordConstant.Notes.G,
                ChordConstant.Notes.MUTE,
                ChordConstant.Notes.MUTE,
        };
        char[] fingerings5 = {
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MUTE,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation5 = new ChordShape(fretsLocation5, noteNames5, fingerings5);



        ChordShape[] chordShapes = new ChordShape[]
                {variation1, variation2, variation3, variation4, variation5};

        chordStructure.setRootNote(new CNote());
        chordStructure.setThirdNote(new ENote());
        chordStructure.setFifthNote(new GNote());
        chordStructure.setChordShapes(chordShapes);

        return chordStructure;
    }
}
