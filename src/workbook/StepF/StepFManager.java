package workbook.StepF;

import java.util.Scanner;

public class StepFManager {
    public StepFManager() {
        int menu;

        Scanner s = new Scanner(System.in);

        while(true) {
            printf("---------------------\n");
            printf("1. 두번째로 큰 수의 순서 찾기 \n");
            printf("2. 심사점수 계산\n");
            printf("3. 5명의 국, 영, 수 3과목 점수의 과목별 총점, 평균값 구하기\n");
            printf("4. 5명의 국, 영, 수 3과목 점수의 학생별 총점, 평균값 구하기\n");
            printf("5. 비만 판정\n");
            printf("6. 5층 아파트의 거주자 숫자 구하기\n");
            printf("7. 5층 아파트의 층별, 호수별 거주자 숫자 구하기\n");
            printf("8. 겹치지 않는 숫자 10개 입력 받기\n");
            printf("9. 배열을 이용한 연중 날짜 계산\n");
            printf("=>원하는 메뉴는?(0:exit) :");

            menu = s.nextInt();

            if(menu == 0) break;

            switch(menu) {
                case 1:
                    StepF01 f01 = new StepF01();
                    f01.printResult();
                    break;
                case 2:
                    StepF02 f02 = new StepF02();
                    f02.printResult();
                    break;
//                case 3:
//                    StepF03 f03 = new StepF03();
//                    f03.printResult();
//                    break;
//                case 4:
//                    StepF04 f04 = new StepF04();
//                    f04.printResult();
//                    break;
//                case 5:
//                    StepF05 f05 = new StepF05();
//                    f05.printResult();
//                    break;
//                case 6:
//                    StepF06 f06 = new StepF06();
//                    f06.printResult();
//                    break;
//                case 7:
//                    StepF07 f07 = new StepF07();
//                    f07.printResult();
//                    break;
//                case 8:
//                    StepF08 f08 = new StepF08();
//                    f08.printResult();
//                    break;
//                case 7:
//                    StepF09 f09 = new StepF09();
//                    f09.printResult();
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

