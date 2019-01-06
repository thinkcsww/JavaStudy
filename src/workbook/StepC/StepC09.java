package workbook.StepC;

import java.util.Scanner;

class StepC09 {

    private int income;
    private int tax;

    StepC09() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("연봉(원 단위)을 숫자로 입력하세요 :");
        income = s.nextInt();
    }

    private int calculator() {
        if (income > 80000000) {
            tax = (int)(income * 0.37);
        } else if (income > 40000000) {
            tax = (int)(income * 0.28);
        } else if (income > 40000000) {
            tax = (int)(income * 0.19);
        } else {
            tax = (int)(income * 0.095);
        }

        return tax;
    }

    public void printResult() {
        System.out.println("연봉 금액에 대한 소득세는 " + calculator() + "원 입니다.");
    }
}
