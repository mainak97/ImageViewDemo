package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch s;
    ImageView i;
    RadioGroup r;
    ImageButton ib;
    String TAG="Mainak";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.main_switch_s);
        i=findViewById(R.id.main_image_iv);
        r=findViewById(R.id.radioGroup);
        ib=findViewById(R.id.main_image_ib);
    }

    public void refresh(View view) {
        if(s.isChecked())
            i.setVisibility(View.VISIBLE);
        else
            i.setVisibility(View.INVISIBLE);
        RadioButton temp=findViewById(r.getCheckedRadioButtonId());
        ib.setClickable(temp.getText().toString().equals("Enabled"));
    }
}
