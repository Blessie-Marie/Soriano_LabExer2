package com.soriano.blessie.soriano_labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class VerifySchool extends AppCompatActivity {

    SharedPreferences sp;
    EditText school;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_school);
        school = findViewById(R.id.school);
    }

    public void verifySchool(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
//        SharedPreferences.Editor editor = sp.edit();
        String u1SP = sp.getString("u1", null);
        String u2SP = sp.getString("u2", null);
        String u3SP = sp.getString("u3", null);
        String u4SP = sp.getString("u4", null);
        String u5SP = sp.getString("u5", null);
        String u6SP = sp.getString("u6", null);
        String u7SP = sp.getString("u7", null);
        String u8SP = sp.getString("u8", null);
//        editor.putString("u1", school1);
//        editor.putString("u2", school2);
//        editor.putString("u3", school3);
//        editor.putString("u4", school4);
//        editor.putString("u5", school5);
//        editor.putString("u6", school6);
//        editor.putString("u7", school7);
//        editor.putString("u8", school8);
        if (u1SP.equals(school.getText().toString()) || u2SP.equals(school.getText().toString()) || u3SP.equals(school.getText().toString()) ||u4SP.equals(school.getText().toString()) ||
                u5SP.equals(school.getText().toString()) ||u6SP.equals(school.getText().toString())||u7SP.equals(school.getText().toString()) || u8SP.equals(school.getText().toString())){
            Toast.makeText(this, "School is competing in UAAP", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "School is not part of UAAP", Toast.LENGTH_LONG).show();
        }
    }
}
