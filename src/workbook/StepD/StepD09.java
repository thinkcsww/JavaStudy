package workbook.StepD;

import java.util.Scanner;

class StepD09 {
    private int dan;

    StepD09() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("출력하고 싶은 구구단을 입력하시오 : ");
        dan = s.nextInt();

        while(dan > 9 || dan < 2) {
            System.out.print("잘못 입력했습니다.");
            System.out.print("출력하고 싶은 구구단을 입력하시오 : ");
            dan = s.nextInt();
        }

    }

    private void calculator() {
        for(int i = 1; i < 10; i++) {
            System.out.println(dan + " X " + i + " = " + dan * i);
        }
    }

    public void printResult() {
        calculator();
    }


}
