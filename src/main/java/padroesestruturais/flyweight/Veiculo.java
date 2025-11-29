package padroesestruturais.flyweight;

public class Veiculo {

    private String placa;
    private String modelo; // Ex: "Sedan", "Hatch", "SUV"
    private Cor cor; // O Flyweight compartilhado

    public Veiculo(String placa, String modelo, Cor cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String exibirDetalhes() {
        return "Veiculo{" +
                "placa='" + this.placa + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", cor='" + cor.getNome() + '\'' +
                ", codigoHex='" + cor.getCodigoHex() + '\'' +
                '}';
    }
}