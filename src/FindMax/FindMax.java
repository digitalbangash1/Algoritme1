package FindMax;

import java.util.Arrays;

public class FindMax {





    public static void main(String[] args) {
        int[] A = new int[5];

        A[0] = 1;
        A[1] = 5;
        A[2] = 2;
        A[3] = 8;
        A[4] = 3;
        Arrays.sort(A);
        System.out.println("Max  = " + A[A.length-1]);
        System.out.println("Min =  " + A[0]);

    }
}
