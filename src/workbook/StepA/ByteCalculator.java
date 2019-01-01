package workbook.StepA;

import java.util.Scanner;

public class ByteCalculator {
        int gigabytes;
        int megabytes;
        int kilobytes;
        long bytes;

        ByteCalculator(){input();}

        private void input() {
            Scanner s = new Scanner(System.in);

            System.out.print("파일 용량을 기가바이트 단위로 입력하세요 : ");;
            gigabytes = s.nextInt();
        }

        private int gigaToMega() {
            megabytes = gigabytes * 1024;
            return megabytes;
        }

        private int megaToKilo() {
            kilobytes = megabytes * 1024;
            return kilobytes;
        }

        private Long kiloToByte() {
            bytes = kilobytes * 1024L;
            return bytes;
        }

        void printResult() {
            System.out.println("입력하신 파일 용량은 ");
            System.out.println(gigaToMega() + "메가바이트,");
            System.out.println(megaToKilo() + "킬로바이트,");
            System.out.println(kiloToByte()+ "바이트입니다");
        }



}
