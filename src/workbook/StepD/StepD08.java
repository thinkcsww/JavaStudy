package workbook.StepD;

import java.util.Scanner;

class StepD08 {
    private int a, b, c; // 2차 메소드의 계수 a, b, c
    private int x_begin, x_end; // x좌표의 시작 값과 끝 값
    private int x, y;

    StepD08() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("2차 y=ax^2 +bx+c에 대해 계수 a와 b와 c를 입력하시오 : ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        System.out.print("x좌표의 시작 값과 끝 값을 입력하시오 : ");
        x_begin = s.nextInt();
        x_end = s.nextInt();
    }

    private int calculator(int x) {
        return a * x * x + b * x + c;
    }

    public void printResult() {
        for (int i = x_begin; i <= x_end; i++) {
            System.out.println("좌표 (" + i + ", " + calculator(i) + ")");
        }
    }


}
