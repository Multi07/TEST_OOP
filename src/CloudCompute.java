public class CloudCompute implements ICloudService{
    private String nazev;
    private double cenaZaHodinu;
    private int pocetSpusteni;
    private boolean spusteno;

    @Override
    public void spustSluzbu() {
        if (!spusteno) {
            System.out.println("Výpočetní služba byla spuštěno");
            pocetSpusteni++;
            spusteno = true;
        }else {
            System.out.println("Výpočetní služba už je spuštěna");
        }

    }

    @Override
    public void zastavSluzbu() {
        if (spusteno) {
            System.out.println("Výpočetní služba byla zastaveno");
            spusteno=false;
        }else {
            System.out.println("Výpočetní služba není spuštěná");
        }

    }

    @Override
    public double vypocitejNaklady(int hodiny) {
        double am = cenaZaHodinu;
        am*=hodiny;
        return am;
    }

    @Override
    public String getNazev() {
        return nazev;
    }

    @Override
    public String Vypis() {
        return "nazev='" + nazev + '\'' +
                ", cenaZaHodinu=" + cenaZaHodinu +
                ", Pocet Spusteni=" + pocetSpusteni;
    }

    public CloudCompute(double cenaZaHodinu, int pocetSpusteni) {
        this.nazev = "CloudCompute";
        this.cenaZaHodinu = cenaZaHodinu;
        this.pocetSpusteni = pocetSpusteni;
    }
}
