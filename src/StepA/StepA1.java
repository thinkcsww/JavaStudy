package StepA;

import java.util.Calendar;
import java.util.Scanner;

public class StepA1 {

    public static void main(String args[]) {

        int birthYear;
        int currentYear;
        int age;

        Calendar calendar = Calendar.getInstance();

        currentYear = calendar.getWeekYear();


        Scanner s = new Scanner(System.in);
        System.out.print("출생년도를 입력하세요 : ");

        birthYear = s.nextInt();
        age = currentYear - birthYear + 1 ;
        System.out.print("당신의 나이는 " + age + "입니다.");


    }

}
