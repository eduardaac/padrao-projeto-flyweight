package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(String placa, String modelo, String nomeCor, String codigoHex) {
        Cor cor = CorFactory.getCor(nomeCor, codigoHex);
        Veiculo veiculo = new Veiculo(placa, modelo, cor);
        veiculos.add(veiculo);
    }

    public List<String> obterDetalhesVeiculos() {
        List<String> saida = new ArrayList<String>();
        for (Veiculo veiculo : this.veiculos) {
            saida.add(veiculo.exibirDetalhes());
        }
        return saida;
    }
}