package com.example.ramyaramaraj.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bill_amount;
    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    TextView t1,t2,t3;
    String tip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (ImageButton) findViewById(R.id.rating1);
        b2 = (ImageButton) findViewById(R.id.rating2);
        b3 = (ImageButton) findViewById(R.id.rating3);
        bill_amount = (EditText) findViewById(R.id.enteredbill);
        t1=(TextView)findViewById(R.id.tippercent);
        t2=(TextView)findViewById(R.id.tiptotal);
        t3=(TextView)findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tip="10.00 % Tip Percent";
                t1.setText(tip);
                String s1=bill_amount.getText().toString();
                Double r1=Double.parseDouble(s1)/10;
                t2.setText("$" +r1.toString()+" Tip Total");
                Double a=Double.parseDouble(s1);
                Double output=a+r1;
                t3.setText("$"+output);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tip="15.00 % Tip Percent";
                t1.setText(tip);
                String s1=bill_amount.getText().toString();
                Double r1=Double.parseDouble(s1)/15;
                t2.setText("$" +r1.toString()+" Tip Total");
                Double a=Double.parseDouble(s1);
                Double output=a+r1;
                t3.setText("$"+output);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tip="20.00 % Tip Percent";
                t1.setText(tip);
                String s1=bill_amount.getText().toString();
                Double r1=Double.parseDouble(s1)/20;
                t2.setText("$" +r1.toString()+" Tip Total");
                Double a=Double.parseDouble(s1);
                Double output=a+r1;
                t3.setText("$"+output);
            }
        });
    }
}
