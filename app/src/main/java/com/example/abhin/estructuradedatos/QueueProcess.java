package com.example.abhin.estructuradedatos;

/**
 * Created by abhin on 06-02-2017.
 */
public class QueueProcess {
    public final int MAX_SIZE = 10;
    private  int front = -1;
    private  int rear = -1;
    private int queue[] = new int[MAX_SIZE];
    public int enqueue(int value){
        if(isFull()){
            return -999;
        }
        if(front==-1)front=0;
        rear=(rear+1)% MAX_SIZE;
        queue[rear] = value;
        return 1;
    }
    public boolean isFull(){
        if((front==rear+1) || (front==0 && rear== MAX_SIZE-1)){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }
}
