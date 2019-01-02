package com.example.emmanuel.palatecharmed.marks;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.emmanuel.palatecharmed.R;
import com.example.emmanuel.palatecharmed.marks.model.Marks;

import java.util.ArrayList;

public class MarksActivity extends AppCompatActivity implements MarksContract.view ,View.OnClickListener, DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.marks_layout);

    }


    @Override
    public void showNewMarkDialog(View view) {
        View dialogView = View.inflate(this, R.layout.marks_detail_layout, null);


        AlertDialog dialog = new AlertDialog
                .Builder(this)
                .setView(dialogView)
                .setTitle(R.string.new_dialog_title)
                .setPositiveButton(R.string.add, this)
                .setNegativeButton(R.string.cancel, this)
                .create();

        dialog.show();
    }

    @Override
    public void showMarkList(ArrayList<Marks> marksArrayList) {

    }

    @Override
    public void newMark(Marks mark) {

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }

    @Override
    public void onClick(View v) {

    }
}
