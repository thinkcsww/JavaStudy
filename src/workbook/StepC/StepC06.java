package workbook.StepC;

import java.util.Scanner;

class StepC06 {
    private int kor, eng, math;
    private int total;
    private double average;

    StepC06() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 : ");
        kor = s.nextInt();

        System.out.print("영어 점수를 입력하세요 : ");
        eng = s.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        math = s.nextInt();
    }

    private String calculator() {
        total = kor + eng + math;
        average = total / 3.0;
        if (average >= 90.0) return "수";
        else if (average >= 80) return "우";
        else if (average >= 70) return "미";
        else if (average >= 60) return "양";
        else return "가";
    }

    public void printResult() {
        System.out.println(calculator() + "입니다.");
    }


}
