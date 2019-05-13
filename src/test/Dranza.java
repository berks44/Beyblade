
 
package test;


public class Dranza extends Beyblade { //Kai 'nin beyblade ' i dir.
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
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
        System.out.println(getBeybladeci() + " 'ın Saldırısı : Alev Kılıcı");
    }
    
}
