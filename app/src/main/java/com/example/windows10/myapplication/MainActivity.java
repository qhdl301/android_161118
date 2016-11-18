package com.example.windows10.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2;
    CheckBox cb1;
    RadioGroup rbg1;
    RadioButton rb1,rb2,rb3;
    Button bt1;
    ImageView iv1;
    LinearLayout l1;
    Image dog,cat,bunny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        cb1=(CheckBox)findViewById(R.id.checkBox);
        rbg1=(RadioGroup)findViewById(R.id.radioGroup1);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        bt1=(Button)findViewById(R.id.button);
        iv1=(ImageView)findViewById(R.id.imageView3);
        l1=(LinearLayout)findViewById(R.id.linear);





        cb1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b) {
                    l1.setVisibility(View.VISIBLE);
                }
                else{
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });

        bt1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb1.isChecked()){
                    iv1.setImageResource(R.drawable.dog);
                }
                else if(rb2.isChecked()){
                    iv1.setImageResource(R.drawable.cat);
                }
                else if(rb3.isChecked()){
                    iv1.setImageResource(R.drawable.bunny);
                }
            }
        });
    }

}
