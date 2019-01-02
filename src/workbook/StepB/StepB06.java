package workbook.StepB;

import java.util.Scanner;

public class StepB06 {
    private int kor, eng, math;
    private int total;
    private double average;

    StepB06(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 : ");
        kor = s.nextInt();

        System.out.print("영어 점수를 입력하세요 : ");
        eng = s.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        math = s.nextInt();
    }

    private double calculator() {
        total = kor + eng + math;
        average = total / 3.0;

        return Math.floor(average * 10) / 10;
    }

    void printResult() {
        System.out.println("입력하신 점수의 총점은 " + total + "이고");
        System.out.println("평균은 " + calculator() + "입니다.");
        if (kor >= 90) {
            System.out.println("국어점수가 우수합니다");
        }

        if (eng >= 90) {
            System.out.println("영어점수가 우수합니다");
        }

        if (math >= 90) {
            System.out.println("수학점수가 우수합니다");
        }

    }
}
