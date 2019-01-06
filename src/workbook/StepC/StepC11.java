package workbook.StepC;

import java.util.Scanner;

class StepC11 {
    private int year;

    StepC11() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("연도를 입력하세요 :");
        year = s.nextInt();
    }

    private Boolean calculator() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public void printResult() {
        if (calculator()) System.out.println("입력하신 년도는 윤년입니다.");
        else System.out.println("입력하신 년도는 윤년이아닙니다.");
    }
}
