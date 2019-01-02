package com.example.emmanuel.palatecharmed;

import android.content.Intent;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .name("palateCharmed.realm")
                .build();
        Realm.setDefaultConfiguration(config);

    }
}
