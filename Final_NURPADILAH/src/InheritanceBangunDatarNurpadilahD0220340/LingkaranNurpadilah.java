
package InheritanceBangunDatarNurpadilahD0220340;

import java.util.Scanner;


public class LingkaranNurpadilah extends BangunDatarNurpadilahD0220340{
    Scanner input = new Scanner(System.in);
    // jari-jari lingkaran
    float r;
    
    @Override
    float luas(){
        System.out.println("\n----------------------------");
        System.out.println("Menghitung Luas Lingkaran\n");
        System.out.print("Masukkan jari-jari (r) : ");
        r = input.nextFloat();
        float luas = (float) (Math.PI * r * r);
        
        System.out.println("r (jari-jari) = " + r+"\n");
        System.out.println("Luas = 3.14 x r x r");
        System.out.println("Luas = 3.14 x "+r +" x "+r);
        System.out.println("Luas = " + luas);
        return luas;
    }
    @Override
    float volume(){
        System.out.println("\n-------------------------------");
        System.out.println("Menghitung Volume Lingkaran\n");
        System.out.print("Masukkan jari-jari (r) : ");
        r = input.nextFloat();
        float volume = (float) (Math.PI * r * r);
        System.out.println("\nVolume = 3.14 x r x r");
        System.out.println("Volume = 3.14 x "+r +" x "+r);
        System.out.println("Volume: " + volume);
        System.out.println("------------------------------------\n");
        return volume;
    }
    
}
