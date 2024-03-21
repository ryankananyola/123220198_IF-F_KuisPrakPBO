/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perhitungan;

/**
 *
 * @author Lab Informatika
 */
public class MajalahAnak implements HitungHarga{
    
    private double jumlah,totalharga;
    
    public MajalahAnak(double jumlah, double totalharga){
        this.jumlah = jumlah;
        this.totalharga = totalharga;
    }
    
    public double getjumlah(){
        return jumlah;
    }
    
    public void setjumlah(double jumlah){
        this.jumlah = jumlah;
    }
    
    public double gettotalharga(){
        return jumlah;
    }
    
    public void settotalharga(double jumlah){
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
