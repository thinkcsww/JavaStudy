package workbook.StepE;

import java.util.Scanner;

class StepE02 {
    private int height;
    private int blank;

    StepE02() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("직사각형의 높이와 왼쪽 여백의 크기를 입력하시오 : ");
        height = s.nextInt();
        blank = s.nextInt();
    }

    private void drawTriangle() {
        int i, j;

        for (i = 1; i <= height; i++) {
            for (j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (j = height - i; j > 0; j-- ) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printResult() {
        drawTriangle();
    }
}
