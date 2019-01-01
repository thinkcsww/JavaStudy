package workbook.StepA;

import java.util.Scanner;

public class PyungToSquareMeter {

    PyungToSquareMeter(){input();}


    private double m2_area;
    private double pyung_area;

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("아파트의 분양 면적을 입력하시오 : ");

        m2_area = s.nextDouble();
    }

    private double getPyungArea() {
        pyung_area = Math.round((m2_area / 3.305) * 10.0) / 10.0;

        return pyung_area;
    }

    void printPyungArea() {

        System.out.println("아파트의 평형은 " + getPyungArea() + "입니다.");
    }





}
