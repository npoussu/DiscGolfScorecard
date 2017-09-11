package com.example.nks.discgolfscorecard;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class CourseBuilderActivity extends AppCompatActivity  {

    int lastShownItem;
    int duration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_builder);
        final String[] holes = {"Hole: 1", "Hole: 2", "Hole: 3", "Hole: 4", "Hole: 5", "Hole: 6", "Hole: 7", "Hole: 8", "Hole: 9", "Hole: 10", "Hole: 11", "Hole: 12",
                "Hole: 13", "Hole: 14", "Hole: 15", "Hole: 16", "Hole: 17", "Hole: 18"};
        ListAdapter CourseBuilderList = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, holes);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(CourseBuilderList);
        showAlertDialog();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                lastShownItem = i;
                Toast.makeText(CourseBuilderActivity.this, holes[lastShownItem], duration).show();
            }
        });
    }
    private void showAlertDialog() {
        FragmentManager fm = getSupportFragmentManager();
        CourseDialog alertDialog = CourseDialog.newInstance("Some title");
        alertDialog.show(fm, "fragment_alert");

    }
}
