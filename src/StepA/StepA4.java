package StepA;

import java.util.Scanner;

public class StepA4 {
    public static void main(String args[]) {

        double m2_area;
        double pyung_area;

        Scanner s = new Scanner(System.in);

        System.out.print("아파트의 분양 면적을 입력하시오 : ");

        m2_area = s.nextDouble();

        pyung_area = Math.round((m2_area / 3.305) * 10.0) / 10.0;

        System.out.println("아파트의 평형은 " + pyung_area + "입니다.");
    }
}
