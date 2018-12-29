package StepA;

import java.util.Scanner;

public class StepA7 {
    public static void main(String args[]) {
        int gigabytes;
        int megabytes;
        int kilobytes;
        long bytes;

        Scanner s = new Scanner(System.in);

        System.out.print("파일 용량을 기가바이트 단위로 입력하세요 : ");;
        gigabytes = s.nextInt();

        megabytes = gigabytes * 1024;
        kilobytes = megabytes * 1024;
        bytes = kilobytes * 1024L;

        System.out.println("입력하신 파일 용량은 ");
        System.out.println(megabytes + "메가바이트,");
        System.out.println(kilobytes + "킬로바이트,");
        System.out.println(Long.toString(bytes)+ "바이트입니다");
    }
}
