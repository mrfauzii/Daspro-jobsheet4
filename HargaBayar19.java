import java.util.Scanner;
public class HargaBayar19 {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String merekBuku;
        int halamanBuku, harga, jumlah ;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukan Merek Buku");
        merekBuku=input.nextLine();
        System.out.println("Masukan Jumlah Halaman Buku" + merekBuku);
        halamanBuku=input.nextInt();
        System.out.println("Masukan harga barang yang dibeli : ");
        harga=input.nextInt();
        System.out.println("Masukan jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        System.out.println("Masukan Diskon" );
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.printf("Anda Membeli Buku %s dengan Halaman Berjumlah %d" ,merekBuku, halamanBuku);
        System.out.println("Diskon yang Anda Dapatkan Adalah " +jmlDis);
        System.out.println("Jumlah yang Harus Dibayar Adalah " +bayar);
   
    }
}
