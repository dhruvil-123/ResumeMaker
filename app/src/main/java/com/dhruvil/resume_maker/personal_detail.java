package com.dhruvil.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class personal_detail extends AppCompatActivity {

    Button next, back;
    EditText name_edt, address_edt, email_edt, mobile_edt, profession_edt, language_edt;
    String name, address, email, mobile, profession, language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detail);

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

                name = name_edt.getText().toString();
                address = address_edt.getText().toString();
                email = email_edt.getText().toString();
                mobile = mobile_edt.getText().toString();
                profession = profession_edt.getText().toString();
                language = language_edt.getText().toString();

                if (name.isEmpty()) {
                    name_edt.setError("Filed can't be Empty");
                    name_edt.requestFocus();
                } else if (email.isEmpty()) {
                    email_edt.setError("Filed can't be Empty");
                    email_edt.requestFocus();
                } else if (mobile.isEmpty()) {
                    mobile_edt.setError("Filed can't be Empty");
                    mobile_edt.requestFocus();
                } else if (email.isEmpty()) {
                    email_edt.setError("Filed can't be Empty");
                    email_edt.requestFocus();
                } else if (profession.isEmpty()) {
                    profession_edt.setError("Filed can't be Empty");
                    profession_edt.requestFocus();
                } else if (language.isEmpty()) {
                    language_edt.setError("Filed can't be Empty");
                    language_edt.requestFocus();
                } else {

                    Intent intent = new Intent(personal_detail.this, Education_detail.class);

                    intent.putExtra("name", name);
                    intent.putExtra("address", address);
                    intent.putExtra("email", email);
                    intent.putExtra("mobile", mobile);
                    intent.putExtra("profession", profession);
                    intent.putExtra("language", language);

                    startActivity(intent);
                }
            }
        });
    }

    private void Binding() {
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        name_edt = findViewById(R.id.name);
        address_edt = findViewById(R.id.address);
        email_edt = findViewById(R.id.email);
        mobile_edt = findViewById(R.id.mobile);
        profession_edt = findViewById(R.id.profession);
        language_edt = findViewById(R.id.language);
    }
}