package lt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Lin Tao on 7/5/2017.
 */
public class LongestWords {
    public static void main(String[] args) throws FileNotFoundException {


            String longest_word = "";
            String current;
            //C:\Users\txl78\Course\MyInstructorCourse\Introduction to Computer Science\ProgrammingPresentation\IntroCS\src\lt\PrideAndPrejudice
            Scanner sc = new Scanner(new File("C:\\Users\\txl78\\Course\\MyInstructorCourse\\Introduction to Computer Science\\ProgrammingPresentation\\IntroCS\\src\\lt\\PrideAndPrejudice"));


            while (sc.hasNext()) {
                current = sc.next();
                if (current.length() > longest_word.length()) {
                    if (!current.contains("www")&& !current.contains("-")&&!current.contains("/")&&!current.contains("@")) {
                        longest_word = current;
                    }

                }

            }
            System.out.println("\n"+longest_word+"\n");

        }

}

