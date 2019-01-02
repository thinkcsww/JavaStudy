package workbook.StepB;

import java.util.Scanner;

public class StepB03 {
    private int width, height;
    private int area;

    StepB03(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("직사각형의 가로 길이를 입력하시오 : ");
        width = s.nextInt();

        System.out.print("직사각형의 세로 길이를 입력하시오 : ");
        height = s.nextInt();

    }

    private double calculator() {
        area = width * height;
        return area;
    }

    void printResult() {
        System.out.println("직사각형의 넓이는 " + calculator() + "이고");

        if (Math.sqrt(calculator()) % width == 0) {
            System.out.println("정사각형입니다.");
        } else {
            System.out.println("정사각형이 아닙니다.");
        }
    }
}
