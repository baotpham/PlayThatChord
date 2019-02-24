package com.playthatchord.model.chord;

import com.playthatchord.model.note.Note;


public interface Chord {

    Note getRootNote();
    Note getThirdNote();
    Note getFifthNote();

}
