// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CloudManager asistent = new CloudManager();
        ICloudService CloudStorage = new CloudStorage(50,100);
        ICloudService CloudStorage2 = new CloudStorage(55,0);
        ICloudService CloudCompute = new CloudCompute(15, 0);
        ICloudService CloudCompute2 = new CloudCompute(20, 0);
        asistent.pridejSluzbu(CloudStorage);
        asistent.pridejSluzbu(CloudStorage2);

        asistent.pridejSluzbu(CloudCompute);
        asistent.pridejSluzbu(CloudCompute2);

        asistent.spustVsechnySluzb();
        asistent.zastavVsechnySluzby();
        asistent.spustVsechnySluzb();
        asistent.zastavVsechnySluzby();
        asistent.spustVsechnySluzb();
        asistent.zastavVsechnySluzby();
        asistent.spustVsechnySluzb();
        asistent.zastavVsechnySluzby();
        asistent.spustVsechnySluzb();
        asistent.zastavVsechnySluzby();
        asistent.spustVsechnySluzb();
        asistent.zastavVsechnySluzby();

        asistent.vypisNaklady(50);
        asistent.vypisInformace();

    }
}