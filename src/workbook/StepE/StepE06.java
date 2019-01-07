package workbook.StepE;

import java.util.Scanner;

class StepE06 {
    private int rows, columns;
    private int number;
    private int i, j;

    StepE06() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("출력하려는 행의 크기와 열의 크기를 입력하세요 : ");
        rows = s.nextInt();
        columns = s.nextInt();
    }

    private void calculator() {
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= columns; j++) {
                number = i * j;
                System.out.print(String.format("%4s", number));
            }
            System.out.println();
        }
    }

    public void printResult() {
        calculator();
    }

}
