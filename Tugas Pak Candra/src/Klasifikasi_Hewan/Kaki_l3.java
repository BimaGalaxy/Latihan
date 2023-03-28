


package Klasifikasi_Hewan;
import java.util.ArrayList;
public class Kaki_l3 extends Berkaki_banyak {
    @Override
    void data_hewan (){
        ArrayList<String> hewan = new ArrayList<String>();
        System.out.println("Hewan berkaki lebih dari tiga pasang : ");
        hewan.add("- Scorpion\n");
        hewan.add("- Spider\n");
        hewan.add("- Miliipede");
        System.out.println(hewan);
    }
}
