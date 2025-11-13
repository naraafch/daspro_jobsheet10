import java.util.Scanner;

public class Tugas26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] nilai= new int[10][6];
        double  totalPernyataan=0, totalNama=0, rataNama, rataPernyataan;
        String nama;


        System.out.println("===== SURVEY KEPUASAN PELANGGAN =====");
        for (int i=0; i<nilai.length; i++) {
            System.out.print("\nNama responden: ");
            nama= sc.nextLine();
            
            totalNama=0;
            for (int j=0; j<nilai[i].length; j++) {
                System.out.print("Nilai pernyataan ke-" +(j+1)+ " (1-5): ");
                nilai[i][j]= sc.nextInt();
                totalNama+=nilai[i][j];
                sc.nextLine();
            }

            rataNama= totalNama/6;
            System.out.println("-------------------------------");
            System.out.println("rata-rata nilai: " +rataNama);
        }

        System.out.println("\n=== Rata-rata nilai pernyataan ===");
        for (int j=0; j<6; j++) {
            totalPernyataan=0;
            for (int i=0; i<10; i++) {
                totalPernyataan+=nilai[i][j];
            }

            rataPernyataan= totalPernyataan/10;        
            System.out.println("Ppernyataan ke-" +(j+1)+ ": "+rataPernyataan);
        }

    }
    
}
