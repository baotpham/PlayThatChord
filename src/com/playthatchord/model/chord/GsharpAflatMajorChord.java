package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.*;

public class GsharpAflatMajorChord {

    public ChordStructure create() {

        ChordStructure chordStructure = new ChordStructure();


        int[] fretsLocation1 = {
                ChordConstant.Fret._4,
                ChordConstant.Fret._4,
                ChordConstant.Fret._4,
                ChordConstant.Fret._5,
                ChordConstant.Fret._6,
                ChordConstant.Fret._6,
                ChordConstant.Fret._4
        };
        String[] noteNames1 = {
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.C,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.GsAb,
        };
        ChordShape variation1 = new ChordShape(fretsLocation1, noteNames1, ChordConstant.CommonMajorFingering.barChords_1);



        int[] fretsLocation2 = {
                ChordConstant.Fret._11,
                ChordConstant.Fret._11,
                ChordConstant.Fret._13,
                ChordConstant.Fret._13,
                ChordConstant.Fret._13,
                ChordConstant.Fret._11,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames2 = {
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.C,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.MUTE,
        };
        ChordShape variation2 = new ChordShape(fretsLocation2, noteNames2, ChordConstant.CommonMajorFingering.barChords_2);



        int[] fretsLocation3 = {
                ChordConstant.Fret._8,
                ChordConstant.Fret._8,
                ChordConstant.Fret._9,
                ChordConstant.Fret._8,
                ChordConstant.Fret._10,
                ChordConstant.Fret._11,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames3 = {
                ChordConstant.Notes.C,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.C,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.MUTE,
        };
        ChordShape variation3 = new ChordShape(fretsLocation3, noteNames3, ChordConstant.CommonMajorFingering.cShapeLike);



        ChordShape[] chordShapes = new ChordShape[] {variation1, variation2, variation3};

        String description = "The G# major chord consists of the three different tones G# (1), C (3) and D# (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "You can get the tones of that major chord by going up from the root G# to the major 3rd C by moving up 4 frets (=2 whole-steps). Then you move up a minor 3rd (1 whole-step + 1 half-step = 3 frets) to D#. Major 3rd + minor 3rd together result in a perfect 5th. So D# is called the 5th of G#.\n" +
                "\n" +
                "If you take a look at the intervals on the fretboard diagrams, you can see the root as 1, the major 3rd as 3 and the 5th as a 5. Only if the chord differs from that, additions are made to the chord symbol. A major chord is notated with just the root. In contrast a G# minor chord is written G#m or G#-, because it has a minor 3rd B (m3) instead of the major 3rd C. You may also find minor chords written with just the root as lowercase letter in older song books, but I would consider that way of writing as outdated and obsolete.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Major chords appear by nature on the 1st, 4th and 5th degree of a major scale by stacking two third over each note. The 1st, 4th and 5th degree of the major scale are called tonic, subdominat and dominant.\n" +
                "\n" +
                "That means that in a song in the key of G# major you may find the chords G#, C# and D#, a song in the key of C# may be accompanied with the chords C#, F# and G# and in a song in the key of D# major you may hear the chords D#, G# and A#. Many songs (especially in folk, african or reggae music) are solely accompanied by those three major chords.\n\n\n\n\n" +
                "The Ab major chord consists of the three different tones Ab (1), C (3) and Eb (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "You can get the tones of that major chord by going up from the root Ab to the major 3rd C by moving up 4 frets (=2 whole-steps). Then you move up a minor 3rd (1 whole-step + 1 half-step = 3 frets) to Eb. Major 3rd + minor 3rd together result in a perfect 5th. So Eb is called the 5th of Ab.\n" +
                "\n" +
                "If you take a look at the intervals on the fretboard diagrams, you can see the root as 1, the major 3rd as 3 and the 5th as a 5. Only if the chord differs from that, additions are made to the chord symbol. A major chord is notated with just the root. In contrast a Ab minor chord is written Abm or Ab-, because it has a minor 3rd B (m3) instead of the major 3rd C. You may also find minor chords written with just the root as lowercase letter in older song books, but I would consider that way of writing as outdated and obsolete.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Major chords appear by nature on the 1st, 4th and 5th degree of a major scale by stacking two third over each note. The 1st, 4th and 5th degree of the major scale are called tonic, subdominat and dominant.\n" +
                "\n" +
                "That means that in a song in the key of Ab major you may find the chords Ab, Db and Eb, a song in the key of Db may be accompanied with the chords Db, Gb and Ab and in a song in the key of Eb major you may hear the chords Eb, Ab and Bb. Many songs (especially in folk, african or reggae music) are solely accompanied by those three major chords.";

        chordStructure.setRootNote(new GsharpAflatNote());
        chordStructure.setThirdNote(new CNote());
        chordStructure.setFifthNote(new DsharpEflatNote());
        chordStructure.setChordShapes(chordShapes);
        chordStructure.setChordDescription(description);

        return chordStructure;
    }

}
