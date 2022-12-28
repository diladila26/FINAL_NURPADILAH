
package InheritanceBangunDatarNurpadilahD0220340;

import java.util.Scanner;


public class PersegiNurpadilah extends BangunDatarNurpadilahD0220340 {
    float sisi, p, l, t;  
    
    Scanner input = new Scanner(System.in);
    
    @Override
    float luas(){
        System.out.println("\n---------------------------");
        System.out.println("Menghitung Luas Persegi\n");
        System.out.print("Masukkan Sisi : ");
        sisi = input.nextFloat();
        float luas = sisi * sisi;
        System.out.println("sisi (s) = " + sisi);
        System.out.println("\nLuas = s x s");
        System.out.println("Luas = "+ sisi +" x "+sisi);
        System.out.println("Luas : " + luas);
        
        return luas;
    }

    @Override
    float volume(){
        System.out.println("\n---------------------------");
         System.out.println("Menghitung Volume Persegi\n");
        System.out.print("Masukkan Panjang : ");
        p = input.nextFloat();
        System.out.print("Masukkan Lebar : ");
        l = input.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        t = input.nextFloat();
        float volume = p*l*t;
        System.out.println("\nPanjang (p) = " + p);
        System.out.println("Lebar (l) = " + l);
        System.out.println("Tinggi (t) = " + t);
        System.out.println("\nVolume = p x l x t");
        System.out.println("Volume = " +p +" x "+ l + " x "+ t);
        System.out.println("Volume : " + volume);
        System.out.println("------------------------------------\n");
        return volume;
    }
}
