package com.example.a100372147.drinkngame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TapTwentyOne extends AppCompatActivity {

    TextView tv_tapCounter;
    Button btn_reset;
    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_twenty_one);

        tv_tapCounter = (TextView) findViewById(R.id.tv_tapCounter);
        btn_reset = (Button)findViewById(R.id.btn_reset);

        btn_reset.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                clicks = 0;
                tv_tapCounter.setText("" + clicks);
            }
        });

        tv_tapCounter.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view)
            {
                if (clicks == 20)
                {
                    tv_tapCounter.setText("DRINK");
                }
                else
                {
                    clicks++;
                    tv_tapCounter.setText("" + clicks);
                }
            }
        });

    }
}
