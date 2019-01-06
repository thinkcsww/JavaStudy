package workbook.StepD;

import java.util.Scanner;

class StepD01 {
    private int number;
    private int totalsum;
    private int i;

    StepD01() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        number = s.nextInt();
    }

    private int calculator() {
        for (i = 0; i < number; i++) {
            totalsum += i;
        }
        return totalsum;
    }

    public void printResult() {
        System.out.println("1부터 입력한 숫자까지의 모든 정수를 더한 값은 " + calculator() + "입니다.");
    }
}
