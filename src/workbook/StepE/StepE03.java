package workbook.StepE;

import java.util.Scanner;

class StepE03 {

    private int height;

    StepE03() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("이등변 삼각형의 높이를 입력하시오 : ");
        height = s.nextInt();
    }

    private void drawTriangle() {
        int i,j;
        for (i = 1; i <= height; i++) {
            //왼쪽 여백 그리기
            for (j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            //삼각형 그리기
            for (j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            //줄바꿈
            System.out.println();
        }
    }

    public void printResult() {
        drawTriangle();
    }

}
