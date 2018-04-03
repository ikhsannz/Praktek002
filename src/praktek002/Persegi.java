
package praktek002;


public class Persegi {
    double sisi;

    public Persegi() {
        sisi=3;
    } 

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
     
    
    void cetakInfo(){
        System.out.println("+==================+");
        System.out.println("sisi     :"+sisi);
        System.out.println("+==================+");
    }
    
    double luasPersegi(){
        double luas;
        luas =sisi*sisi;
        return luas; 
    }
    
    void cetakLuas(){
    System.out.println("Luasnya adalah: "+luasPersegi());
    }  
    
}
