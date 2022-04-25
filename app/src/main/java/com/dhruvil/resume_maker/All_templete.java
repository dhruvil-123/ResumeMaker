package com.dhruvil.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class All_templete extends AppCompatActivity {

    Button back;
    ImageView resume1, resume2, resume3, resume4, resume5, resume6, resume7, resume8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_templete);

        String name = getIntent().getStringExtra("name");
        Toast.makeText(this, "Name" + name, Toast.LENGTH_SHORT).show();
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");
        String profession = getIntent().getStringExtra("profession");
        String language = getIntent().getStringExtra("language");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String grade = getIntent().getStringExtra("grade");
        String e_year = getIntent().getStringExtra("e_year");
        String objective = getIntent().getStringExtra("objective");
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
        String c_name = getIntent().getStringExtra("c_name");
        String c_weblink = getIntent().getStringExtra("c_weblink");

        Binding();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        resume1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this, Resume1.class);

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
                intent.putExtra("c_name", c_name);
                intent.putExtra("c_weblink", c_weblink);

                startActivity(intent);
            }
        });

        resume2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this, resume2.class);

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
                intent.putExtra("c_name", c_name);
                intent.putExtra("c_weblink", c_weblink);

                startActivity(intent);
            }
        });

        resume3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this, resume3.class);

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
                intent.putExtra("c_name", c_name);
                intent.putExtra("c_weblink", c_weblink);

                startActivity(intent);
            }
        });
        resume4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this, resume4.class);

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
                intent.putExtra("c_name", c_name);
                intent.putExtra("c_weblink", c_weblink);

                startActivity(intent);
            }
        });
        resume5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this, resume5.class);

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
                intent.putExtra("c_name", c_name);
                intent.putExtra("c_weblink", c_weblink);

                startActivity(intent);
            }
        });
        resume6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this, resume6.class);

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
                intent.putExtra("c_name", c_name);
                intent.putExtra("c_weblink", c_weblink);

                startActivity(intent);
            }
        });

        resume7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this, resume7.class);

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
                intent.putExtra("c_name", c_name);
                intent.putExtra("c_weblink", c_weblink);

                startActivity(intent);
            }
        });

        resume8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this, resume8.class);

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
                intent.putExtra("c_name", c_name);
                intent.putExtra("c_weblink", c_weblink);

                startActivity(intent);
            }
        });

    }

    private void Binding() {
        back = findViewById(R.id.back);
        resume1 = findViewById(R.id.resume1);
        resume2 = findViewById(R.id.resume2);
        resume3 = findViewById(R.id.resume3);
        resume4 = findViewById(R.id.resume4);
        resume5 = findViewById(R.id.resume5);
        resume6 = findViewById(R.id.resume6);
        resume7 = findViewById(R.id.resume7);
        resume8 = findViewById(R.id.resume8);
    }
}