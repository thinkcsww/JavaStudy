package workbook.StepB;

import java.util.Scanner;

class StepB09 {
    private int height, weight;
    private int bmi;

    StepB09() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("신장(cm)을 입력하세요 : ");
        height = s.nextInt();

        System.out.print("체중(kg)을 입력하세요 : ");
        weight = s.nextInt();

    }

    private Boolean calculator() {
        System.out.println(height);
        bmi = (int)Math.floor((double)weight / ((double)height / 100 * (double)height / 100));

        return bmi >= 25;
    }

    void printResult() {
        if (calculator()) {
            System.out.println("당신은 비만입니다.");
        } else {
            System.out.println("당신은 비만이 아닙니다.");
        }
    }
}
