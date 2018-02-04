package com.example.abhin.estructuradedatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QueueDescription extends AppCompatActivity {
    private TextView textViewLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_description);
        textViewLink =(TextView)findViewById(R.id.textViewLink);
        textViewLink.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(QueueDescription.this,MainActivityQueue.class);
                startActivity(intent);
            }
        });
    }
}
