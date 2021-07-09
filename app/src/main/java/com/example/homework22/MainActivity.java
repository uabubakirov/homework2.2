package com.example.homework22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtValue;
    EditText etValue;
    Button btnChange;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValue = findViewById(R.id.txt_text);
        etValue = findViewById(R.id.et_value);
        btnChange = findViewById(R.id.btn_change);
        String value = etValue.getText().toString();

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = etValue.getText().toString();
                if(value.isEmpty()){
                   Toast.makeText(getApplicationContext(),"Введите текст",Toast.LENGTH_SHORT).show();

                }else{
                txtValue.setText(value);

            }}
        });


    }
}