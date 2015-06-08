package com.segmond;

public class TwoDimensions {

    public static void main(String[] args) {
        
        int[][] twodim = new int[][] { {1, 2, 3}, {4, 6, 8} };

        int d1 = twodim.length;
        int d2 = twodim[1].length;

        for (int i = 0; i < d1; i++) {
            for(int j = 0; j < d2; j++) {
                System.out.println(twodim[i][j]);
            }
        }
    }
}
