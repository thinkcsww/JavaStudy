package StepA;

import java.util.Scanner;

public class StepA6 {
    public static void main(String args[]) {
        int kor;
        int eng;
        int math;
        int total;
        double average;

        Scanner s = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 : ");
        kor = s.nextInt();

        System.out.print("영어 점수를 입력하세요 : ");
        eng = s.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        math = s.nextInt();

        total = kor + eng + math;

        average = total / 3.0;

        System.out.print("평균은 " + average + "입니다");

    }
}
