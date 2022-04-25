package com.dhruvil.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Work_profile extends AppCompatActivity {

    Button back,next;
    EditText github_edt,linkdin_edt;
    String github,linkdin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_profile);

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
        String skill1 = getIntent().getStringExtra("skill1");
        String skill2 = getIntent().getStringExtra("skill2");
        String skill3 = getIntent().getStringExtra("skill3");
        String skill4 = getIntent().getStringExtra("skill4");

//        Toast.makeText(this, "work"+year, Toast.LENGTH_SHORT).show();

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

                github = github_edt.getText().toString();
                linkdin = linkdin_edt.getText().toString();

                Intent intent = new Intent(Work_profile.this,Objective.class);

                intent.putExtra("name",name);
                intent.putExtra("address",address);
                intent.putExtra("email",email);
                intent.putExtra("mobile",mobile);
                intent.putExtra("profession",profession);
                intent.putExtra("language",language);
                intent.putExtra("course",course);
                intent.putExtra("school",school);
                intent.putExtra("grade",grade);
                intent.putExtra("e_year",e_year);
                intent.putExtra("company",company);
                intent.putExtra("job",job);
                intent.putExtra("description",description);
                intent.putExtra("year",year);
                intent.putExtra("github",github);
                intent.putExtra("linkdin",linkdin);
                intent.putExtra("skill1",skill1);
                intent.putExtra("skill2",skill2);
                intent.putExtra("skill3",skill3);
                intent.putExtra("skill4",skill4);

                startActivity(intent);
            }
        });

    }

    private void Binding() {
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        github_edt = findViewById(R.id.github);
        linkdin_edt = findViewById(R.id.linkdin);
    }
}