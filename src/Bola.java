public class Bola extends BangunRuang{

//    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return 4*Math.PI*jariJari*jariJari*jariJari/3;
//        return 4*22/7*jariJari*jariJari*jariJari/3;
    }

}
