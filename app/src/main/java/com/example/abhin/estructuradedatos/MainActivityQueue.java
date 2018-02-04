package com.example.abhin.estructuradedatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityQueue extends AppCompatActivity {
    private Button buttonEnqueue,buttonDequeue;
    private TextView textViewDisplayQueue;
    private EditText editTextInput;
    QueueProcess queueProcess = new QueueProcess();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_queue);
        buttonEnqueue = (Button)findViewById(R.id.buttonEnqueue);
        buttonDequeue =(Button)findViewById(R.id.buttonDequeue);
        textViewDisplayQueue =(TextView)findViewById(R.id.textViewDisplayQueue);
        editTextInput = (EditText) findViewById(R.id.editTextInput);
        buttonEnqueue.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int current,flag;
                Editable text = editTextInput.getText();
                current = Integer.parseInt(text.toString());
                flag = queueProcess.enqueue(current);
                if(flag == -999){
                    Toast.makeText(MainActivityQueue.this,"Cannot Enqueue coz Queue is Full",Toast.LENGTH_SHORT).show();
                }
                else  if(flag == 1){
                    Toast.makeText(MainActivityQueue.this,"Succefully Enqueued",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonDequeue.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Dequeue Functions
            }
        });
    }
}
