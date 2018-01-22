package com.company;


public class Fibonacci {

    public int a=0, b=1 ,c=0;
    public boolean tf = false;
    public Fibonacci(){

    }



    public boolean fibbage(int n) {

        if (c == n){
            tf = true;
        } else if(c < n){
            c = a + b;
            a = b;
            b = c;
            System.out.println(a);
            fibbage(n);
        } else {
            tf = false;
        }
        return tf;
    }


}
