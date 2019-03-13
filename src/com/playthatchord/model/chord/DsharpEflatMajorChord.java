package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.*;

public class DsharpEflatMajorChord {

    public ChordStructure create() {

        ChordStructure chordStructure = new ChordStructure();


        int[] fretsLocation1 = {
                ChordConstant.Fret._6,
                ChordConstant.Fret._6,
                ChordConstant.Fret._8,
                ChordConstant.Fret._8,
                ChordConstant.Fret._8,
                ChordConstant.Fret._6,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames1 = {
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.G,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.MUTE,
        };
        String[] fingerings1 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation1 = new ChordShape(fretsLocation1, noteNames1, fingerings1);



        int[] fretsLocation2 = {
                ChordConstant.Fret._11,
                ChordConstant.Fret._11,
                ChordConstant.Fret._11,
                ChordConstant.Fret._12,
                ChordConstant.Fret._13,
                ChordConstant.Fret._13,
                ChordConstant.Fret._11
        };
        String[] noteNames2 = {
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.G,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.DsEb,
        };
        String[] fingerings2 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING
        };
        ChordShape variation2 = new ChordShape(fretsLocation2, noteNames2, fingerings2);



        int[] fretsLocation3 = {
                ChordConstant.Fret._3,
                ChordConstant.Fret._3,
                ChordConstant.Fret._4,
                ChordConstant.Fret._3,
                ChordConstant.Fret._5,
                ChordConstant.Fret._6,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames3 = {
                ChordConstant.Notes.G,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.G,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.MUTE,
        };
        String[] fingerings3 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation3 = new ChordShape(fretsLocation3, noteNames3, fingerings3);





        int[] fretsLocation4 = {
                ChordConstant.Fret._11,
                ChordConstant.Fret._11,
                ChordConstant.Fret._11,
                ChordConstant.Fret._12,
                ChordConstant.Fret._13,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.MUTE
        };
        String[] noteNames4 = {
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.AsBb,
                ChordConstant.Notes.G,
                ChordConstant.Notes.DsEb,
                ChordConstant.Notes.MUTE,
                ChordConstant.Notes.MUTE,
        };
        String[] fingerings4 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.MUTE,
                ChordConstant.Fingering.MUTE
        };
        ChordShape variation4 = new ChordShape(fretsLocation4, noteNames4, fingerings4);




        ChordShape[] chordShapes = new ChordShape[] {variation1, variation2, variation3, variation4};

        String description = "The D# major chord consists of the three different tones D# (1), G (3) and A# (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "You can get the tones of that major chord by going up from the root D# to the major 3rd G by moving up 4 frets (=2 whole-steps). Then you move up a minor 3rd (1 whole-step + 1 half-step = 3 frets) to A#. Major 3rd + minor 3rd together result in a perfect 5th. So A# is called the 5th of D#.\n" +
                "\n" +
                "If you take a look at the intervals on the fretboard diagrams, you can see the root as 1, the major 3rd as 3 and the 5th as a 5. Only if the chord differs from that, additions are made to the chord symbol. A major chord is notated with just the root. In contrast a D# minor chord is written D#m or D#-, because it has a minor 3rd F# (m3) instead of the major 3rd G. You may also find minor chords written with just the root as lowercase letter in older song books, but I would consider that way of writing as outdated and obsolete.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Major chords appear by nature on the 1st, 4th and 5th degree of a major scale by stacking two third over each note. The 1st, 4th and 5th degree of the major scale are called tonic, subdominat and dominant.\n" +
                "\n" +
                "That means that in a song in the key of D# major you may find the chords D#, G# and A#, a song in the key of G# may be accompanied with the chords G#, C# and D# and in a song in the key of A# major you may hear the chords A#, D# and F. Many songs (especially in folk, african or reggae music) are solely accompanied by those three major chords.\n" +
                "\n\n\n" +
                "The Eb major chord consists of the three different tones Eb (1), G (3) and Bb (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "You can get the tones of that major chord by going up from the root Eb to the major 3rd G by moving up 4 frets (=2 whole-steps). Then you move up a minor 3rd (1 whole-step + 1 half-step = 3 frets) to Bb. Major 3rd + minor 3rd together result in a perfect 5th. So Bb is called the 5th of Eb.\n" +
                "\n" +
                "If you take a look at the intervals on the fretboard diagrams, you can see the root as 1, the major 3rd as 3 and the 5th as a 5. Only if the chord differs from that, additions are made to the chord symbol. A major chord is notated with just the root. In contrast a Eb minor chord is written Ebm or Eb-, because it has a minor 3rd Gb (m3) instead of the major 3rd G. You may also find minor chords written with just the root as lowercase letter in older song books, but I would consider that way of writing as outdated and obsolete.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Major chords appear by nature on the 1st, 4th and 5th degree of a major scale by stacking two third over each note. The 1st, 4th and 5th degree of the major scale are called tonic, subdominat and dominant.\n" +
                "\n" +
                "That means that in a song in the key of Eb major you may find the chords Eb, Ab and Bb, a song in the key of Ab may be accompanied with the chords Ab, Db and Eb and in a song in the key of Bb major you may hear the chords Bb, Eb and F. Many songs (especially in folk, african or reggae music) are solely accompanied by those three major chords.";

        chordStructure.setRootNote(new DsharpEflatNote());
        chordStructure.setThirdNote(new GNote());
        chordStructure.setFifthNote(new AsharpBflatNote());
        chordStructure.setChordShapes(chordShapes);
        chordStructure.setChordDescription(description);

        return chordStructure;
    }
}
