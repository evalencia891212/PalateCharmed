package com.example.emmanuel.palatecharmed.special.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Special extends RealmObject {

    @SerializedName("specialId")
    private String specialId;

    @SerializedName("specialName")
    private String specialName;

    @SerializedName("specialDescription")
    private String specialDescription;



}
