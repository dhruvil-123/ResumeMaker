package com.dhruvil.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Objective extends AppCompatActivity {

    Button back, next;
    EditText objective_txt;
    String objective;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objective);

        String name = getIntent().getStringExtra("name");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");
        String profession = getIntent().getStringExtra("profession");
        String language = getIntent().getStringExtra("language");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String grade = getIntent().getStringExtra("grade");
        String e_year = getIntent().getStringExtra("e_year");
        String company = getIntent().getStringExtra("company");
        String job = getIntent().getStringExtra("job");
        String description = getIntent().getStringExtra("description");
        String year = getIntent().getStringExtra("year");
        String github = getIntent().getStringExtra("github");
        String linkdin = getIntent().getStringExtra("linkdin");
        String skill1 = getIntent().getStringExtra("skill1");
        String skill2 = getIntent().getStringExtra("skill2");
        String skill3 = getIntent().getStringExtra("skill3");
        String skill4 = getIntent().getStringExtra("skill4");

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

                objective = objective_txt.getText().toString();

                if (objective.isEmpty()) {
                    objective_txt.setError("Files can't be Empty");
                    objective_txt.requestFocus();
                } else {

                    Intent intent = new Intent(Objective.this, Refrence_detail.class);

                    intent.putExtra("name", name);
                    intent.putExtra("address", address);
                    intent.putExtra("email", email);
                    intent.putExtra("mobile", mobile);
                    intent.putExtra("profession", profession);
                    intent.putExtra("language", language);
                    intent.putExtra("course", course);
                    intent.putExtra("school", school);
                    intent.putExtra("grade", grade);
                    intent.putExtra("e_year", e_year);
                    intent.putExtra("objective", objective);
                    intent.putExtra("company", company);
                    intent.putExtra("job", job);
                    intent.putExtra("description", description);
                    intent.putExtra("year", year);
                    intent.putExtra("github", github);
                    intent.putExtra("linkdin", linkdin);
                    intent.putExtra("skill1", skill1);
                    intent.putExtra("skill2", skill2);
                    intent.putExtra("skill3", skill3);
                    intent.putExtra("skill4", skill4);

                    startActivity(intent);
                }
            }
        });

    }

    private void Binding() {
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        objective_txt = findViewById(R.id.objective);
    }
}