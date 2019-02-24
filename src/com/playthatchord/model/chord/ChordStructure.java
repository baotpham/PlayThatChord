package com.playthatchord.model.chord;

import com.playthatchord.model.note.Note;


public class ChordStructure {

    private Note rootNote;
    private Note secondNote;
    private Note thirdNote;
    private Note fourthNote;
    private Note fifthNote;
    private Note sixthNote;
    private Note seventhNote;
    private Note eighthNote;
    private Note ninthNote;
    private Note tenthNote;
    private Note eleventhNote;
    private Note twelfthNote;
    private Note thirteenthNote;

    private ChordShape[] chordShapes;


    public Note getRootNote() {
        return rootNote;
    }

    public void setRootNote(Note rootNote) {
        this.rootNote = rootNote;
    }

    public Note getSecondNote() {
        return secondNote;
    }

    public void setSecondNote(Note secondNote) {
        this.secondNote = secondNote;
    }

    public Note getThirdNote() {
        return thirdNote;
    }

    public void setThirdNote(Note thirdNote) {
        this.thirdNote = thirdNote;
    }

    public Note getFourthNote() {
        return fourthNote;
    }

    public void setFourthNote(Note fourthNote) {
        this.fourthNote = fourthNote;
    }

    public Note getFifthNote() {
        return fifthNote;
    }

    public void setFifthNote(Note fifthNote) {
        this.fifthNote = fifthNote;
    }

    public Note getSixthNote() {
        return sixthNote;
    }

    public void setSixthNote(Note sixthNote) {
        this.sixthNote = sixthNote;
    }

    public Note getSeventhNote() {
        return seventhNote;
    }

    public void setSeventhNote(Note seventhNote) {
        this.seventhNote = seventhNote;
    }

    public Note getEighthNote() {
        return eighthNote;
    }

    public void setEighthNote(Note eighthNote) {
        this.eighthNote = eighthNote;
    }

    public Note getNinthNote() {
        return ninthNote;
    }

    public void setNinthNote(Note ninthNote) {
        this.ninthNote = ninthNote;
    }

    public Note getTenthNote() {
        return tenthNote;
    }

    public void setTenthNote(Note tenthNote) {
        this.tenthNote = tenthNote;
    }

    public Note getEleventhNote() {
        return eleventhNote;
    }

    public void setEleventhNote(Note eleventhNote) {
        this.eleventhNote = eleventhNote;
    }

    public Note getTwelfthNote() {
        return twelfthNote;
    }

    public void setTwelfthNote(Note twelfthNote) {
        this.twelfthNote = twelfthNote;
    }

    public Note getThirteenthNote() {
        return thirteenthNote;
    }

    public void setThirteenthNote(Note thirteenthNote) {
        this.thirteenthNote = thirteenthNote;
    }


    public ChordShape[] getChordShapes() {
        return this.chordShapes;
    }

    public void setChordShapes(ChordShape[] chordShapes) {
        this.chordShapes = chordShapes;
    }

}
