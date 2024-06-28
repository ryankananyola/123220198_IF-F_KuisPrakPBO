package Perhitungan;

public class Harga implements HitungHarga {
    
    private double jumlah;
    
    public Harga(double jumlah, double totalharga){
        this.jumlah = jumlah;
    }
    
    public double getJumlah(){
        return jumlah;
    }
    
    public void setJumlah(double jumlah){
        this.jumlah = jumlah;
    }

    @Override
    public double hargaAnak() {
        return jumlah * 12700;
    }

    @Override
    public double hargaRemaja() {
        return jumlah * 15200;
    }

    @Override
    public double hargaDewasa() {
        return jumlah * 26900;
    }
}
