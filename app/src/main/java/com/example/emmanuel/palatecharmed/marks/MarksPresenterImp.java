package com.example.emmanuel.palatecharmed.marks;

import com.example.emmanuel.palatecharmed.marks.model.Marks;

import java.util.ArrayList;

public class MarksPresenterImp implements MarksContract.presenter {

    MarksContract.view view;
    MarksContract.model model;

    public MarksPresenterImp(MarksContract.view view) {
        this.view = view;
        this.model = new MarksModelImpl(this);
    }

    @Override
    public void setNewMark(Marks mark) {

    }

    @Override
    public ArrayList<Marks> getMarkList() {
        return null;
    }
}
