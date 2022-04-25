package com.dhruvil.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resume5 extends AppCompatActivity {

    TextView email_txt,mobile_txt,address_txt,github_txt,linkdin_txt,name_txt,profession_txt,course_txt,school_txt,edu_year_txt,objective_txt,company_txt,year_txt,job_txt,description_txt,skill1_txt,skill2_txt,skill3_txt,skill4_txt,lang1_txt,c_name_txt,c_weblink_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume5);

        Binding();

        String name = getIntent().getStringExtra("name");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");
        String profession = getIntent().getStringExtra("profession");
        String language = getIntent().getStringExtra("language");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String edu_year = getIntent().getStringExtra("e_year");
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

        email_txt.setText(email);
        mobile_txt.setText(mobile);
        address_txt.setText(address);
        name_txt.setText(name);
        profession_txt.setText(profession);
        course_txt.setText(course);
        school_txt.setText(school);
        edu_year_txt.setText(edu_year);
        objective_txt.setText(objective);
        company_txt.setText(company);
        job_txt.setText(job);
        description_txt.setText(description);
        year_txt.setText(year);
        github_txt.setText(github);
        linkdin_txt.setText(linkdin);
        skill1_txt.setText(skill1);
        skill2_txt.setText(skill2);
        skill3_txt.setText(skill3);
        skill4_txt.setText(skill4);
        lang1_txt.setText(language);
        c_name_txt.setText(c_name);
        c_weblink_txt.setText(c_weblink);

    }

    private void Binding() {
        email_txt = findViewById(R.id.email);
        mobile_txt = findViewById(R.id.mobile);
        address_txt = findViewById(R.id.address);
        github_txt = findViewById(R.id.github);
        linkdin_txt = findViewById(R.id.linkdin);
        name_txt = findViewById(R.id.name);
        profession_txt = findViewById(R.id.profession);
        course_txt = findViewById(R.id.course);
        school_txt = findViewById(R.id.school);
        edu_year_txt = findViewById(R.id.edu_year);
        objective_txt = findViewById(R.id.objective);
        company_txt = findViewById(R.id.comapny);
        job_txt = findViewById(R.id.job);
        year_txt = findViewById(R.id.year);
        description_txt = findViewById(R.id.e_summary);
        skill1_txt = findViewById(R.id.skill1);
        skill2_txt = findViewById(R.id.skill2);
        skill3_txt = findViewById(R.id.skill3);
        skill4_txt = findViewById(R.id.skill4);
        lang1_txt = findViewById(R.id.lang1);
        c_name_txt = findViewById(R.id.c_name);
        c_weblink_txt = findViewById(R.id.c_weblink);
    }

}