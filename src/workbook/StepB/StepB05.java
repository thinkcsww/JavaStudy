package workbook.StepB;

import java.util.Scanner;

class StepB05 {
    private int days;

    StepB05(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("날수를 입력하세요 : ");
        days = s.nextInt();
    }

    private int calculate() {
        int seconds = days * 60 * 60 * 24;
        return seconds;
    }

    void printResult() {
        int m_count = calculate() / 1000000;
        System.out.println("날수에 해당하는 기간은 모두 " + calculate() + "초입니다.");
        System.out.println("100만초가 모두 " + m_count + "이나 포함됩니다.");
    }
}
