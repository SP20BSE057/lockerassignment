package com.SP20_BSE_057_ASSI2.SP20_BSE_057;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,
            btn2,
            btn3,
            btn4,
            btn5,
            btn6,
            btn7,
            btn8,
            btn9,
            btnBack,
            btn0,
            btnOpen;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        addListeners();
    }
    public void initViews(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnBack = findViewById(R.id.btnBack);
        btn0 = findViewById(R.id.btn0);
        btnOpen = findViewById(R.id.btnOpen);
        textView=findViewById(R.id.tv);
    }

    public void addListeners() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("9");
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()>=1) {
                    StringBuffer sb = new StringBuffer(textView.getText().toString());
                    sb.deleteCharAt(sb.length() - 1);
                    textView.setText(sb);
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText("0");

            }
        });
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verify();
            }
        });
    }

    public void setText(String tv){
        if(textView.getText().toString().trim().length()<4) {
            textView.append(tv);
        }
    }
        public void verify(){
            if(textView.getText().toString().equals("1234")){
                Intent intent=new Intent(this,SecondActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Wrong Pin", Toast.LENGTH_SHORT).show();
            }
        }

}
