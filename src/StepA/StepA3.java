package StepA;

import java.util.Scanner;

public class StepA3 {
    public static void main(String args[]) {
        int width;
        int height;
        int area;

        Scanner s = new Scanner(System.in);

        System.out.print("직사각형의 가로 크기를 입력하시오 : ");
        width = s.nextInt();
        System.out.print("직사각형의 세로 크기를 입력하시오 : ");
        height = s.nextInt();

        area = width * height;

        System.out.println("직사각형의 넓이는 " + area + "입니다.");
    }
}
