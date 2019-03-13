package com.playthatchord.model.note;

public class AsharpBflatNote extends SharpFlatNote {

    private String name;
    private int[][] notePositions;


    public AsharpBflatNote() {
        this.name = "<html>A#<br>Bb</html>";
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
