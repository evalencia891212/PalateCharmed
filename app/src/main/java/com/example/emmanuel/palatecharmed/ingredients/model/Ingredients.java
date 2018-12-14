package com.example.emmanuel.palatecharmed.ingredients.model;

import com.example.emmanuel.palatecharmed.marks.model.Marks;
import com.google.gson.annotations.SerializedName;

import java.util.UUID;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Ingredients extends RealmObject {

    @PrimaryKey
    @SerializedName("ingredientId")
    public String ingredientId = UUID.randomUUID().toString();

    @SerializedName("name")
    public String name;

    @SerializedName("description")
    public String description;

    private RealmList<Marks> marksRealmList;

}
