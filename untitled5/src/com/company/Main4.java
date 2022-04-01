package com.company;

public class Main4 {

    public static void main(String[] args){
        int q, w;
        w = 1;
        q = 10;
        for(int i = 1; i<= q; i++) {
            w = w *i;
        }
        System.out.println(q +"! = "+ w);

        int e;
        int p = 10;
        e = 10;
        q = 1;
        w = 1;
        while (w<=e){
            q*=w;
            w++;

        }
        System.out.println(p +"! = "+ q);
    }
}
