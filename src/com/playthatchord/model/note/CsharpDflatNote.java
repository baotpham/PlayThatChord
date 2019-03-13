package com.playthatchord.model.note;

public class CsharpDflatNote extends SharpFlatNote {

    private String name;
    private int[][] notePositions;


    public CsharpDflatNote() {
        this.name = "<html>C#<br>Db</html>";
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
