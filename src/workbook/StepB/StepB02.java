package workbook.StepB;

import java.util.Scanner;

class StepB02 {
    private double input_degree;
    private String kind;
    private double output_degree;

    StepB02(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("온도를 입력하세요 : ");
        input_degree = s.nextDouble();

        System.out.print("입력하신 온도가 섭씨온도이면 C, 화씨온도이면 F를 입력하세요");
        kind = s.next();
    }

    private double calculator() {
        if (kind.equalsIgnoreCase("C")) {
            output_degree = input_degree * 1.8 + 32;
        } else if (kind.equalsIgnoreCase("F")) {
            output_degree = (input_degree - 32) / 1.8;
        }
        return Math.floor(output_degree);
    }

    void printResult() {
        System.out.println("변환된 온도는 " + calculator() + "입니다.");
    }
}
