package com.example.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1,num2;
    Button add,sub,mul,div;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.editText1);

        num2 = (EditText) findViewById(R.id.editText2);

        add = (Button) findViewById(R.id.Add);

        sub = (Button) findViewById(R.id.Sub);

        mul = (Button) findViewById(R.id.Mul);

        div = (Button) findViewById(R.id.Div);

        res = (TextView) findViewById(R.id.textView);
        // set a listener

        add.setOnClickListener(this);

        sub.setOnClickListener(this);

        mul.setOnClickListener(this);

        div.setOnClickListener(this);
    }
    public void onClick (View v)
    {
        float n1=0,n2=0,r=0;
        String oper="";
        if(TextUtils.isEmpty(num1.getText().toString())||TextUtils.isEmpty(num2.getText().toString()))
            return;
        n1=Float.parseFloat(num1.getText().toString());
        n2=Float.parseFloat(num2.getText().toString());
        switch(v.getId())
        {
            case R.id.Add:
                oper= "+";
                r=n1+n2;
                break;
            case R.id.Sub:
                oper="-";
                r=n1-n2;
                break;
            case R.id.Mul:
                oper="*";
                r=n1*n2;
                break;
            case R.id.Div:
                oper="/";
                r=n1/n2;
                break;
                default:break;


        }
        res.setText(n1+""+oper+""+n2+"="+r);
    }
}
