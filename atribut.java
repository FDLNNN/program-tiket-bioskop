package fadlan;

import java.io.File;
import java.util.Scanner;

public class atribut implements metode{
    @Override
    public void online() {
        int jum;
        int bil;
        Scanner input = new Scanner(System.in);
        System.out.print("JUMLAH TIKET      =  ");
        jum = input.nextInt();
        String nama[] = new String[jum];
        String judul[] = new String[jum];
        String waktu[] = new String[jum];
        String kursi[] = new String[jum];
        String lokasi[] = new String[jum];
        String kontak[] =  new String[jum];
        int harga[] = new int[jum];
        for(int a = 0; a<jum; a++){
            System.out.println("--------------------------------------------------");
            System.out.print("MASUKAN NAMA = ");
            nama[a] = input.next();
            System.out.print("MASUKAN JUDUL FILM = ");
            judul[a] = input.next();
            System.out.print("WAKTU/TANGGAL = ");
            waktu[a] = input.next();
            System.out.print("POSISI KURSI ROW/NAMA BARIS = ");
            kursi[a] = input.next();
            System.out.println("LOKASI TEATER/BIOSKOP = ");
            lokasi[a] = input.next();
            System.out.println("KONTAK = ");
            kontak[a] = input.next();
            System.out.println("MASUKAN HARGA TIKET = ");
            harga[a] = input.nextInt();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("                   E-TIKET BIOSKOP");
        System.out.println("--------------------------------------------------");
        System.out.print("KODE BOOKING         = ");
        for (int i = 0;i<10;i++){
            bil = (int)(Math.random() * 10 + 1);
            System.out.print(bil);
        }
        System.out.println();
        System.out.print("PASS KEY             = ");
        for(int j = 0 ; j <5;j++){
            bil = (int) (Math.random()*5+1);
            System.out.print(bil);
        }
        System.out.println();
        for (int b = 0;b<jum;b++){
            System.out.println("JUDUL FILM           = "+judul[b]);
            System.out.println("WAKTU                = "+waktu[b]);
            System.out.println("TEATER/KURSI         = "+kursi[b]);
            System.out.println("LOKASI BIOSKOP       = "+lokasi[b]);
            System.out.println("INFO KONTAK          = "+kontak[b]);
            System.out.println("--------------------------------------------------");
        }

    }

    @Override
    public void offline() {
        java.io.File file = new File("tiket.txt");
        try {
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            int jum;
            int bil;
            Scanner input = new Scanner(System.in);
            System.out.print("JUMLAH TIKET      =  ");
            jum = input.nextInt();
            String judul[] = new String[jum];
            String waktu[] = new String[jum];
            String kursi[] = new String[jum];
            String lokasi[] = new String[jum];
            String kontak[] = new String[jum];
            int harga[] = new int[jum];
            for (int a = 0; a < jum; a++) {
                System.out.println("JUDUL FILM           = ");
                judul[a] = input.next();
                System.out.println("HARI/TANGGAL         = ");
                waktu[a] = input.next();
                System.out.println("BARIS                = ");
                kursi[a] = input.next();
                System.out.println("KURSI                = ");
                lokasi[a] = input.next();
                System.out.println("HARGA                = ");
                harga[a] = input.nextInt();
            }
            for (int b = 0; b < jum; b++) {
                output.println("             CINEPOLIS");
                output.println("--------------------------------------");
                output.println(judul[b]);
                output.println("TANGGAL   = " + waktu[b]);
                output.println("BARIS     = " + kursi[b] + "     KURSI   = " + lokasi[b]);
                output.println("HARGA  RP.= " + harga[b]);
                for (int i = 0; i < 10; i++) {
                    bil = (int) (Math.random() * 10 + 1);
                    output.print(bil);
                }
                output.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
