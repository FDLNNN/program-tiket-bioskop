package fadlan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    atribut a = new atribut();
        Scanner in = new Scanner(System.in);
        int menu;
        System.out.println("----------------------------------------------------");
        System.out.println("|             DAFTAR FILM CINEPOLIS                |");
        System.out.println("|        SABTU 31 DESEMBER 2022 18.00 WIB          |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|  AVATAR : THE WAY OF WATER     RP.40.000         |");
        System.out.println("|  QODRAT 2022                   RP.50.000         |");
        System.out.println("|  PENGABDI SETAN 2              RP.35.000         |");
        System.out.println("|__________________________________________________|");
        System.out.println();
        System.out.println("1.BOOKING ONLINE");
        System.out.println("2.BELI DI GERAI");
        System.out.print("MASUKAN PILIHAN ANDA = ");
        menu = in.nextInt();
        if (menu==1){
            a.online();
        }else if (menu==2){
            a.offline();
        }else {
            System.out.println("MASUKAN DATA YANG BENAR");
        }
    }
}
