package models;

public class Resultado {
    private String algoritmo;
    private String escenario;
    private int sample;
    private double tiempoNano;
    private double tiempoMillis;

    public Resultado(){

    }
    public Resultado(String algoritmo, String escenario, int sample, double tiempoNano){
        this.algoritmo = algoritmo;
        this.escenario = escenario;
        this.sample = sample;
        this.tiempoNano= tiempoNano;
        tiempoMillis = tiempoNano / 1000000;
    }
    public String getAlgortimo(){
        return algoritmo;
    }
    public void setAlgoritmo(String algoritmo){
        this.algoritmo= algoritmo;
    }
    public String getEscenario(){
        return escenario;
    }
    public void setEscenario(String escenario){
        this.escenario = escenario;
    }
    public int getSample(){
        return sample;
    }
    public void setSample(int sample){
        this.sample = sample;
    }
    public double getTiempoNano(){
        return tiempoNano;
    }
    public void setTiempoNano(double tiempoNano){
        this.tiempoNano = tiempoNano;
    }
    public double getTiempoMilli(){
        return tiempoMillis;
    }
    public void setTiempoMillis(double tiempoNano){
        tiempoMillis = tiempoNano/1000000;
    }
}