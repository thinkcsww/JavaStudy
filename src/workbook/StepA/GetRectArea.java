package workbook.StepA;

import java.util.Scanner;

class GetRectArea {
    GetRectArea(){input();}

    private int width;
    private int height;
    private int area;

    void printArea() {
        System.out.println("직사각형의 넓이는 " + getArea() + "입니다.");
    }
    private void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("직사각형의 가로 크기를 입력하시오 : ");
        this.width = s.nextInt();
        System.out.print("직사각형의 세로 크기를 입력하시오 : ");
        this.height = s.nextInt();
    }

    private int getArea() {
        area = width * height;
        return area;
    }

}
