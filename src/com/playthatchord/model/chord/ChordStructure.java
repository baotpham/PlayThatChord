package com.playthatchord.model.chord;

import com.playthatchord.model.note.Note;


public class ChordStructure implements Chord{

    private Note rootNote;
    private Note thirdNote;
    private Note fifthNote;
    

    public ChordStructure(Note rootNote, Note thirdNote, Note fifthNote){
        this.rootNote = rootNote;
        this.thirdNote = thirdNote;
        this.fifthNote = fifthNote;
    }

    @Override
    public Note getRootNote() {
        return this.rootNote;
    }

    @Override
    public Note getThirdNote() {
        return this.thirdNote;
    }

    @Override
    public Note getFifthNote() {
        return this.fifthNote;
    }
}
