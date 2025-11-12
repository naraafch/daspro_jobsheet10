import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String [][] penonton= new String [4][2];

        System.out.println("=======BIOSKOP 26=======");
        System.out.println("Menu 1: pilih kursi");
        System.out.println("Menu 2: daftar penonton");
        System.out.println("Menu 3: exit");
        System.out.println("========================");
        System.out.print("\nPilih menu: ");
        menu= sc.nextInt();
        sc.nextLine();

        System.out.println("------------------------");
        switch(menu) {
            case 1:
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama= sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris= sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom= sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Kursi tidak tersedia");
                    }
                    penonton[baris-1][kolom-1]= nama;

                    System.out.print("Input penonton lainnya? (Y/N): ");;
                    next= sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }                   
                }

            case 2:
            System.out.println("\n=========Daftar Penonton=========");
                for (int i = 0; i < penonton.length; i++) {
                        System.out.print((i + 1)+"  ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("*");
                            } else {
                                System.out.print(penonton[i][j]);
                            }
                            if (j < penonton[i].length - 1) {
                                System.out.print("\t\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

            case 3:
            System.out.println("EXIT");
            return;
        }
        
            
        

    }
}
