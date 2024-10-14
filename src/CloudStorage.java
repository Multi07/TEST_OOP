public class CloudStorage implements ICloudService{
    private String nazev;
    private double cenaZaGB;
    private int pocetSpusteni;
    private boolean spusteno = false;
    @Override
    public void spustSluzbu() {
        if (!spusteno) {
            System.out.println("Uložení bylo spuštěno");
            pocetSpusteni++;
            spusteno = true;
        }else {
            System.out.println("Ulozeni už je spuštěno");
        }

    }

    @Override
    public void zastavSluzbu() {
        if (spusteno) {
            System.out.println("Uložiště bylo zastaveno");
            spusteno=false;
        }else {
            System.out.println("Ulozeni není spuštěné");
        }

    }

    @Override
    public double vypocitejNaklady(int pocetGB) {
        double am = cenaZaGB;
        if (pocetSpusteni>100) {
            am*=2;
        }
        else if (pocetSpusteni<5) {
            am-=10;
        }
        am*=pocetGB;
        return am;
    }

    @Override
    public String getNazev() {
        return nazev;
    }

    @Override
    public String Vypis() {
        return "nazev='" + nazev + '\'' +
                ", cenaZaGB=" + cenaZaGB +
                ", pocetSpusteni=" + pocetSpusteni;
    }

    public CloudStorage(double cenaZaGB, int pocetSpusteni) {
        this.nazev = "CloudStorage";
        this.cenaZaGB = cenaZaGB;
        this.pocetSpusteni = pocetSpusteni;
    }
}
