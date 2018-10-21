/*
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN MASSA JENIS
                        KUBUS
 */
package pbo0210117043_latihan41_massajenis;

/**
 *
 * @author Acer
 */
public class PBO0210117043_latihan41_Massajenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        massa Massa = new massa();
        Massa.setSisi(5);
        Massa.setMassa(250);
        System.out.println("=====Massa Jenis Kubus=====");
       
        System.out.println("Sisi :"+Massa.getSisi());
        
        System.out.println("Massa : "+Massa.getMassa());
        
        System.out.println("=====Hasil Perhitungan=======");
        System.out.println("Volume : " + Massa.HitungVolume(5));
        System.out.println("Massa Jenis : " + Massa.HitungMassaJenis(250,+Massa.HitungVolume(5)));
        
        
      
        
       
    }
    
}
