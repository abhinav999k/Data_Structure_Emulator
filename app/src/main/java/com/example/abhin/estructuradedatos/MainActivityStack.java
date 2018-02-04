package com.example.abhin.estructuradedatos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityStack extends AppCompatActivity {
    public Button buttonPush,buttonPop;
    public EditText editTextInput;
    public TextView textViewStackStatus;
    public Editable editableEditText;
    int current,returnCatch;
    public StackProcess stackprocess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_stack);
        stackprocess = new StackProcess();
        buttonPush = (Button)findViewById(R.id.buttonPush);
        editTextInput = (EditText)findViewById(R.id.editTextInput);
        textViewStackStatus =(TextView) findViewById(R.id.textViewStackStatus);
        Button buttonPop =(Button)findViewById(R.id.buttonPop);
        buttonPush.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editableEditText = editTextInput.getText();
                try {
                    current = Integer.parseInt((editableEditText.toString()));
                    returnCatch = stackprocess.push(current);
                    if(returnCatch == -1){
                        Toast.makeText(MainActivityStack.this,"[Stack is Full! Failed]",Toast.LENGTH_SHORT).show();
                    }
                    else if(returnCatch == 1){
                        Toast.makeText(MainActivityStack.this,"[Element inserted Successfully]",Toast.LENGTH_SHORT).show();
                    }
                    display();
                    editTextInput.setText("");
                }catch (NumberFormatException nfe){
                    Toast.makeText(MainActivityStack.this,"Text Field is empty!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonPop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               int returnValue = stackprocess.pop();
               if(returnValue == -999){
                   Toast.makeText(MainActivityStack.this,"[Stack is Empty! can't delete]",Toast.LENGTH_SHORT).show();
               }
               else {Toast.makeText(MainActivityStack.this,"["+ Integer.toString(returnValue) + " Is Popped out]",Toast.LENGTH_SHORT).show();}
               display();
            }
        });
    }
    void display(){
        int arr[] = stackprocess.returnStack();
        String display = "";
        for(int i=0;i<=stackprocess.getTop();i++){
                                                        //Log.d("This is array", Arrays.toString(arr));
            String temp = Integer.toString(arr[i]);
            display += ("["+ temp +"]" + " " );
        }
        display += "<-TOP";
        textViewStackStatus.setText(display);
                                                        //textViewStackStatus.setText(Arrays.toString(arr));

    }
}
