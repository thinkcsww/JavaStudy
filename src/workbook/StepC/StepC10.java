package workbook.StepC;

import java.util.Scanner;

class StepC10 {
    private int num1, num2;
    private String operator;
    private int result;

    StepC10() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("숫자 1을 입력하세요 :");
        num1 = s.nextInt();

        System.out.print("숫자 2를 입력하세요 :");
        num2 = s.nextInt();

        System.out.print("연산기호문자('+', '-', '*', '/' 중 1개를 입력하세요 : ");
        operator = s.next();
   }

    private int calculator() {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return -1;
        }
    }

    public void printResult() {
        if (calculator() != -1) {
            System.out.println("계산식의 결과 값은 " + calculator() + "입니다.");
        } else {
            System.out.println("계산할 수 없습니다.");
        }
    }
}
