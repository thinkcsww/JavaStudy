package workbook.StepA;

import java.util.Scanner;

class Average {
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double average;

    Average(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 : ");
        kor = s.nextInt();

        System.out.print("영어 점수를 입력하세요 : ");
        eng = s.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        math = s.nextInt();
    }



    private double getAverage() {
        total = kor + eng + math;

        average = total / 3.0;

        return average;
    }

    void printAverage() {
        System.out.println("평균은 " + getAverage() + "입니다");
    }





}
