package com.playthatchord.model.chord;

import com.playthatchord.model.constant.ChordConstant;
import com.playthatchord.model.note.CsharpDflatNote;
import com.playthatchord.model.note.FNote;
import com.playthatchord.model.note.GsharpAflatNote;

public class CsharpDflatMajorChord {

    public ChordStructure create() {
        ChordStructure chordStructure = new ChordStructure();

        int[] fretsLocation1 = {
                ChordConstant.Fret._4,
                ChordConstant.Fret._4,
                ChordConstant.Fret._6,
                ChordConstant.Fret._6,
                ChordConstant.Fret._6,
                ChordConstant.Fret._4,
                ChordConstant.Fret.MUTE,
        };
        String[] noteNames1 = {
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.F,
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.CsDb,
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
                ChordConstant.Fret._9,
                ChordConstant.Fret._9,
                ChordConstant.Fret._9,
                ChordConstant.Fret._10,
                ChordConstant.Fret._11,
                ChordConstant.Fret._11,
                ChordConstant.Fret._9,
        };
        String[] noteNames2 = {
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.F,
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.CsDb,
        };
        String[] fingerings2 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.INDEX
        };
        ChordShape variation2 = new ChordShape(fretsLocation2, noteNames2, fingerings2);



        int[] fretsLocation3 = {
                ChordConstant.Fret._1,
                ChordConstant.Fret._1,
                ChordConstant.Fret._2,
                ChordConstant.Fret._1,
                ChordConstant.Fret._3,
                ChordConstant.Fret._4,
                ChordConstant.Fret.MUTE,
        };
        String[] noteNames3 = {
                ChordConstant.Notes.F,
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.F,
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.MUTE,
        };
        String[] fingerings3 = {
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.MIDDLE,
                ChordConstant.Fingering.INDEX,
                ChordConstant.Fingering.RING,
                ChordConstant.Fingering.PINKY,
                ChordConstant.Fingering.MIDDLE
        };
        ChordShape variation3 = new ChordShape(fretsLocation3, noteNames3, fingerings3);



        int[] fretsLocation4 = {
                ChordConstant.Fret._9,
                ChordConstant.Fret._9,
                ChordConstant.Fret._9,
                ChordConstant.Fret._10,
                ChordConstant.Fret._11,
                ChordConstant.Fret.MUTE,
                ChordConstant.Fret.MUTE,
        };
        String[] noteNames4 = {
                ChordConstant.Notes.F,
                ChordConstant.Notes.CsDb,
                ChordConstant.Notes.GsAb,
                ChordConstant.Notes.F,
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
        ChordShape variation4= new ChordShape(fretsLocation4, noteNames4, fingerings4);




        ChordShape[] chordShapes = new ChordShape[] {variation1, variation2, variation3, variation4};

        String description = "The C# major chord consists of the three different tones C# (1), F (3) and G# (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "You can get the tones of that major chord by going up from the root C# to the major 3rd F by moving up 4 frets (=2 whole-steps). Then you move up a minor 3rd (1 whole-step + 1 half-step = 3 frets) to G#. Major 3rd + minor 3rd together result in a perfect 5th. So G# is called the 5th of C#.\n" +
                "\n" +
                "If you take a look at the intervals on the fretboard diagrams, you can see the root as 1, the major 3rd as 3 and the 5th as a 5. Only if the chord differs from that, additions are made to the chord symbol. A major chord is notated with just the root. In contrast a C# minor chord is written C#m or C#-, because it has a minor 3rd E (m3) instead of the major 3rd F. You may also find minor chords written with just the root as lowercase letter in older song books, but I would consider that way of writing as outdated and obsolete.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Major chords appear by nature on the 1st, 4th and 5th degree of a major scale by stacking two third over each note. The 1st, 4th and 5th degree of the major scale are called tonic, subdominat and dominant.\n" +
                "\n" +
                "That means that in a song in the key of C# major you may find the chords C#, F# and G#, a song in the key of F# may be accompanied with the chords F#, B and C# and in a song in the key of G# major you may hear the chords G#, C# and D#. Many songs (especially in folk, african or reggae music) are solely accompanied by those three major chords.\n\n\n" +
                "\n\n" +
                "The Db major chord consists of the three different tones Db (1), F (3) and Ab (5). In the chord shape on your guitar these tones can appear in any order and some of them may also appear more than once. The root is normally played as the lowest tone.\n" +
                "\n" +
                "You can get the tones of that major chord by going up from the root Db to the major 3rd F by moving up 4 frets (=2 whole-steps). Then you move up a minor 3rd (1 whole-step + 1 half-step = 3 frets) to Ab. Major 3rd + minor 3rd together result in a perfect 5th. So Ab is called the 5th of Db.\n" +
                "\n" +
                "If you take a look at the intervals on the fretboard diagrams, you can see the root as 1, the major 3rd as 3 and the 5th as a 5. Only if the chord differs from that, additions are made to the chord symbol. A major chord is notated with just the root. In contrast a Db minor chord is written Dbm or Db-, because it has a minor 3rd E (m3) instead of the major 3rd F. You may also find minor chords written with just the root as lowercase letter in older song books, but I would consider that way of writing as outdated and obsolete.\n" +
                "\n" +
                "When you stack 3rds on each note of a scale, you get the so called diatonic chords of that scale. Major chords appear by nature on the 1st, 4th and 5th degree of a major scale by stacking two third over each note. The 1st, 4th and 5th degree of the major scale are called tonic, subdominat and dominant.\n" +
                "\n" +
                "That means that in a song in the key of Db major you may find the chords Db, Gb and Ab, a song in the key of Gb may be accompanied with the chords Gb, B and Db and in a song in the key of Ab major you may hear the chords Ab, Db and Eb. Many songs (especially in folk, african or reggae music) are solely accompanied by those three major chords.";


        chordStructure.setRootNote(new CsharpDflatNote());
        chordStructure.setThirdNote(new FNote());
        chordStructure.setFifthNote(new GsharpAflatNote());
        chordStructure.setChordShapes(chordShapes);
        chordStructure.setChordDescription(description);

        return chordStructure;
    }
}
