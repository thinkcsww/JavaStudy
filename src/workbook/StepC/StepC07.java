package workbook.StepC;

import java.util.Scanner;

class StepC07 {

    private int megabytes;
    private long bytes;
    private byte kind;
    private double time;

    StepC07(){input();}

    private void input() {
        Scanner s = new Scanner(System.in);

        System.out.print("파일 용량을 메가바이트 단위로 입력하세요: ");
        megabytes = s.nextInt();

        System.out.print("전송방식을 1: Wi-Fi, 2: BlueTooth, 3: LTE, 4: USB에서 선택하세요 : ");
        kind = s.nextByte();
    }

    private double calculator() {
        bytes = megabytes * 1024L * 1024L;
        if (kind == 1) {
            time = (bytes / 1500000.0);
        } else if (kind == 2) {
            time = (bytes / 300000.0);
        } else if (kind == 3) {
            time = (bytes / 1000000.0);
        } else {
            time = (bytes / 60000000.0);
        }
        return time;
    }

    public void printResult() {
        System.out.println("파일 전송 시간은 " + Math.floor(calculator() * 10) / 10 + "초입니다.");
    }

}
