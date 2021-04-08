package FindMax;

public class FindMax3 {
    public static int findMax3() {
        int[] list = new int[9];
        list[0] = 4;
        list[1] = 6;
        list[2] = 10;
        list[3] = 12;
        list[4] = 98;
        list[5] = 66;
        list[6] = 35;
        list[7] = 19;
        list[8] = 9;

        int max = list[0];
        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax3());
    }

}
