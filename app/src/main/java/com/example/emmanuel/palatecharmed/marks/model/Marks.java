package com.example.emmanuel.palatecharmed.marks.model;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

import io.realm.RealmObject;

public class Marks extends RealmObject {

    @SerializedName("markId")
    private String markId = UUID.randomUUID().toString();

    @SerializedName("markName")
    private String markName;

    @SerializedName("markDescription")
    private String markDescription;


}
