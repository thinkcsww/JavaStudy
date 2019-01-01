package workbook.StepA;

import java.util.Scanner;

public class DayToSecond {
    int days;
    int seconds;

    DayToSecond(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("날 수를 입력하세요 : ");
        days = s.nextInt();
    }

    private int getSecond() {
        seconds = days * 60 * 60 * 24;
        return seconds;
    }

    void printSecond() {
        System.out.println("날 수에 해당하는 시간은 모두 " + getSecond() + "입니다.");
    }





}
