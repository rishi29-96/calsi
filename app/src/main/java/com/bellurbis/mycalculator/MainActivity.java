package com.bellurbis.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    //we have created object here//
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonDot;
    Button buttonadd,buttonsub,buttonmul,buttondiv,buttonequal,buttonclr;
    EditText ed1;
    float res1,res2;
    boolean add,sub,mul,div,decimal;


    @Override
    //When an Activity first call or launched then onCreate(Bundle savedInstanceState) method is responsible to create the activity.//
    protected void onCreate(Bundle savedInstanceState) {
        // by calling  code in addition to the existing code in the onCreate() of the parent class.
        // If you leave out this line, then only your code is run. The existing code is ignored completely.
        super.onCreate(savedInstanceState);
        // It shows layout on screen.
        setContentView(R.layout.activity_main);
        //findViewById does nothing. It just looks through view hierarchy and returns reference to a view with requested viewId.
        // View is already created and exists. and here we have found our id.
        button1=(Button)findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button0=(Button) findViewById(R.id.button0);
        buttonDot=(Button) findViewById(R.id.buttondot);
        buttonadd=(Button) findViewById(R.id.buttonadd);
        buttonmul=(Button) findViewById(R.id.buttonmul);
        buttonsub=(Button) findViewById(R.id.buttonsub);
        buttondiv=(Button) findViewById(R.id.buttondiv);
        buttonequal=(Button) findViewById(R.id.buttonequal);
        buttonclr=(Button) findViewById(R.id.buttonclr);
        ed1=(EditText)findViewById(R.id.ed2);
        //to make it listen to the user's click.
        // onClick to execute actions after the user clicks the button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "1");
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            ed1.setText(ed1.getText()+"2");
            }


       });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"3");
            }


        });
        button4.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        ed1.setText(ed1.getText()+"4");
        }


        });
        button5.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        ed1.setText(ed1.getText()+"5");
        }


        });
        button6.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        ed1.setText(ed1.getText()+"6");
        }


        });
        button7.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        ed1.setText(ed1.getText()+"7");
        }


        });
        button8.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        ed1.setText(ed1.getText()+"8");
        }


        });
        button9.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        ed1.setText(ed1.getText()+"9");
        }


        });
        button0.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        ed1.setText(ed1.getText()+"0");
        }


        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    ed1.setText(ed1.getText() + ".");
                    decimal = true;
                }}



        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
    //if-else are the conditions
        if(ed1==null){
            ed1.setText("");
        }
        else{
            res1=Float.parseFloat(ed1.getText()+"");
            add=true;
            ed1.setText(null);
        }

        }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        if(ed1==null){
        ed1.setText("");
        }
        else{
        res1=Float.parseFloat(ed1.getText()+"");
        sub=true;
        ed1.setText(null);
        }

        }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
    //here we have given a if-else condition.here we have used if condition that ed1 is null then the text will blank.
        if(ed1==null){
        ed1.setText("");
        }
        //here we have used else condition that
        else{
        res1=Float.parseFloat(ed1.getText()+"");
        mul=true;
        ed1.setText(null);
        }

        }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        if(ed1==null){
        ed1.setText("");
        }
        else{
        res1=Float.parseFloat(ed1.getText()+"");
        mul=true;
        ed1.setText(null);
        }

        }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        if(ed1==null){
        ed1.setText("");
        }
        else{
        res1=Float.parseFloat(ed1.getText()+"");
        div=true;
        ed1.setText(null);
        }

        }
        });
        buttonequal.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View view){
    // returns a new float initialized to the value represented by the specified String.
        res2=Float.parseFloat(ed1.getText()+"");
        if(add==true){
        ed1.setText(res1+res2+"");
        add=false;
        }
        if(sub==true){
        ed1.setText(res1-res2+"");
        sub=false;
        }
        if(mul==true){
        ed1.setText(res1*res2+"");
        mul=false;
        }
        if(div==true){
        ed1.setText(res1/res2+"");
        div=false;
        }
        }
        });
        buttonclr.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View view){
             ed1.setText("");

        }


        });}}








