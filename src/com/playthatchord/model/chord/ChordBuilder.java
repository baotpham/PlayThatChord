package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.CNote;
import com.playthatchord.model.note.ENote;
import com.playthatchord.model.note.GNote;

public class ChordBuilder {


    public ChordStructure createCMajorChord() {
        ChordStructure chordStructure = new ChordStructure();

        ChordShape variation1 = new ChordShape(
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.OPEN,
                ChordConstant.Fret._1,
                ChordConstant.Fret.OPEN,
                ChordConstant.Fret._2,
                ChordConstant.Fret._3,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fingering.OPEN,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.OPEN,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MUTE
        );

        ChordShape variation2 = new ChordShape(
                ChordConstant.Fret._8,
                ChordConstant.Fret._8,
                ChordConstant.Fret._8,
                ChordConstant.Fret._9,
                ChordConstant.Fret._10,
                ChordConstant.Fret._10,
                ChordConstant.Fret._8,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.INDEX
        );

        ChordShape variation3 = new ChordShape(
                ChordConstant.Fret._3,
                ChordConstant.Fret._3,
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret._3,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MUTE
        );

        ChordShape variation4 = new ChordShape(
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret._12,
                ChordConstant.Fret._13,
                ChordConstant.Fret._12,
                ChordConstant.Fret._10,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MUTE,
                ChordConstant.Fingering.MUTE
        );

        ChordShape variation5 = new ChordShape(
                ChordConstant.Fret._5,
                ChordConstant.Fret._8,
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret._5,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MUTE,
                ChordConstant.Fingering.MUTE
        );


        ChordShape[] chordShapes = new ChordShape[]
                {variation1, variation2, variation3, variation4, variation5};

        chordStructure.setRootNote(new CNote());
        chordStructure.setThirdNote(new ENote());
        chordStructure.setFifthNote(new GNote());
        chordStructure.setChordShapes(chordShapes);

        return chordStructure;
    }
}
