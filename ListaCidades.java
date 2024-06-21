import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCidades {

    public static void main(String[] args) {
        List<Cidades> cidades = new ArrayList<>();
        cidades.add(new Cidades("Maringá", 1, 200000, 150));
        cidades.add(new Cidades("Londrina", 2, 300000, 200));
        cidades.add(new Cidades("Cascavel", 3, 100000, 100));
        cidades.add(new Cidades("Ponta Grossa", 4, 150000, 120));
        cidades.add(new Cidades("Foz do Iguaçu", 5, 120000, 80));

        Cidades cidadeMaiorAcidentes = cidades.get(0);
        Cidades cidadeMenorAcidentes = cidades.get(0);

        double somaAcidentes = 0;
        double somaVeiculos = 0;

        for (Cidades cidade : cidades) {
            if (cidade.getNumeroAcidentes() > cidadeMaiorAcidentes.getNumeroAcidentes()) {
                cidadeMaiorAcidentes = cidade;
            }
            if (cidade.getNumeroAcidentes() < cidadeMenorAcidentes.getNumeroAcidentes()) {
                cidadeMenorAcidentes = cidade;
            }
            somaAcidentes += cidade.getNumeroAcidentes();
            somaVeiculos += cidade.getQuantidadeVeiculos();
        }

        System.out.println("Cidade com o maior número de acidentes: " + cidadeMaiorAcidentes.getNome());
        System.out.println("Cidade com o menor número de acidentes: " + cidadeMenorAcidentes.getNome());

        for (Cidades cidade : cidades) {
            System.out.printf("Média anual de acidentes em %s: %.2f%%\n", cidade.getNome(), cidade.calcularMediaAcidentes() * 100);
        }

        double mediaTotalAcidentes = somaAcidentes / somaVeiculos;
        System.out.printf("Média total de acidentes das cidades pesquisadas: %.2f%%\n", mediaTotalAcidentes * 100);
    }
}
