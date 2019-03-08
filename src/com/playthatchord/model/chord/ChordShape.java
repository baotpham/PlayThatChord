package com.playthatchord.model.chord;



public class ChordShape {

    /*
     * frets Location   = [ bar, string1, string2, string3, string4, string5, string6 ]
     * noteNames        = [ string1, string2, string3, string4, string5, string6 ]
     * fingerings       = [ string1, string2, string3, string4, string5, string6 ]
     */
    private int[] fretsLocation;
    private String[] noteNames;
    private String[] fingerings;



    public ChordShape(int[] fretsLocation, String[] noteNames, String[] fingerings) {
        if ( fretsLocation.length != 7 ) {
            System.out.println("Error: fretsLocation does not meet 7 length");
        } else if ( noteNames.length != 6 ) {
            System.out.println("Error: noteNames does not meet 6 length");
        } else if ( fingerings.length != 6 ) {
            System.out.println("Error: fingerings does not meet 6 length");
        } else {
            this.fretsLocation = fretsLocation;
            this.noteNames = noteNames;
            this.fingerings = fingerings;
        }
    }




    /* Get frets */

    public int[] getFretsLocation() {
        return this.fretsLocation;
    }

    public int getBarFret() {
        return this.fretsLocation[0];
    }

    public int getFretOnString1() {
        return this.fretsLocation[1];
    }

    public int getFretOnString2() {
        return this.fretsLocation[2];
    }

    public int getFretOnString3() {
        return this.fretsLocation[3];
    }

    public int getFretOnString4() {
        return this.fretsLocation[4];
    }

    public int getFretOnString5() {
        return this.fretsLocation[5];
    }

    public int getFretOnString6() {
        return this.fretsLocation[6];
    }



    /* Get notes */

    public String[] getNoteNames() {
        return  this.noteNames;
    }

    public String getNoteOnString1() {
        return this.noteNames[0];
    }

    public String getNoteOnString2() {
        return this.noteNames[1];
    }

    public String getNoteOnString3() {
        return this.noteNames[2];
    }

    public String getNoteOnString4() {
        return this.noteNames[3];
    }

    public String getNoteOnString5() {
        return this.noteNames[4];
    }

    public String getNoteOnString6() {
        return this.noteNames[5];
    }



    /* Get fingering */

    public String[] getFingerings() {
        return this.fingerings;
    }

    public String getFingerOnString1() {
        return this.fingerings[0];
    }

    public String getFingerOnString2() {
        return this.fingerings[1];
    }

    public String getFingerOnString3() {
        return this.fingerings[2];
    }

    public String getFingerOnString4() {
        return this.fingerings[3];
    }

    public String getFingerOnString5() {
        return this.fingerings[4];
    }

    public String getFingerOnString6() {
        return this.fingerings[5];
    }
}
