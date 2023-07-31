package s02;

import java.util.Scanner;

public class task01 {

    public static float exec(String num_str) {
            return Float.parseFloat(num_str);
    }

    public static void main(String[] args) {
        boolean stopFlag = false;

        while (!stopFlag){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number: ");
                float result = exec(sc.nextLine());
                System.out.println(result);
                stopFlag = true;
            } catch (RuntimeException e) {
                System.out.println("Try again");
            }
        }

    }
}
