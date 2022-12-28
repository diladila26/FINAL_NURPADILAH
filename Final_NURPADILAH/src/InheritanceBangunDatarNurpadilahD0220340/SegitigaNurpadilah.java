
package InheritanceBangunDatarNurpadilahD0220340;

import java.util.Scanner;


public class SegitigaNurpadilah extends BangunDatarNurpadilahD0220340 {
    Scanner input = new Scanner(System.in);
    float alas, tinggi, prisma;
   
    
    @Override
    float luas() {
        System.out.println("\n---------------------------");
        System.out.println("Menghitung Luas  Segitiga");
        System.out.print("Masukkan Alas : ");
        alas = input.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        tinggi = input.nextFloat();
        float luas = (float) (0.5 * alas * tinggi);
        System.out.println("\nalas = " + alas);
        System.out.println("tinggi = " + tinggi);
        System.out.println("\nLuas = 1/2 x alas x tinggi");
        System.out.println("Luas = 1/2 x "+ alas +" x "+tinggi);
        System.out.println("Luas = " + luas);
        
        return luas;
    } 
    
    @Override
    float volume() {
        System.out.println("\n---------------------------");
        System.out.println("Menghitung Volume Segitiga");
        System.out.print("Masukkan Alas : ");
        alas = input.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        tinggi = input.nextFloat();
        System.out.print("Masukkan Tinggi Prisma : ");
        prisma = input.nextFloat();
        float volume = (float) (0.5 * alas * tinggi * prisma);
        System.out.println("\nalas = " + alas);
        System.out.println("tinggi = " + tinggi);
        System.out.println("tinngiprisma = " + prisma);
        System.out.println("\nLuas = 1/2 x alas x tinggi x tinggiprisma");
        System.out.println("Luas = 1/2 x "+ alas +" x "+tinggi+" x "+ prisma);
        System.out.println("Volume Segitiga: " + volume);
        System.out.println("------------------------------------\n");
        return volume;
    }   
}
