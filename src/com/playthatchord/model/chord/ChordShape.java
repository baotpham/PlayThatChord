package com.playthatchord.model.chord;

public class ChordShape {

    private int barFret;
    private int fretOnString1;
    private int fretOnString2;
    private int fretOnString3;
    private int fretOnString4;
    private int fretOnString5;
    private int fretOnString6;

    private char fingerOnString1;
    private char fingerOnString2;
    private char fingerOnString3;
    private char fingerOnString4;
    private char fingerOnString5;
    private char fingerOnString6;


    public ChordShape(
            int barFret,
            int fretOnString1,
            int fretOnString2,
            int fretOnString3,
            int fretOnString4,
            int fretOnString5,
            int fretOnString6,
            char fingerOnString1,
            char fingerOnString2,
            char fingerOnString3,
            char fingerOnString4,
            char fingerOnString5,
            char fingerOnString6
    ){

        this.barFret = barFret;
        this.fretOnString1 = fretOnString1;
        this.fretOnString2 = fretOnString2;
        this.fretOnString3 = fretOnString3;
        this.fretOnString4 = fretOnString4;
        this.fretOnString5 = fretOnString5;
        this.fretOnString6 = fretOnString6;

        this.fingerOnString1 = fingerOnString1;
        this.fingerOnString2 = fingerOnString2;
        this.fingerOnString3 = fingerOnString3;
        this.fingerOnString4 = fingerOnString4;
        this.fingerOnString5 = fingerOnString5;
        this.fingerOnString6 = fingerOnString6;
    }


    public int getBarFret() {
        return barFret;
    }


    public int getFretOnString1() {
        return fretOnString1;
    }

    public int getFretOnString2() {
        return fretOnString2;
    }

    public int getFretOnString3() {
        return fretOnString3;
    }

    public int getFretOnString4() {
        return fretOnString4;
    }

    public int getFretOnString5() {
        return fretOnString5;
    }

    public int getFretOnString6() {
        return fretOnString6;
    }

    public char getFingerOnString1() {
        return fingerOnString1;
    }

    public char getFingerOnString2() {
        return fingerOnString2;
    }

    public char getFingerOnString3() {
        return fingerOnString3;
    }

    public char getFingerOnString4() {
        return fingerOnString4;
    }

    public char getFingerOnString5() {
        return fingerOnString5;
    }

    public char getFingerOnString6() {
        return fingerOnString6;
    }
}
