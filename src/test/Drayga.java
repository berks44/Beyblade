
package test;


public class Drayga extends Beyblade { //Rei ' nin beyblade'i dir.
    private String kutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
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
        System.out.println(getBeybladeci() + " 'ın Saldırısı : Kaplan Pençesi");
    }
    
    
}
