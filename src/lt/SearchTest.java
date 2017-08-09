package lt;

/**
 * Created by Lin Tao on 6/28/2017.
 */
public class SearchTest {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        long runTime = endTime - startTime;
        System.out.println("Run Time: "+ runTime);

    }
}
