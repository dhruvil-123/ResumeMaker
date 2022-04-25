package com.dhruvil.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Experience_detail extends AppCompatActivity {

    Button back, next;
    EditText company_txt, job_txt, description_txt, year_txt;
    String company, job, description, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience_detail);

        String name = getIntent().getStringExtra("name");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");
        String profession = getIntent().getStringExtra("profession");
        String language = getIntent().getStringExtra("language");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String grade = getIntent().getStringExtra("grade");
        String e_year = getIntent().getStringExtra("year");

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

                company = company_txt.getText().toString();
                job = job_txt.getText().toString();
                description = description_txt.getText().toString();
                year = year_txt.getText().toString();

                if (company.isEmpty()) {
                    company_txt.setError("Filed can't be Empty");
                    company_txt.requestFocus();
                } else if (job.isEmpty()) {
                    job_txt.setError("Filed can't be Empty");
                    job_txt.requestFocus();
                } else if (description.isEmpty()) {
                    description_txt.setError("Filed can't be Empty");
                    description_txt.requestFocus();
                } else if (year.isEmpty()) {
                    year_txt.setError("Filed can't be Empty");
                    year_txt.requestFocus();
                } else {

                    Intent intent = new Intent(Experience_detail.this, Skill.class);

                    intent.putExtra("name", name);
                    intent.putExtra("address", address);
                    intent.putExtra("email", email);
                    intent.putExtra("mobile", mobile);
                    intent.putExtra("profession", profession);
                    intent.putExtra("language", language);
                    intent.putExtra("course", course);
                    intent.putExtra("school", school);
                    intent.putExtra("grade", grade);
                    intent.putExtra("year", e_year);
                    intent.putExtra("company", company);
                    intent.putExtra("job", job);
                    intent.putExtra("description", description);
                    intent.putExtra("year", year);
//                Toast.makeText(Experience_detail.this, "year"+year, Toast.LENGTH_SHORT).show();

                    startActivity(intent);
                }
            }
        });

    }

    private void Binding() {
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        company_txt = findViewById(R.id.company);
        job_txt = findViewById(R.id.job);
        description_txt = findViewById(R.id.description);
        year_txt = findViewById(R.id.year);
    }
}