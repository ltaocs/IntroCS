package lt;

import java.util.Random;

/**
 * 365 days
 * for if present attending class times
 * Created by Lin Tao on 6/16/2017.
 */
public class AttendClass {
    public static void main(String[] args) {
        //int[] days = {1, 2, 3, 4, 5, 6, 7}; //Use Number 1, rather than "one"
        int[] days = new int[365];
        for (int i = 0; i <= 364; i++) {
            days[i] = i + 1;
            System.out.print(days[i] + " ");
        }
        System.out.println();
        //int[] getUpTime = {7, 8, 10, 8, 7, 7, 7};
        int[] getUpTime = new int[365];
        Random rand = new Random();
        for (int i = 0; i <= 364; i++) {
            getUpTime[i] = rand.nextInt(5) + 7;
            System.out.print(getUpTime[i] + " ");
        }
        System.out.println();


        int classTime = 0;  //Let the student write this name
        int breakfeastTime = 0;//Let the student write this name
        int absenceTime = 0;//Let the student write this name
        for (int i = 0; i < days.length; i++) { //at first i<7
            if (getUpTime[i] == 7) {
                classTime++;
                breakfeastTime++;

            } else if (getUpTime[i] == 8) {
                classTime++;
            } else {
                absenceTime++;
            }
        }
        System.out.println("In this week:");
        System.out.println("I attended " + classTime + " classe(s)");
        System.out.println("I ate " + breakfeastTime + " breakfeast");
        System.out.println("I did not attend " + absenceTime + " classe(s)");
        int totalday=classTime+absenceTime;
        System.out.println("There are "+totalday+" totally");
    }


}
