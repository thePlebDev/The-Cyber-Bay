package com.example.cyberbay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//IN MODEL VIEW CONTROLLER. THIS IS CONSIDERED A CONTROLLER.
//A CONTROLLER IS TYPICALLY A SUBCLASS OF ACTIVITY, FRAGMENT OR SERVICE
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // the view is the button that is getting clicked
                sendMessage(v);
            }
        });

    }


    // called when the user taps the Send button
    public void sendMessage(View view){
        //we are going to create the glue(intent) between the activities
        Intent intent = new Intent(this, DisplayScreenActivity.class);
        startActivity(intent);
    }
}