package workbook.StepC;

import java.util.Scanner;

class StepC04 {

    private double m2_area;
    private double pyung_area;

    StepC04(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오 : ");
        m2_area = s.nextDouble();
    }

    private String calculator() {
        pyung_area = m2_area / 3.305;
        if (pyung_area >= 50.0) { return "대형";}
        else if (pyung_area >= 30){ return "중형";}
        else if (pyung_area >= 15){ return "중소형";}
        else return "소형";

    }

    void printResult() {
        System.out.println(calculator() + "아파트 입니다.");

    }
}
