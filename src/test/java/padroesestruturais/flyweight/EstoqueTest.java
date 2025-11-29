package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {

    @Test
    void deveRetornarDetalhesVeiculos() {
        Estoque estoque = new Estoque();
        estoque.adicionarVeiculo("ABC1234", "Sedan", "Vermelho", "#FF0000");
        estoque.adicionarVeiculo("DEF5678", "Hatch", "Azul", "#0000FF");
        estoque.adicionarVeiculo("GHI9012", "SUV", "Vermelho", "#FF0000"); // Mesma cor
        estoque.adicionarVeiculo("JKL3456", "Caminhonete", "Preto", "#000000");

        List<String> saida = Arrays.asList(
                "Veiculo{placa='ABC1234', modelo='Sedan', cor='Vermelho', codigoHex='#FF0000'}",
                "Veiculo{placa='DEF5678', modelo='Hatch', cor='Azul', codigoHex='#0000FF'}",
                "Veiculo{placa='GHI9012', modelo='SUV', cor='Vermelho', codigoHex='#FF0000'}",
                "Veiculo{placa='JKL3456', modelo='Caminhonete', cor='Preto', codigoHex='#000000'}");

        assertEquals(saida, estoque.obterDetalhesVeiculos());
    }

    @Test
    void deveRetornarTotalCoresUnicas() {
        Estoque estoque = new Estoque();
        estoque.adicionarVeiculo("ABC1234", "Sedan", "Vermelho", "#FF0000");
        estoque.adicionarVeiculo("DEF5678", "Hatch", "Azul", "#0000FF");
        estoque.adicionarVeiculo("GHI9012", "SUV", "Vermelho", "#FF0000"); // Reutiliza a cor "Vermelho"
        estoque.adicionarVeiculo("MNO6789", "Van", "Azul", "#0000FF"); // Reutiliza a cor "Azul"
        estoque.adicionarVeiculo("JKL3456", "Caminhonete", "Preto", "#000000");

        // O total de veículos é 5, mas o total de objetos Cor únicos deve ser 3 ("Vermelho", "Azul", "Preto")
        assertEquals(3, CorFactory.getTotalCores());
    }

}