import java.util.Scanner;


public class Rata2_nilai {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
        
        int jmlNilai;
        float nilai = 0, average, sum = 0;
        System.out.println("\n\t===================================");
        System.out.println("\t+ Program Mencari Rata-rata Nilai +");
        System.out.println("\t===================================");
        System.out.print("\n\n\tMasukkan Banyaknya Nilai : ");
        jmlNilai = InputUser.nextInt();

        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("\n\tMasukkan nilai ke " + (i+1) + " : " );
            nilai = InputUser.nextFloat();
            sum += nilai;
        }

        average = sum/jmlNilai;
        System.out.println("\n\nJumlah Nilai adalah " + sum);
        System.out.println("\n\nRata-ratanya adalah " + average);

        InputUser.close();
    }
}
