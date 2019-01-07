package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
    public StepEManager() {
        int menu;

        Scanner s = new Scanner(System.in);

        while(true) {
            printf("---------------------\n");
            printf("1. 입력한 숫자 크기의 정사각형 출력하기 \n");
            printf("2. 입력한 숫자 크기의 높이를 갖는 우직각 삼각형 출력하기\n");
            printf("3. 입력한 숫자 크기의 높이를 갖는 이등변 삼각형 출력하기\n");
            printf("4. 홀수단 또는 짝수단의 구구단 출력하기\n");
            printf("5. 홀수단 또는 짝수단의 구구단을 열의 개수를 맞추어 출력하기\n");
            printf("6. 2차원 숫자 출력하기\n");
            printf("7. 1차 메소드의 좌표 구하기\n");
            printf("8. 2차 메소드의 좌표 구하기\n");
            printf("9. 원하는 구구단의 단 출력하기\n");
            printf("10. 두 수의 배타적 배수 출력하기\n");
            printf("=>원하는 메뉴는?(0:exit) :");

            menu = s.nextInt();

            if(menu == 0) break;

            switch(menu) {
                case 1:
                    StepE01 e01 = new StepE01();
                    e01.printResult();
                    break;
                case 2:
                    StepE02 e02 = new StepE02();
                    e02.printResult();
                    break;
                case 3:
                    StepE03 e03 = new StepE03();
                    e03.printResult();
                    break;
                case 4:
                    StepE04 e04 = new StepE04();
                    e04.printResult();
                    break;
                case 5:
                    StepE05 e05 = new StepE05();
                    e05.printResult();
                    break;
                case 6:
                    StepE06 e06 = new StepE06();
                    e06.printResult();
                    break;
                default:
                    printError();
                    break;


            }
        }

    }
    private void printf(String s){System.out.print(s);}
    private void printError() {System.out.println("존재하지 않는 메뉴입니다.");}
}
