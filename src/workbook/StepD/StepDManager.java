package workbook.StepD;

import java.util.Scanner;

public class StepDManager {
    public StepDManager() {
        int menu;
        Scanner s = new Scanner(System.in);
        while(true) {
            printf("---------------------\n");
            printf("1. 1부터 숫자 더하기 \n");
            printf("2. 입력 받은 숫자들 중에서 가장 큰 수와 가장 작은 수 구하기\n");
            printf("3. 입력 받은 숫자들의 총합계와 평균 값 구하기\n");
            printf("4. 미성년자 숫자 세기\n");
            printf("5. 직사각형 형태 개수 세기\n");
            printf("6. 아파트 평형 계산 및 종류 판정\n");
            printf("7. 1차 메소드의 좌표 구하기\n");
            printf("8. 2차 메소드의 좌표 구하기\n");
            printf("9. 원하는 구구단의 단 출력하기\n");
            printf("10. 두 수의 배타적 배수 출력하기\n");
            printf("=>원하는 메뉴는?(0:exit) :");
            menu = s.nextInt();
            if(menu == 0) break;
            switch(menu) {
                case 1:
                    StepD01 d01 = new StepD01();
                    d01.printResult();
                    break;
                case 2:
                    StepD02 d02 = new StepD02();
                    d02.printResult();
                    break;
                case 3:
                    StepD03 d03 = new StepD03();
                    d03.printResult();
                    break;
                case 4:
                    StepD04 d04 = new StepD04();
                    d04.printResult();
                    break;
                case 5:
                    StepD05 d05 = new StepD05();
                    d05.printResult();
                    break;
                case 6:
                    StepD06 d06 = new StepD06();
                    d06.printResult();
                    break;
                case 7:
                    StepD07 d07 = new StepD07();
                    d07.printResult();
                    break;
                case 8:
                    StepD08 d08 = new StepD08();
                    d08.printResult();
                    break;
                case 9:
                    StepD09 d09 = new StepD09();
                    d09.printResult();
                    break;
                case 10:
                    StepD10 d10 = new StepD10();
                    d10.printResult();
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
