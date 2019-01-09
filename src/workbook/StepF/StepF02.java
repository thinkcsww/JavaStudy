package workbook.StepF;

import java.util.Scanner;

class StepF02 {
    private double score[] = new double[10]; // 심사점수 리스트
    private double maxscore, minscore;
    private double total;
    private double average;
    private double newnum;
    private int i;

    StepF02() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print(i + 1 + "번 심사점수를 입력하세요 : ");
            score[i] = s.nextInt();
        }

        maxscore = score[0];
        minscore = score[0];
    }

    private void calculator() {
        for (i = 0; i < score.length; i++) {
            if (maxscore < score[i]) maxscore = score[i];
            if (minscore > score[i]) minscore = score[i];
            total += score[i];
        }

        total -= maxscore;
        total -= minscore;

        average = total / score.length;
    }

    public void printResult() {
        calculator();
        System.out.println("가장 큰 점수와 작은 점수를 제외한 8개의 점수에 대한 평균은 " + average + "입니다." );
    }
}
