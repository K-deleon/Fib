package com.company;


public class Fibonacci {

    public int fibNum = 1;
    public boolean tf = false;
    public Fibonacci(){

    }

    public boolean fibbage(int f){
        if(f==fibNum){
            tf = true;
        } else if(f > fibNum){
            fibbage(fibNum);
        } else {
            return false;
        }
        tf = false;
    }




}
