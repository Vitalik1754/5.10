package com.company;

public class Main {

    public static void main(String[] args) {
        int q, w, e, r, t, y;
        for (q = 0; q <= 24; q++) {
            w = q / 10;
            e = q % 10;
            for (r = 0; r <= 59; r++) {
                t = r % 10;
                y = r / 10;
                if (w==y & t==e) {
                    System.out.println(w+""+e+":"+t+""+y);
                }
            }
        }
    }
}
