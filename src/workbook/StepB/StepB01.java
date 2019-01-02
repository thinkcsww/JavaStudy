package workbook.StepB;

import java.util.Scanner;

class StepB01 {
    private int birth_year;
    private int age;
    StepB01(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("태어난 년도를 입력하세요 : ");
        birth_year = s.nextInt();
    }

    private Boolean tellApartMinor() {
        age = 2019 - birth_year + 1;
        return age > 19;
    }

    void printResult() {
        if(tellApartMinor()) System.out.println("미성년자가 아닙니다.");
        else System.out.println("미성년자입니다.");

    }
}
