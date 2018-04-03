
package praktek002;


public class PersegiAksi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        p1.sisi =5; 
        
        p1.cetakInfo();
        System.out.println("Luas Persegi    ="+luasPersegi());
        p1.cetakLuas();
    }
}
