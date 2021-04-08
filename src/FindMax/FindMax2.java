package FindMax;

public class FindMax2 {

    static int array[] = {5, 7, 1, 0, 2, 4, 76, 43, 45};

    static int largest() {

        int max = array[0];

        for (int i = 1; i < array.length; i++)
            if (array[i] > max) max = array[i];
            return max;


        }

    public static void main(String[] args) {
        System.out.println("Maximum   ="  + largest());


    }


    }


