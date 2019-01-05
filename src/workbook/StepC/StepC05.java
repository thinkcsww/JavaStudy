package workbook.StepC;

import java.util.Scanner;

class StepC05 {

    private int month, day;
    private int day_count;

    StepC05() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("월을 입력하시오 : ");
        month = s.nextInt();

        System.out.print("일을 입력하시오 : ");
        day = s.nextInt();
    }

    private int calculator() {
        if (month == 1) return day;
        else if (month == 2) return 31 + day;
        else if (month == 3) return 59 + day;
        else if (month == 4) return 90 + day;
        else if (month == 5) return 120 + day;
        else if (month == 6) return 151 + day;
        else if (month == 7) return 181 + day;
        else if (month == 8) return 212 + day;
        else if (month == 9) return 243 + day;
        else if (month == 10) return 273 + day;
        else if (month == 11) return 304 + day;
        else return 334 + day;
    }

    public void printResult() {
        System.out.println("이 날짜는 1년 중 " + calculator() + "번째 날에 해당됩니다.");
    }
}
