package workbook.StepB;

import java.util.Scanner;

class StepB07 {
    private long bytes;
    private String usb2;
    private int time;
    private int megabytes;
    StepB07(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("파일 용량을 메가바이트 단위로 입력하세요: ");
        megabytes = s.nextInt();

        System.out.print("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요 : ");
        usb2 = s.next();
    }

    private int calculator() {
        bytes = megabytes * 1024L * 1024L;

        if (usb2.equalsIgnoreCase("Y")) {
            time = (int)(bytes / 60000000);
        } else {
            time = (int)(bytes / 1500000);
        }

        return time;
    }

    void printResult() {
        System.out.println("파일 전송 시간은 " + calculator() + "초 입니다.");
    }

}
