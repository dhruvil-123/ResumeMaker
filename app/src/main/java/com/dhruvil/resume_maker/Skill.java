package com.dhruvil.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Skill extends AppCompatActivity {

    Button next, back, add;
    EditText skill1_edt, skill2_edt, skill3_edt, skill4_edt;
    String skill1, skill2, skill3, skill4;
    LinearLayout enter_input;
    List<TextInputLayout> inputs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

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

        Binding();

//        Add_Edittext();

//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Add_Edittext();
//
//            }
//        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                skill1 = skill1_edt.getText().toString();
                skill2 = skill2_edt.getText().toString();
                skill3 = skill3_edt.getText().toString();
                skill4 = skill4_edt.getText().toString();

                if (skill1.isEmpty()) {
                    skill1_edt.setError("Filed can't be Empty");
                    skill1_edt.requestFocus();
                } else if (skill2.isEmpty()) {
                    skill2_edt.setError("Filed can't be Empty");
                    skill2_edt.requestFocus();
                } else {

                    Intent intent = new Intent(Skill.this, Work_profile.class);

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
                    intent.putExtra("company", company);
                    intent.putExtra("job", job);
                    intent.putExtra("description", description);
                    intent.putExtra("year", year);
                    intent.putExtra("skill1", skill1);
                    intent.putExtra("skill2", skill2);
                    intent.putExtra("skill3", skill3);
                    intent.putExtra("skill4", skill4);

                    startActivity(intent);
                }
            }
        });

    }

    private void Add_Edittext() {
        LinearLayout main = new LinearLayout(Skill.this);
        main.setOrientation(LinearLayout.HORIZONTAL);
        URL iconURL = getClass().getResource(String.valueOf(R.drawable.img));
        ImageView icon = new ImageView(Skill.this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(30, 30);
        icon.setLayoutParams(params);
        icon.setImageResource(R.drawable.img);
        TextInputLayout layout = new TextInputLayout(Skill.this);
        TextInputEditText text = new TextInputEditText(Skill.this);
        layout.addView(text);
        inputs.add(layout);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                enter_input.removeView(inputs.get(inputs.size() - 1));
                inputs.remove(inputs.size() - 1);

            }
        });
        enter_input.addView(layout);
    }

    private void Binding() {
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        skill1_edt = findViewById(R.id.skill1);
        skill2_edt = findViewById(R.id.skill2);
        skill3_edt = findViewById(R.id.skill3);
        skill4_edt = findViewById(R.id.skill4);
        enter_input = findViewById(R.id.enter_input);
//        add = findViewById(R.id.add);
    }
}