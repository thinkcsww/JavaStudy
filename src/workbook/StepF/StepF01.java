package workbook.StepF;

import java.util.Scanner;

class StepF01 {
    private int num[] = new int[10];
    private int first;
    private int second;
    private int second_max_index;
    private int i;

    StepF01() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print(i + 1 + "번째 수를 입력하세요 : ");
            num[i] = s.nextInt();
        }
        first = num[0];
        second = -1;
    }

    private void calculator() {
        for (i = 1; i < num.length; i++) {
            if (num[i] > first) {
                first = num[i];
            }
        }
        for (i = 0; i < num.length; i ++) {
            if (num[i] < first) {
                if (num[i] > second) {
                    second = num[i];
                    second_max_index = i + 1;
                }
            }
        }
    }

    public void printResult() {
        calculator();
        System.out.println("두번째로 큰 수는 " + second_max_index + "번째 수 " + second + "입니다");
    }
}
