package com.company;

public class Main6 {
    public static void main(String[] args){
        int q,w,e,r;
        for(int t=99;t<=999;t++){
            q=t/100;
            w=t%100;
            for (int y=99;y<=999;y++){
                e=y/100;
                r=y%100;
                if (q+w == e+r){
                    System.out.println(q+""+w+""+e+""+r);
                }
            }

        }
    }
}
