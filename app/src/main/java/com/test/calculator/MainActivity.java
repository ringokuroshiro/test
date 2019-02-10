package com.test.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.calculator.R;

public class MainActivity extends AppCompatActivity {
    private TextView textview;

    Calculator cal = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textView);

        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);

        Button equ = (Button)findViewById(R.id.equ);
        Button div = (Button)findViewById(R.id.div);
        Button mul = (Button)findViewById(R.id.mul);
        Button sub = (Button)findViewById(R.id.sub);
        Button add = (Button)findViewById(R.id.add);
        Button ac = (Button)findViewById((R.id.ac));
        Button dot = (Button)findViewById(R.id.dot);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushZeo();
                textview.setText(cal.display());
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushOne();
                textview.setText(cal.display());

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushTwo();
                textview.setText(cal.display());

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushThree();
                textview.setText(cal.display());

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushFour();
                textview.setText(cal.display());

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushFive();
                textview.setText(cal.display());

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushSix();
                textview.setText(cal.display());

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushSeven();
                textview.setText(cal.display());

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushEight();
                textview.setText(cal.display());

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushNine();
                textview.setText(cal.display());

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushAdd();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushSub();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushMul();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushDiv();
            }
        });
        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushEqu();
                textview.setText(cal.display());

            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushAc();
                textview.setText(cal.display());

            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushAc();
                textview.setText(cal.display());

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.pushDot();
                textview.setText(cal.display());

            }
        });
    }
}
