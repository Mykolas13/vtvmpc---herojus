package lt.vtvpmc.cincikas.project2;

public class Herojus {
    private String vardas;
    private boolean gerietis;
    private Sarvai sarvai;

    public Herojus(String vardas, boolean gerietis, Sarvai sarvai) {
        this.vardas = vardas;
        this.gerietis = gerietis;
        this.sarvai = sarvai;
    }

    public String getVardas() {
        return vardas;
    }
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }
    public boolean isGerietis() {
        return gerietis;
    }
    public void setGerietis(boolean gerietis) {
        this.gerietis = gerietis;
    }
    public Sarvai getSarvai() {
        return sarvai;
    }
    public void setSarvai(Sarvai sarvai) {
        this.sarvai = sarvai;
    }

    @Override
    public String toString() {
        return "As esu "+(gerietis?"gerasis ":"blogasis ")+vardas+" su "+sarvai.getPavadinimas()+" sarvais";
    }
}
