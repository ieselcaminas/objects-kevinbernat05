package Ejercicios_POO.MaquinaExpendedora;

public class Cajon {
    private int n_cajon;
    private MaquinaExpendedora maquina;

    public Cajon(int n_cajon, MaquinaExpendedora maquina) {
        this.n_cajon = n_cajon;
        this.maquina = maquina;
    }

    public int getN_cajon() {
        return n_cajon;
    }

    public void setN_cajon(int n_cajon) {
        this.n_cajon = n_cajon;
    }

    public MaquinaExpendedora getMaquina() {
        return maquina;
    }

    public void setMaquina(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

}
