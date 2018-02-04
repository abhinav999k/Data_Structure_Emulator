package com.example.abhin.estructuradedatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView textViewStack;
    private TextView textViewQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        textViewStack = (TextView)findViewById(R.id.textViewStack);
        textViewQueue = (TextView) findViewById(R.id.textViewQueue);
        textViewStack.setOnClickListener(this);
        textViewQueue.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.textViewStack : Intent intentStack = new Intent(this,StackDescription.class);
                this.startActivity(intentStack);
                break;
            case R.id.textViewQueue : Intent intentQueue = new Intent(this,QueueDescription.class);
                this.startActivity(intentQueue);
                break;
        }
    }
}
