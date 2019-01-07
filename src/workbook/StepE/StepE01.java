package workbook.StepE;

import java.util.Scanner;

class StepE01 {
    private int length;
    StepE01() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("정사각형의 크기를 입력하세요 : ");
        length = s.nextInt();
    }

    private void calculator() {
        for (int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public void printResult() {
        calculator();
    }
}
