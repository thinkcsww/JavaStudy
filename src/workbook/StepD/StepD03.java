package workbook.StepD;

import java.util.Scanner;

class StepD03 {
    private int number;
    private int count = 0;
    private int totalsum = 0;
    private double average;
    StepD03() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("0부터 100 사이의 숫자를 입력하세요 : ");
        number = s.nextInt();

        while(!(number > 100 || number < 0)) {
            calculator(number);
            System.out.print("0부터 100 사이의 숫자를 입력하세요 : ");
            number = s.nextInt();

        }
    }


    private void calculator(int number) {
        // 호출될 때 마다 카운터의 값을 1 올린다.
        count++;
        //합계를 구한다
        totalsum += number;
        //평균을 구한다
        average = totalsum / (double)count;
    }

    public void printResult() {
        System.out.println("입력한 숫자 " + count + "개의 숫자들의 총합은 " + totalsum + "이고, 평균 값은 " + Math.floor(10 * average) / 10+ "입니다.");
    }
}
