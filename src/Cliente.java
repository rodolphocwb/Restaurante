public class Cliente {
    private String nome;
    private float saldoDinheiro;

    public Cliente(String nome, float saldoDinheiro) {
        this.nome = nome;
        this.saldoDinheiro = saldoDinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldoDinheiro() {
        return saldoDinheiro;
    }

    public void setSaldoDinheiro(float saldoDinheiro) {
        this.saldoDinheiro = saldoDinheiro;
    }
}
