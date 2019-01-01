package workbook.StepA;

import java.util.Scanner;

class CelciusToFahrenheit {
    private double cDegree;
    private double fDegree;

    CelciusToFahrenheit() {
        input();
    }

    void printAge() {
        System.out.println("화씨 온도는 " + getFahrenheit() + "도 입니다.");
    }

    private void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("섭씨 온도를 입력하시오 : ");
        cDegree = s.nextDouble();
    }

    private double getFahrenheit() {
        fDegree = cDegree * 1.8 + 32;
        return fDegree;
    }
}
