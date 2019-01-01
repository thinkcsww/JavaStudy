package workbook.StepA;

import java.util.Scanner;

class YearToAge {
        private int year;
        private int age;

        YearToAge(){input();}

        void printAge() {
            System.out.print("당신의 나이는" + getAge() +"입니다.\n");
        }

        private void input() {
            Scanner s = new Scanner(System.in);
            System.out.print("태어난 년도는?");
            this.year = s.nextInt();
        }
        private int getAge() {
            age = 2018 - year + 1;
            return this.age;
        }

}
