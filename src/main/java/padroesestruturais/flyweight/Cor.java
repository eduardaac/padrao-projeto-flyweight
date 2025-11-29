package padroesestruturais.flyweight;

public class Cor {

    private String nome;
    private String codigoHex;

    public Cor(String nome, String codigoHex) {
        this.nome = nome;
        this.codigoHex = codigoHex;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoHex() {
        return codigoHex;
    }
}