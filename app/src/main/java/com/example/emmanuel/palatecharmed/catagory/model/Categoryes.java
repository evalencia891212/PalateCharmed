package com.example.emmanuel.palatecharmed.catagory.model;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

import io.realm.RealmObject;

public class Categoryes extends RealmObject {

    @SerializedName("categiryId")
    private String categiryId = UUID.randomUUID().toString();

    @SerializedName("categoryName")
    private String categoryName;


}
