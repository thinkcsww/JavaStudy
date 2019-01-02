package workbook.StepB;

import java.util.Scanner;

public class StepBManager {
    public StepBManager() {
        int menu;
        Scanner s = new Scanner(System.in);
        while(true) {
            printf("---------------------\n");
            printf("1. 미성년자 판정\n");
            printf("2. 온도변환\n");
            printf("3. 직사각형 넓이계산\n");
            printf("4. 아파트 평형 계산\n");
            printf("5. 날짜계산\n");
            printf("6. 점수계산\n");
            printf("7. 파일 용량 계산\n");
            printf("=>원하는 메뉴는?(0:exit) :");
            menu = s.nextInt();
            if(menu == 0) break;
            switch(menu) {
                case 1:
                    StepB01 b01 = new StepB01();
                    b01.printResult();
                    break;
                case 2:
                    StepB02 b02 = new StepB02();
                    b02.printResult();
                    break;
                case 3:
                    StepB03 b03 = new StepB03();
                    b03.printResult();
                    break;
                case 4:
                    StepB04 b04 = new StepB04();
                    b04.printResult();
                    break;
                case 5:
                    StepB05 b05 = new StepB05();
                    b05.printResult();
                    break;
                case 6:
                    StepB06 b06 = new StepB06();
                    b06.printResult();
                    break;
                case 7:
                    StepB07 b07 = new StepB07();
                    b07.printResult();
                    break;
                default:
                    break;


            }
        }

    }
    void printf(String s){System.out.print(s);}
}