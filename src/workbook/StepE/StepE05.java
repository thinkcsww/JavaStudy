package workbook.StepE;

import java.util.Scanner;

class StepE05 {
    private int mode; // 출력모드(1: 홀수단, 2: 짝수단)
    private int i, j;
    private int column;
    StepE05() {input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("구구단의 출력모드(1: 홀수, 2: 짝수)를 입력하세요 : ");
        mode = s.nextInt();

        System.out.print("한줄에 출력할 열 개수를 입력하세요 : ");
        column = s.nextInt();
    }

    private void calculator() {
        if (mode == 1) {
            for (i = 0 ; i <= 4; i ++) {
                for(j = 1; j <= 9; j++ ) {
                    System.out.print(String.format("%-20s", 2 * i + 1 + " x " + j + " = " + (2 * i + 1) * j )) ;
                    if(j % column == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
            }
        } else if (mode == 2) {
            for (i = 1 ; i <= 4; i ++) {
                for(j = 1; j <= 9; j++ ) {
                    System.out.print(String.format("%-20s", 2 * i + " x " + j + " = " + (2 * i) * j )) ;
                    if(j % column == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("잘못 선택하셨습니다.");
        }
    }

    public void printResult() {
        calculator();
    }
}
