import java.util.Scanner;
public class kafe25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargakopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        System.out.print("masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        double totalHarga,nominalBayar;
        totalHarga = (jmlKopi * hargakopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga); 
        System.out.println("keanggotaan pelanggan: " + keanggotaan );
        System.out.println("item pembelian " +  jmlKopi  +  "kopi, " +  jmlTeh  + "teh, " +  jmlRoti  + "roti");
        System.out.println("Nominal bayar Rp " + nominalBayar );
        input.close();
    }
}