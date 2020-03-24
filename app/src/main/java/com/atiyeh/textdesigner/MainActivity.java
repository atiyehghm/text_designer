package com.atiyeh.textdesigner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        TextView shadow = findViewById(R.id.shadowsample);
        shadow.setVisibility(View.INVISIBLE);
        TextView blocky = findViewById(R.id.blockysample);
        blocky.setVisibility(View.INVISIBLE);
        TextView glow = findViewById(R.id.glowsample);
        glow.setVisibility(View.INVISIBLE);
        switch(view.getId()){
            case R.id.shadowradio:
                if(checked) {
                shadow.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.blockyradio:
                if(checked) {
                    blocky.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.glowradio:
                if(checked) {
                    glow.setVisibility(View.VISIBLE);
                }
                break;


        }
    }
}
