package workbook.StepC;

import java.util.Scanner;

class StepC01 {
    private int birth_year;
    private int age;

    StepC01() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("태어난 년도를 입력하세요 : ");
        birth_year = s.nextInt();
    }

    private String calculator() {
        age = 2019 - birth_year + 1;
        if (age >= 60) return "노년";
        else if (age >= 30) return "중년";
        else if (age >= 20) return "청년";
        else if (age >= 13) return "청소년";
        else if (age >= 7) return "어린이";
        else return "유아";
    }

    void printResult() {
        System.out.println(calculator() + "입니다");
    }

}
