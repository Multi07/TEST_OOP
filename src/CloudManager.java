import java.util.ArrayList;
import java.util.Scanner;

public class CloudManager {
    ArrayList<ICloudService> list = new ArrayList<>();


    public void pridejSluzbu(ICloudService sluzba) {
        list.add(sluzba);
    }
    public void spustVsechnySluzb() {
        for (int i =0;i< list.size();i++) {
            list.get(i).spustSluzbu();
        }
    }
    public void zastavVsechnySluzby() {
        for (int i =0;i< list.size();i++) {
            list.get(i).zastavSluzbu();
        }
    }
    public void vypisNaklady(int pocet) {
        double am = 0;
        for (int i =0;i< list.size();i++) {
            am += list.get(i).vypocitejNaklady(pocet);
        }
        System.out.println(am);
    }

    public void vypisInformace() {
        for (int i =0;i<list.size();i++) {
            System.out.println(list.get(i).Vypis());
        }
    }
}
