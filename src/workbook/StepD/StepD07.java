package workbook.StepD;

import java.util.Scanner;

class StepD07 {

    private int a, b; // 1차 메소드의 계수 a, b
    private int x_begin, x_end; // x좌표의 시작 값과 끝 값
    private int x, y;

    StepD07() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("1차 함수 y = ax+b의 계수 a와 b를 입력하시오 : ");
        a = s.nextInt();
        b = s.nextInt();

        System.out.print("x좌표의 시작 값과 끝 값을 입력하시오 : ");
        x_begin = s.nextInt();
        x_end = s.nextInt();
    }

    private int calculator(int i) {
        return a * i + b;
    }

    public void printResult() {
        for (int i = x_begin; i <= x_end; i++) {
            System.out.println("좌표 (" + i + ", " + calculator(i) + ")");
        }
    }

}
