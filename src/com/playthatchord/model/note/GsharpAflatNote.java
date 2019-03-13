package com.playthatchord.model.note;

public class GsharpAflatNote extends SharpFlatNote {

    private String name;
    private int[][] notePositions;


    public GsharpAflatNote() {
        this.name = "<html>G#<br>Ab</html>";
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
