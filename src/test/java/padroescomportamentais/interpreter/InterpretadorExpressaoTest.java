package padroescomportamentais.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste Interpretador")
class InterpretadorExpressaoTest {

    NumeroParaRomano numeroParaRomano = NumeroParaRomano.getInstance();

    @Test
    @DisplayName("Realizar soma e conversão")
    void deveCalcularExpressaoSoma() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesNumerica("6 + 2");
        assertEquals("VIII", numeroParaRomano.toRoman(interpretador.interpretar()));
    }

    @Test
    @DisplayName("Realizar subtração e conversão")
    void deveCalcularExpressaoSubtracao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesNumerica("6 - 2");
        assertEquals("IV", numeroParaRomano.toRoman(interpretador.interpretar()));
    }

    @Test
    @DisplayName("Realizar multiplicação e conversão")
    void deveCalcularExpressaoMultiplicacao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesNumerica("6 * 2");
        assertEquals("XII", numeroParaRomano.toRoman(interpretador.interpretar()));
    }

    @Test
    @DisplayName("Realizar divisão e conversão")
    void deveCalcularExpressaoDivisao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesNumerica("6 / 2");
        assertEquals("III", numeroParaRomano.toRoman(interpretador.interpretar()));
    }

    @Test
    @DisplayName("Realizar combinar operação e conversão")
    void deveCalcularExpressaoCombinada() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesNumerica("10 / 2 * 3 + 1 - 4");
        assertEquals("XII", numeroParaRomano.toRoman(interpretador.interpretar()));
    }

    @Test
    @DisplayName("Realizar operacao com formula e conversão")
    void deveCalcularExpressaoComFormula() {
        String expressao = "nota1 * 2 + nota2";

        expressao = expressao.replace("nota1", "2");
        expressao = expressao.replace("nota2", "5");

        InterpretadorExpressao interpretador = new InterpretadorExpressoesNumerica(expressao);
        assertEquals("IX", numeroParaRomano.toRoman(interpretador.interpretar()));
    }

    @Test
    @DisplayName("Elemento invalido")
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesNumerica("2 ^ 2");
            assertEquals("IV", numeroParaRomano.toRoman(interpretador.interpretar()));
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    @DisplayName("Excecao invalida")
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesNumerica("2 +");
            assertEquals("IV", numeroParaRomano.toRoman(interpretador.interpretar()));
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }


}
