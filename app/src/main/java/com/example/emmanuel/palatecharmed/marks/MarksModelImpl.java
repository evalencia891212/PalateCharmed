package com.example.emmanuel.palatecharmed.marks;

import com.example.emmanuel.palatecharmed.marks.data.MarksData;
import com.example.emmanuel.palatecharmed.marks.data.MarksDataContract;
import com.example.emmanuel.palatecharmed.marks.model.Marks;

import java.util.ArrayList;

public class MarksModelImpl implements MarksContract.model {

    MarksContract.model model;
    MarksDataContract marksData;

    public MarksModelImpl(MarksContract.presenter presenter) {
        this.model = model;
        marksData = new MarksData();
    }

    @Override
    public void setMark(Marks mark) {
        marksData.regMark(mark);
    }

    @Override
    public ArrayList<Marks> findAllMarks() {
        return null;
    }
}
