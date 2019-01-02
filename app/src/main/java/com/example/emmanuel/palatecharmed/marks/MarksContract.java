package com.example.emmanuel.palatecharmed.marks;

import android.view.View;

import com.example.emmanuel.palatecharmed.marks.model.Marks;

import java.util.ArrayList;

public interface MarksContract {

    interface view{
        void showNewMarkDialog(View view);
        void showMarkList(ArrayList<Marks> marksArrayList);
        void newMark(Marks mark);
    }

    interface presenter{
        void setNewMark(Marks mark);
        ArrayList<Marks> getMarkList();
    }

    interface model{
        void setMark(Marks mark);
        ArrayList<Marks> findAllMarks();
    }

}
