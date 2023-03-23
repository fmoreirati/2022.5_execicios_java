package exercicios.pessoa;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Inicio {
    public static void main(String[] args) {
        try {
            Pessoa pessoa = new Pessoa();

            // SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            // Date data = formato.parse("21/10/1980");
            // pessoa.setData_nasc(data);

            pessoa.setNome("Ana");
            pessoa.setAltura(1.55f);
            pessoa.setIdade(15);
            pessoa.setPeso(80f);
            getPessoa(pessoa);

            pessoa.envelhecer(10);
            getPessoa(pessoa);

        } catch (Exception e) {
            System.err.println("Erros: " + e.getMessage());
        }
    }

    private static void getPessoa(Pessoa pessoa) {
        System.out.println(""
                + "Nome :" + pessoa.getNome() + " | "
                + "Peso :" + String.format("%.2f", pessoa.getPeso()) + " | "
                + "Alura:" + String.format("%.2f", pessoa.getAltura()) + " | "
                + "Idade:" + pessoa.getIdade() + " | ");
    }
}
