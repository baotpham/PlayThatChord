package com.playthatchord.model.note;

public class DsharpEflatNote extends SharpFlatNote {

    private String name;
    private int[][] notePositions;


    public DsharpEflatNote() {
        this.name = "<html>D#<br>Eb</html>";
        this.notePositions = getSharpFlatNotePositions();
    }


    @Override
    public int[][] getSharpFlatNotePositions() {
        return new int[0][];
    }

    @Override
    public String getNoteName() {
        return this.name;
    }

    @Override
    public int[][] getNotePositions() {
        return this.notePositions;
    }
}
