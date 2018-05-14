package lt.vtvpmc.cincikas.project2;

public class Sarvai {
    private String pavadinimas;
    private double svoris;

    public Sarvai(String pavadinimas, double svoris) {
        this.pavadinimas = pavadinimas;
        this.svoris = svoris;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
    public double getSvoris() {
        return svoris;
    }
    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }
}
