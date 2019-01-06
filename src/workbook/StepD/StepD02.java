package workbook.StepD;

import java.util.Scanner;

class StepD02 {

    private int number;
    private int max_num, min_num;

    StepD02() {init(); input(); }

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("0부터 100 사이의 숫자를 입력하세요 : ");
        number = s.nextInt();

        while(!(number > 100 || number < 0)) {
            calculator(number);
            System.out.print("0부터 100 사이의 숫자를 입력하세요 : ");
            number = s.nextInt();
        }
    }

    private void init() {
        max_num = -1;
        min_num = 101;
    }

    private void calculator(int number) {
        if (number > max_num) {
            max_num = number;
        }
        if (number < min_num) {
            min_num = number;
        }
    }

    public void printResult() {
        if (min_num == 101 || max_num == -1) {
            System.out.println("종료되었습니다.");
        } else {
            System.out.println("입력된 숫자 중 가장 큰 수는 " + max_num + "이고, 가장 작은 수는 " + min_num + "입니다.");
        }
    }


}
