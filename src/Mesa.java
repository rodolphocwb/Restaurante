public class Mesa {
    private int numero;
    private int lugares;
    private boolean ocupada;
    private boolean limpa;

    public Mesa(int numero, int lugares) {
        this.numero = numero;
        this.lugares = lugares;
        this.setOcupada(false);
        this.setLimpa(true);

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean isLimpa() {
        return limpa;
    }

    public void setLimpa(boolean limpa) {
        this.limpa = limpa;
    }
}
