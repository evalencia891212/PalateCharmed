package com.example.emmanuel.palatecharmed.marks.data;

import com.example.emmanuel.palatecharmed.marks.model.Marks;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class MarksData implements MarksDataContract {

    @Override
    public ArrayList<Marks> findMarkByName(String name) {
        return null;
    }

    @Override
    public ArrayList<Marks> findAllMarks() {
       RealmResults<Marks> marksRealmResults = Realm.getDefaultInstance().where(Marks.class)
               .findAll();

       ArrayList<Marks> marksArrayList = new ArrayList<>();
       marksArrayList.addAll(Realm.getDefaultInstance().copyFromRealm(marksRealmResults));

       return marksArrayList;
    }

    @Override
    public void deleteMark(String markId) {

    }

    @Override
    public void regMark(Marks mark) {
        Realm.getDefaultInstance().beginTransaction();
        Realm.getDefaultInstance().insertOrUpdate(mark);
        Realm.getDefaultInstance().commitTransaction();
        Realm.getDefaultInstance().close();
    }
}
