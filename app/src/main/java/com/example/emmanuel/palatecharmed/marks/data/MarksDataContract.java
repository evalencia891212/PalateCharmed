package com.example.emmanuel.palatecharmed.marks.data;

import com.example.emmanuel.palatecharmed.marks.model.Marks;

import java.util.ArrayList;

public interface MarksDataContract {

    ArrayList<Marks> findMarkByName(String name);

    ArrayList<Marks> findAllMarks();

    void deleteMark(String markId);

    void regMark(Marks mark);



}
