package StepA;

import java.util.Scanner;

public class StepA5 {
    public static void main(String args[]) {
        int days;
        int seconds;

        Scanner s = new Scanner(System.in);

        System.out.print("날 수를 입력하세요 : ");
        days = s.nextInt();

        seconds = days * 60 * 60 * 24;

        System.out.println("날 수에 해당하는 시간은 모두 " + seconds + "입니다.");
    }
}
