
package praktek002;


public class Persegi {
    double sisi;
    
    
    void cetakInfo(){
        System.out.println("+==================+");
        System.out.println("sisi     :"+sisi);
        System.out.println("+==================+");
    }
    
    double luasPesregi(){
        double luas;
        luas =sisi*sisi;
        return luas; 
    }
}
