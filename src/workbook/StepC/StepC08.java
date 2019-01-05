package workbook.StepC;

import java.util.Scanner;

class StepC08 {
    private int num1, num2, num3;
    private int max_num, min_num;

    StepC08() {input ();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 : ");
        num1 = s.nextInt();

        System.out.print("두번째 숫자를 입력하세요 : ");
        num2 = s.nextInt();

        System.out.print("세번째 숫자를 입력하세요 : ");
        num3 = s.nextInt();

    }

    private void calculate() {
        max_num = num1;
        min_num = num1;
        if (num2 > max_num) { max_num = num2;}
        if (num3 > max_num) { max_num = num3;}
        if (num2 < min_num) { min_num = num2;}
        if (num3 < min_num) { min_num = num3;}
    }

    public void printResult() {
        calculate();
        System.out.println("가장 큰 수는 " + max_num + "이고, 가장 작은 수는 " + min_num + "입니다");
    }
}
