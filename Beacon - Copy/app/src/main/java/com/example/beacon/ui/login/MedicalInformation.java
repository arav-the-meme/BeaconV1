package com.example.beacon.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.oakridge.R;

public class MedicalInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medical_questions_guardian);
    }

    public void onClickUserMedicalInfo(View v){
        EditText nameField = findViewById(R.id.Name);
        EditText ageField = findViewById(R.id.age);
        EditText allergiesField = findViewById(R.id.allergiesinput);
        EditText heightField = findViewById(R.id.height);
        EditText weightField = findViewById(R.id.weight);
        EditText otherField = findViewById(R.id.addinfo);

        String Name = nameField.getText().toString();
        int Age = Integer.parseInt(ageField.getText().toString());
        double Weight = Integer.parseInt(weightField.getText().toString());
        String Allergies = allergiesField.toString();
        double Height = Integer.parseInt(heightField.getText().toString());
        String Other = otherField.toString();
    }
}