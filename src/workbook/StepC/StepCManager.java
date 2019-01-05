package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
    public StepCManager() {
        int menu;
        Scanner s = new Scanner(System.in);
        while(true) {
            printf("---------------------\n");
            printf("1. 나이 계산 및 연령대 판정 \n");
            printf("2. 물의 온도 구간 판정\n");
            printf("3. 직사각형 형태 판정\n");
            printf("4. 아파트 평형 계산 및 종류 판정\n");
            printf("5. 연중 날짜 계산\n");
            printf("6. 점수계산\n");
            printf("7. 파일 용량 계산\n");
            printf("8. 다양한 조건 판정\n");
            printf("9. 비만 판정\n");
            printf("=>원하는 메뉴는?(0:exit) :");
            menu = s.nextInt();
            if(menu == 0) break;
            switch(menu) {
                case 1:
                    StepC01 c01 = new StepC01();
                    c01.printResult();
                    break;
                case 2:
                    StepC02 c02 = new StepC02();
                    c02.printResult();
                    break;
                case 3:
                    StepC03 c03 = new StepC03();
                    c03.printResult();
                    break;
                case 4:
                    StepC04 c04 = new StepC04();
                    c04.printResult();
                    break;
                case 5:
                    StepC05 c05 = new StepC05();
                    c05.printResult();
                    break;
                case 6:
                    StepC06 c06 = new StepC06();
                    c06.printResult();
                    break;
                case 7:
                    StepC07 c07 = new StepC07();
                    c07.printResult();
                    break;
                case 8:
                    StepC08 c08 = new StepC08();
                    c08.printResult();
                    break;
//                case 9:
//                    StepC09 c09 = new StepC09();
//                    c09.printResult();
//                    break;
                default:
                    printError();
                    break;


            }
        }

    }
    private void printf(String s){System.out.print(s);}
    private void printError() {System.out.println("존재하지 않는 메뉴입니다.");}
}
