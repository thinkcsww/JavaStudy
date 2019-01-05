package workbook.StepC;

import java.util.Scanner;

class StepC02 {
    private double input_degree;

    StepC02() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("물의 온도를 입력하세요 : ");
        input_degree = s.nextDouble();
    }

    private String calculator() {
        if (input_degree >= 80.0) {
            return "끓는 물";
        } else if (input_degree >= 40.0) {
            return "온수";
        } else if (input_degree >= 25) {
            return "미온수";
        } else if (input_degree >= 0) {
            return "냉수";
        } else return null;
    }

    void printResult() {
        if (calculator() != null) {
            System.out.println(calculator() + "입니다.");
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }

}
