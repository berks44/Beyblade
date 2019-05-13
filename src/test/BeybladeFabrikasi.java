
package test;


public class BeybladeFabrikasi {//Burada istediğimiz beyblade 'in üretimini sağlayacağız.
    public Beyblade beybladeUret(String beyblade_turu){
        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Takao",800,500,"Mavi Ejderha","Kutsal Canavarla Konuşma");
        }
        else if(beyblade_turu.equals("Dranza")){
            return new Dranza("Kai", 1000 , 1200 ,"Kırmızı Anka Kuşu");
        }
        else if(beyblade_turu.equals("Drayga")){
            return new Dranza("Rei", 600 , 400 ,"Beyaz Kaplan");
        }
        else if(beyblade_turu.equals("Draciel")){
            return new Dranza("Max", 450 , 1500 ,"Kara Kaplumbağa");
        }
        else {
            return null;
        }
        
    }
    
}
