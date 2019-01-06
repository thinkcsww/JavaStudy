package workbook.StepD;

import java.util.Scanner;

class StepD04 {

    private int count_all;
    private int count_young = 0;
    private int birth_year;
    private int age;
    private int i;

    StepD04() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("가족이 몇명인지 입력하세요 : ");
        count_all = s.nextInt();

        for (i = 0; i < count_all; i++) {
            System.out.print("태어난 년도를 입력하세요 : ");
            birth_year = s.nextInt();
            // 미성년자 판단
            calculator(birth_year);
        }
    }

    private void calculator(int birth_year) {
        age = 2019 - birth_year + 1;
        //20세 미만인 경우 미성년자로 판단
        if (age < 20) count_young++;
    }
    public void printResult() {
        System.out.println("가족들 중에 미성년자는 모두 " + count_young + "명 입니다.");
    }

}
