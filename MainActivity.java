package com.example.money;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.green;
import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private Button money_button;
    private TextView show_money;
    private TextView about_money;
    private Button toast_money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        money_button=(Button) findViewById(R.id.money_button);
        show_money=(TextView) findViewById(R.id.show_money);
        about_money=(TextView) findViewById(R.id.about_money);
        toast_money=(Button) findViewById(R.id.toast_money);

        //lets change the button title
        money_button.setText(R.string.make_it_rain);

        money_button.setOnClickListener(new View.OnClickListener() {
            int money;
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                money+=4000;
                show_money.setText("$ "+money);
                if(money>8000 && money<=50000){
                    about_money.setText("keep on");
                    about_money.setTextColor(Color.GREEN);
                }else if(money>=50000 && money<100000){
                    about_money.setText("bro,u made more than half");
                    about_money.setTextColor(Color.YELLOW);
                }else if(money>=100000 && money<=109000){
                    about_money.setText("no need to sell KIDNEY go and buy mac kid");
                    about_money.setTextColor(Color.BLUE);
                }else{
                    about_money.setText("congrats! mac is yours");
                    about_money.setTextColor(Color.GREEN);
                }
            }
        });

        toast_money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"It's raining money...",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
