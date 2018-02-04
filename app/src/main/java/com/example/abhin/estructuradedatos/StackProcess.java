package com.example.abhin.estructuradedatos;

import android.widget.Toast;

/**
 * Created by abhin on 05-02-2017.
 */
public class StackProcess {
    private final int MAX_SIZE = 10;
    private int top = -1;
    private int stack[] = new int[MAX_SIZE];
    public int push(int element){
        if(top == MAX_SIZE-1){
            return -1;
        }
        else{
            top += 1;
            stack[top] = element ;
            return 1;
        }
    }
    public int[] returnStack(){
        return stack;
    }
    public int getTop(){
        return top;
    }
    public int pop(){
        if(top == -1){
            return -999;
        }
        else{
            int val = stack[top];
            top -= 1;
            return val;
        }
    }
}
