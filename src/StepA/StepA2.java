package StepA;

import java.util.Scanner;

public class StepA2 {
    public static void main(String args[]) {
        double cDegree;
        double fDegree;

        Scanner s = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하시오 : ");

        cDegree = s.nextDouble();

        fDegree = cDegree * 1.8 + 32;

        System.out.println("화씨 온도는 " + fDegree + "도 입니다.");
    }
}
