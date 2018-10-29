/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Konsep perhitungan volume bangun ruang menggunakan abstraksi
 *
 */
public class Main {

    public static void main(String[] args) {
        Bola bol = new Bola();
        System.out.println("====Bola====");
        bol.setJariJari(7);
        System.out.println("Jari jari : "+bol.getJariJari()+" cm");
        System.out.println("Hasil Volume : "+Math.ceil(bol.hitungVolume())+" cm3");

        Tabung tab = new Tabung();
        System.out.println("\n====Tabung====");
        tab.setJariJari(10);
        tab.setTinggi(21);
        System.out.println("Jari-jari : "+tab.getJariJari()+" cm");
        System.out.println("Tinggi : "+tab.getTinggi()+" cm");
        System.out.println("Hasil Volume : "+Math.ceil(tab.hitungVolume())+" cm3");

        Kerucut ker = new Kerucut();
        System.out.println("\n====Kerucut====");
        ker.setJariJari(14);
        ker.setTinggi(9);
        System.out.println("Jari-jari : "+ker.getJariJari()+" cm");
        System.out.println("Tinggi \t: "+ker.getTinggi()+" cm");
        System.out.println("Hasil Volume : "+Math.ceil(ker.hitungVolume())+" cm3");
    }

}
