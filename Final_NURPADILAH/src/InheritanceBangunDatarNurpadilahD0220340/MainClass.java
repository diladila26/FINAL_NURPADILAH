
package InheritanceBangunDatarNurpadilahD0220340;

import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int menu ;
        char ulang;
        // membuat objek bangun datar
         do {
        System.out.println("-------------------------------------------------------");
        System.out.println("-----Program Menghitung Luas dan Volume Bangun Datar---");
        System.out.println("1. Menghitung luas");
        System.out.println("2. Menghitung Volume");
        //System.out.println("-------------------------------------------------------\n");
        System.out.print("Masukkan Pilihan : ");
        menu = input.nextInt();
        
        if (menu == 1){
            do{
            System.out.println("1. Menghitung luas Persegi");
            System.out.println("2. Menghitung luas Segitiga");
            System.out.println("3. Menghitung luas Lingkaran");
            System.out.print("Masukkan Pilihan : ");
            menu = input.nextInt();
            if (menu == 1){
                PersegiNurpadilah persegi = new PersegiNurpadilah();
                persegi.luas();
            }else if(menu == 2){
               SegitigaNurpadilah mSegitiga = new SegitigaNurpadilah();
               mSegitiga.luas();
            }else if(menu == 3){
                LingkaranNurpadilah lingkaran = new LingkaranNurpadilah();
                lingkaran.luas();
            }else{
            System.out.println("\nPilihan Tidak Tersedia!!!\n");
        }System.out.print("\nIngin menghitung Luas Lagi (y/t)? ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    }
    while (ulang!= 't');
    
    
            
        }else if (menu == 2){
            do{
                System.out.println("\n-----------------------------");
                System.out.println("Program Menghitung Volume");
                System.out.println("1. Menghitung Volume Persegi");
                System.out.println("2. Menghitung Volume Segitiga");
                System.out.println("3. Menghitung Volume Lingkaran");
                System.out.print("Masukkan Pilihan : ");
                
            menu = input.nextInt();
            if (menu == 1){
                PersegiNurpadilah persegi = new PersegiNurpadilah();
                persegi.volume();
            }else if(menu == 2){
               SegitigaNurpadilah mSegitiga = new SegitigaNurpadilah();
               mSegitiga.volume();
            }else if(menu == 3){
                LingkaranNurpadilah lingkaran = new LingkaranNurpadilah();
                lingkaran.volume();
            }else{
            System.out.println("\nPilihan Tidak Tersedia!!!\n");
        }System.out.print("\nIngin menghitung Volume Lagi (y/t)? ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    }
    while (ulang!= 't');
            
            
        }else{
            System.out.println("\nPilihan Tidak Tersedia!!!\n");
        }
        System.out.print("\nIngin menghitung Luas dan Volume lagi (y/t)? ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    }
    while (ulang!= 't');
    
    System.out.println("Terimakasih...");
        
       
    }
}
