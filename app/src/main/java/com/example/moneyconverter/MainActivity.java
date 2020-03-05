package com.example.moneyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.btn1);
        e1=(EditText)findViewById(R.id.ed1);
        t1=(TextView)findViewById(R.id.tv1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double d1=Double.parseDouble(e1.getText().toString());
                Double dollar=71.72*d1;
                String toastmsg =""+dollar.toString()+"Rs.";
                t1.setText(toastmsg);
                Toast.makeText(MainActivity.this,toastmsg,Toast.LENGTH_LONG).show();
            }
        });



    }
    }

