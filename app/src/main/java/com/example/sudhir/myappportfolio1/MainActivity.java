package com.example.sudhir.myappportfolio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //@Override
    /** Called when the user touches the button */
    public void sendMessage(View view) {
        /* Do something in response to button click */
        switch(view.getId())
        {
            case R.id.btnss: Toast.makeText(this,"This button will launch spotify streamers app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnsa:Toast.makeText(this,"This button will launch scores app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnla: Toast.makeText(this,"This button will launch library app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnbb: Toast.makeText(this,"This button will launch build it bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnxr: Toast.makeText(this,"This button will launch xyz reader app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btncma: Toast.makeText(this,"This button will launch capstone create my own app", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }


    }

}