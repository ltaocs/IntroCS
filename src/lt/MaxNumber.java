package lt;


import java.util.Random;

/**
 * Created by Lin Tao on 6/27/2017.
 */
public class MaxNumber {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random rand = new Random();
        for (int i=0; i<array.length;i++) {
            array[i]=rand.nextInt(10000);
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The max element in this array is "+ max);
    }


}
