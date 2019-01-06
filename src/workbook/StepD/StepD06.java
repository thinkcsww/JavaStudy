package workbook.StepD;

import java.util.Scanner;

class StepD06 {
    private double m2_area;
    private double pyung_area;
    private int count1;
    private int count2;
    private int count3;
    private int count4;
    private int i;

    StepD06() {input();}


    private void input() {
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오 : ");
            m2_area = s.nextDouble();

            calculator();
        }

    }

    private void calculator() {
        pyung_area = m2_area / 3.305;

        if (pyung_area >= 50.0) count4++;
        else if (pyung_area >= 30) count3++;
        else if (pyung_area >= 15) count2++;
        else count1++;
    }

    public void printResult() {
        System.out.println("소형 아파트의 개수는 " + count1 + "개 입니다.");
        System.out.println("중소형 아파트의 개수는 " + count2 + "개 입니다.");
        System.out.println("중형 아파트의 개수는 " + count3 + "개 입니다.");
        System.out.println("대형 아파트의 개수는 " + count4 + "개 입니다.");
    }


}
