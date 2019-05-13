
package test;


public class Draciel extends Beyblade { //Max ' ın beyblad 'i  dir.
    private String kutsalCanavar;

    public Draciel(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavar Adı: " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCik() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " 'ı ortaya çıkarıyor... "); 
        System.out.println(getBeybladeci() + " 'ın Savunması : Kale Savunması"); 
    }
    
    
}
