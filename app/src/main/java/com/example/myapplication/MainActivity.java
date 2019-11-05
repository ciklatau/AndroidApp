package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mytext = findViewById(R.id.mytext);
        mytext.setText("sdlkfslk");


        Button myButton = findViewById(R.id.button1);
        myButton.setOnClickListener(myListener);


        Context context = getApplicationContext();
        CharSequence text = "Button Clicked";
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);
        toast.show();


    }

    private View.OnClickListener myListener = new View.OnClickListener(){
        public void onClick(View v){
            TextView text = findViewById(R.id.mytext);
            text.setText(Double.toString(Math.random()*100));
            toast.show();
        }

    };
}
