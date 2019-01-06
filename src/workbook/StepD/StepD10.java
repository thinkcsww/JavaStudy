package workbook.StepD;

import java.util.Scanner;

class StepD10 {
    private int num1, num2; // 입력받은 두 수
    private int i;

    StepD10() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        num1 = s.nextInt();
        num2 = s.nextInt();
    }

    private void calculate() {
        for (i = 0; i < 100; i++) {
            if (i % num1 == 0) {
                if (i % num2 != 0) {
                    System.out.print(i + " ");
                }
            } else if (i % num2 == 0) {
                if (i % num1 != 0)  {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    public void printResult() {
        calculate();
    }
}
