public class Kerucut extends BangunRuang{

//    private double jariJari;
//    private double tinggi;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume() {
        return Math.PI*jariJari*jariJari*tinggi/3;
    }

}
