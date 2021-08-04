package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import Helper.Helper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bEquals, bMinus, bPlus, bMultiply, bDiv, bSin, bCos, bLn, bDot, bAc, bC, bB1, bB2;
    TextView tvMain, tvSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0= findViewById(R.id.b0);
        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        b3= findViewById(R.id.b3);
        b4= findViewById(R.id.b4);
        b5= findViewById(R.id.b5);
        b6= findViewById(R.id.b6);
        b7= findViewById(R.id.b7);
        b8= findViewById(R.id.b8);
        b9= findViewById(R.id.b9);
        bEquals= findViewById(R.id.bequals);
        bMinus= findViewById(R.id.bminus);
        bPlus= findViewById(R.id.bplus);
        bMultiply= findViewById(R.id.bmulti);
        bDiv= findViewById(R.id.bdiv);
        bSin= findViewById(R.id.bsin);
        bCos= findViewById(R.id.bcos);
        bLn= findViewById(R.id.bln);
        bDot= findViewById(R.id.bdot);
        bAc= findViewById(R.id.bac);
        bC= findViewById(R.id.bc);
        bB1= findViewById(R.id.bb1);
        bB2= findViewById(R.id.bb2);

        tvMain = findViewById(R.id.tvMain);
        tvSec = findViewById(R.id.tvSec);

        // set onClick listeners

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bDot.setOnClickListener(this);
        bEquals.setOnClickListener(this);
        bMinus.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bMinus.setOnClickListener(this);
        bMultiply.setOnClickListener(this);
        bDiv.setOnClickListener(this);
        bSin.setOnClickListener(this);
        bCos.setOnClickListener(this);
        bLn.setOnClickListener(this);
        bAc.setOnClickListener(this);
        bC.setOnClickListener(this);
        bB1.setOnClickListener(this);
        bB2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.b1:
                tvMain.setText(tvMain.getText() + "1");
                break;
            case R.id.b2:
                tvMain.setText(tvMain.getText() + "2");
                break;
            case R.id.b3:
                tvMain.setText(tvMain.getText() + "3");
                break;
            case R.id.b4:
                tvMain.setText(tvMain.getText() + "4");
                break;
            case R.id.b5:
                tvMain.setText(tvMain.getText() + "5");
                break;
            case R.id.b6:
                tvMain.setText(tvMain.getText() + "6");
                break;
            case R.id.b7:
                tvMain.setText(tvMain.getText() + "7");
                break;
            case R.id.b8:
                tvMain.setText(tvMain.getText() + "8");
                break;
            case R.id.b9:
                tvMain.setText(tvMain.getText() + "9");
                break;
            case R.id.b0:
                tvMain.setText(tvMain.getText() + "0");
                break;
            case R.id.bdot:
                tvMain.setText(tvMain.getText() + ".");
                break;
            case R.id.bac:
                tvMain.setText("");
                tvSec.setText("");
                break;
            case R.id.bc:{
                 String val = tvMain.getText().toString();
                 val = val.substring(0, val.length() - 1);
                 tvMain.setText(val);
                break;
            }
            case R.id.bplus:
                tvMain.setText(tvMain.getText() + "+");
                break;
            case R.id.bminus:
                tvMain.setText(tvMain.getText() + "-");
                break;
            case R.id.bmulti:
                tvMain.setText(tvMain.getText() + "*");
                break;
            case R.id.bdiv:
                tvMain.setText(tvMain.getText() + "/");
                break;
            case R.id.bb1:
                tvMain.setText(tvMain.getText() + "(");
                break;
            case R.id.bb2:
                tvMain.setText(tvMain.getText() + ")");
                break;
            case R.id.bln:
                tvMain.setText(tvMain.getText() + "ln");
                break;
            case R.id.bsin:
                tvMain.setText(tvMain.getText() + "sin");
                break;
            case R.id.bcos:
                tvMain.setText(tvMain.getText() + "cos");
                break;
            case R.id.bequals:
                String val = tvMain.getText().toString();
                double result = Helper.evaluation(val);
                tvMain.setText(String.valueOf(result));
                tvSec.setText(val);
                break;
            default:
                break;

        }

    }
}