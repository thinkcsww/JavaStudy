package workbook.StepD;

import java.util.Scanner;

class StepD05 {
    private int width, height;
    private int count1;
    private int count2;
    private int count3;
    private int count4;
    private int count5;

    StepD05() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        // 직사각형의 가로 세로 길이를 입력 받는다.
        System.out.print("직사각형의 가로, 세로 크기를 입력하시오 : ");
        width = s.nextInt();
        height = s.nextInt();

        // 직사각형 정보를 입력 받는 반복문
        while(!(width < 0 || height < 0)) {
            //직사각형의 유형 파악
            calculator();
            // 직사각형의 가로 세로 길이를 입력 받는다.
            System.out.print("직사각형의 가로, 세로 크기를 입력하시오 : ");
            width = s.nextInt();
            height = s.nextInt();
        }
    }

    private void calculator() {
        // 판별
        if (width == height) count1++;
        else if (width >= height * 2) count2++;
        else if (width * 2 <= height) count3++;
        else if (width > height) count4++;
        else count5++;
    }

    public void printResult() {
        System.out.println("정사각형의 개수는 " + count1 + "입니다.");
        System.out.println("좌우로 길쭉한 직사각형의 개수는 " + count2 + "입니다.");
        System.out.println("위아래로 길쭉한 직사각형의 개수는 " + count3 + "입니다.");
        System.out.println("일반적인 가로형 직사각형의 개수는 " + count4 + "입니다.");
        System.out.println("일반적인 세로형 직사각형의 개수는 " + count5 + "입니다.");

    }
}
