package com.example.emmanuel.palatecharmed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.emmanuel.palatecharmed.marks.MarksActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.buttonCatMarcas)
    Button buttonCatMarcas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    public void startCatMarcas(View view){
        Intent MarksIntent = new Intent(this, MarksActivity.class);
        startActivity(MarksIntent);
    }



}
