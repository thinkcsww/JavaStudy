package workbook.StepC;

import java.util.Scanner;

class StepC03 {
    private int width, height;

    StepC03() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("직사각형의 가로 크기를 입력하시오 : ");
        width = s.nextInt();

        System.out.print("직사각형의 세로 크기를 입력하시오 : ");
        height = s.nextInt();
    }

    private String calculator() {
        if (width == height) return "정사각형입니다.";
        else if (width >= height * 2) return "좌우로 길쭉한 정사각형입니다.";
        else if (width * 2 <= height) return "위아래로 길쭉한 정사각형입니다.";
        else if (width > height) return "일반적인 가로형 직사각형입니다.";
        else return "일반적인 세로형 직사각형입니다.";
    }

    public void printResult() {
        System.out.println(calculator());
    }

}
