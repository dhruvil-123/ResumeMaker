package com.dhruvil.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Education_detail extends AppCompatActivity {

    Button back, next;
    EditText course_edt, school_edt, grade_edt, year_edt;
    String course, school, grade, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_detail);

        String name = getIntent().getStringExtra("name");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");
        String profession = getIntent().getStringExtra("profession");
        String language = getIntent().getStringExtra("language");

        Binding();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                course = course_edt.getText().toString();
                school = school_edt.getText().toString();
                grade = grade_edt.getText().toString();
                year = year_edt.getText().toString();

                if (course.isEmpty()) {
                    course_edt.setError("Filed can't be Empty");
                    course_edt.requestFocus();
                } else if (school.isEmpty()) {
                    school_edt.setError("Filed can't be Empty");
                    school_edt.requestFocus();
                } else if (grade.isEmpty()) {
                    grade_edt.setError("Filed can't be Empty");
                    grade_edt.requestFocus();
                } else if (year.isEmpty()) {
                    year_edt.setError("Filed can't be Empty");
                    year_edt.requestFocus();
                } else {

                    Intent intent = new Intent(Education_detail.this, Experience_detail.class);

                    intent.putExtra("name", name);
                    intent.putExtra("address", address);
                    intent.putExtra("email", email);
                    intent.putExtra("mobile", mobile);
                    intent.putExtra("profession", profession);
                    intent.putExtra("language", language);
                    intent.putExtra("course", course);
                    intent.putExtra("school", school);
                    intent.putExtra("grade", grade);
                    intent.putExtra("e_year", year);

                    startActivity(intent);
                }
            }
        });

    }

    private void Binding() {
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        course_edt = findViewById(R.id.course);
        school_edt = findViewById(R.id.school);
        grade_edt = findViewById(R.id.grade);
        year_edt = findViewById(R.id.year);
    }
}