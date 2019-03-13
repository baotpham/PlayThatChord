package com.playthatchord.model.note;

public class FsharpGflatNote extends SharpFlatNote {

    private String name;
    private int[][] notePositions;


    public FsharpGflatNote() {
        this.name = "<html>F#<br>Gb</html>";
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
