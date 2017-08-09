package lt;

/**
 * Created by Lin Tao on 7/9/2017.
 */
public class ThunderStorm {
    public static void main(String[] args) throws InterruptedException {
        boolean thunderStorm = true;
        int day = 1;
        while (thunderStorm && day < 5) {
            System.out.println(day + " day:please stay in the dormitory");
            day++;
            Thread.sleep(1000);
        }
        System.out.println("Last day, I will come home");
    }

}
