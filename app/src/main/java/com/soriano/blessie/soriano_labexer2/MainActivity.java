package com.soriano.blessie.soriano_labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3, et4, et5, et6, et7, et8;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.u1);
        et2 = findViewById(R.id.u2);
        et3 = findViewById(R.id.u3);
        et4 = findViewById(R.id.u4);
        et5 = findViewById(R.id.u5);
        et6 = findViewById(R.id.u6);
        et7 = findViewById(R.id.u7);
        et8 = findViewById(R.id.u8);
    }

    public void saveData(View v){
        // SharedPreferences
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String school1 = et1.getText().toString();
        String school2 = et2.getText().toString();
        String school3 = et3.getText().toString();
        String school4 = et4.getText().toString();
        String school5 = et5.getText().toString();
        String school6 = et6.getText().toString();
        String school7 = et7.getText().toString();
        String school8 = et8.getText().toString();
        editor.putString("u1", school1);
        editor.putString("u2", school2);
        editor.putString("u3", school3);
        editor.putString("u4", school4);
        editor.putString("u5", school5);
        editor.putString("u6", school6);
        editor.putString("u7", school7);
        editor.putString("u8", school8);
        editor.commit();
        Toast.makeText(this, "Data was saved in data1.xml", Toast.LENGTH_LONG).show();
    }


    public void next(View v){
        Intent i = new Intent(this, VerifySchool.class);
        startActivity(i);
    }
}
