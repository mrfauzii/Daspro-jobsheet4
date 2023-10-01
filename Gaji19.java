import java.util.Scanner;
public class Gaji19 {
    
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.println("Masukan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukan jumlah Gaji");
        gaji=input.nextInt();
        System.out.println("Masukan Potongan Gaji");
        potGaji=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah" +TotGaji);


    }
}
