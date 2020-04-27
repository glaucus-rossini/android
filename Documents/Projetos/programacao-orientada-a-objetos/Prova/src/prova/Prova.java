package prova;

import java.time.LocalDate;
import java.time.Month;

public class Prova {

    public static void main(String[] args) {

        Endereco end1 = new Endereco();
        end1.setRua("Rua do Arvoredo");
        end1.setComplemento(147);
        end1.setBairro("Cidade Baixa");
        end1.setCidade("Porto Alegre");
        end1.setEstado("Rio Grande do Sul");
        end1.setCEP(90050165);

        Proprietario prop1 = new Proprietario("Sr. Cthulhu", 1111111111, 1085778859, end1);
        prop1.setDataDeNascimento(LocalDate.of(2014, Month.JANUARY, 1));

        Marca marca1 = new Marca();
        marca1.setNome("Chevrolet");
        marca1.setNrDeModelos(4);
        marca1.setAnoDeLancamento(1969);
        marca1.setCodigoIdentificador(1);

        Carro carro1 = new Carro(prop1);
        carro1.setModelo("Corvette");
        carro1.setCor("Vermelho");
        carro1.setAno(1970);
        carro1.setMarca(marca1);
        carro1.setChassi("9BWHE21JX24060831");
        carro1.setVelocidadeMaxima(200);
        carro1.setVelocidadeAtual(50);
        carro1.setNrPortas(2);
        carro1.setTetoSolar(Boolean.TRUE);
        carro1.setNrMarchas(4);
        carro1.setMarchaAtual(1);
        carro1.setCambioAutomatico(Boolean.FALSE);
        carro1.setVolumeCombustivel(50);

        carro1.Acelerar(400);
        carro1.Frear(Boolean.TRUE);
        carro1.AumentarMarcha(3);
        carro1.DiminuirMarcha(4);
        carro1.EfetuarMarchaRe(Boolean.TRUE);
        carro1.AbastecerCarro(50);
        carro1.CalcularAutonomia(12);

        System.out.println(carro1.toString());

    }

}
