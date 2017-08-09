package lt;


/**
 * Created by Lin Tao on 6/28/2017.
 */
public class LnearSearch {
    int LnearSearch(int arr[], int l, int r, int x) {
        for (int i = l; i < r; i++) {
            if (arr[i] == x) {
                System.out.println("Fount it, Insex = " + i);
            }
        }
        System.out.println("There is no this number");
        return -1;
    }

}
