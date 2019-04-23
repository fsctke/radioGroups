package com.example.radiobuttongroups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup myRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    myRadioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
            myRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {

                        case R.id.radioButton:

                            Toast.makeText(MainActivity.this, "button 1 checked", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.radioButton2:
                            Toast.makeText(MainActivity.this, "button 2 checked", Toast.LENGTH_SHORT).show();
                            break;

                    }
                }
            });
    }
}
