
package test;

import java.util.Scanner;


public class Test {

    
    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldiniz!!!");
        System.out.println("Çıkış için x e basınız.");
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi Beyblade ' i üretmek istiyorsunuz(Dragon,Dranza,Drayga,Draciel)?");
            String islem = scanner.nextLine();
            if(islem.equals("x")){
                System.out.println("Programdan Çıktınız!!!");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if(beyblade == null)
                {
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz!!!");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCik();
                }
            }
            
            
        }
        
    }
    
}
