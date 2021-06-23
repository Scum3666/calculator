package com.example.alculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private EditText result;
    private AppCompatImageButton backspace;
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button8);
        result = findViewById(R.id.result);
        backspace = findViewById(R.id.imageButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("1");
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() > 1){
                    int preLastElement = result.getText().length()-2;
                    int lastElement = result.getText().length()-1;
                    String newText = result.getText().delete(preLastElement, lastElement).toString();
                    result.setText(newText);
                }else{
                    result.setText("0");
                }
            }
        });
    }
}
