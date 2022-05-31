package com.example.variiance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class EmployeesExample extends AppCompatActivity {

    ListView lvEmployeeNames;
    String[] employeesListNames;
    String[] employeesListTitles;
    Integer[] employeeImage={
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,
            R.drawable.variiancelogo,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employees_example);

        lvEmployeeNames = findViewById(R.id.employees_list_views);
        employeesListNames = getResources().getStringArray(R.array.employees_names); // get names from string file
        employeesListTitles = getResources().getStringArray(R.array.employees_titles); // get names from string file

        MyListAdapter adapter = new MyListAdapter(this,employeesListNames,employeesListTitles,employeeImage);
        lvEmployeeNames.setAdapter(adapter);
        lvEmployeeNames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(EmployeesExample.this, "you click on option 0", Toast.LENGTH_SHORT).show();
                }
                else if (position == 1){
                    Toast.makeText(EmployeesExample.this, "you click on option 1", Toast.LENGTH_SHORT).show();
                }
                else if (position == 2){
                    Toast.makeText(EmployeesExample.this, "you click on option 2", Toast.LENGTH_SHORT).show();
                }
                else if (position == 3){
                    Toast.makeText(EmployeesExample.this, "you click on option 3", Toast.LENGTH_SHORT).show();
                }
                else if (position == 4){
                    Toast.makeText(EmployeesExample.this, "you click on option 4", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}