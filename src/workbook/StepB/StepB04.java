package workbook.StepB;

import java.util.Scanner;

class StepB04 {
    double m2_area;
    double pyung_area;

    StepB04(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오 : ");
        m2_area = s.nextDouble();
    }

    private double calculator() {
        pyung_area = m2_area / 3.305;
        return pyung_area;
    }

    void printResult() {
        System.out.println("아파트의 평형은 " + Math.floor(calculator() * 10) / 10 + "이고,");
        if (calculator() >= 30.0) {
            System.out.println("30평 이상이므로 큰 아파트입니다.");
        } else {
            System.out.println("30평 이하이므로 작은 아파트입니다.");
        }
    }
}
