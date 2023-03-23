package exercicios.pessoa;

import java.util.Date;
import java.util.Calendar;

public class Pessoa {
    /*
     * Crie uma classe que modele uma pessoa:
     * a. Atributos: nome, idade, peso e altura
     * b. Métodos: Envelhercer, engordar, emagrecer, crescer.
     * Obs: Por padrão, a cada ano que nossa pessoa envelhece, sendo a idade dela
     * menor que 21 anos,
     * ela deve crescer 0,5 cm
     */

    private String nome;
    private int idade;
    private float peso;
    private float altura;
    private Date data_nasc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        try {
            Calendar dataCalendar = Calendar.getInstance();
            int anoAtual = dataCalendar.get(Calendar.YEAR);
            dataCalendar.setTime(data_nasc);
            return anoAtual - dataCalendar.get(Calendar.YEAR);
        } catch (Exception e) {
            return idade;
        }
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void envelhecer() {
        if (getIdade() < 21) {
            crescer(null);
        }
    }

    public void envelhecer(int anos) {
        this.idade = getIdade();
        for (int cont = 1; cont <= anos; cont++) {
            if (this.idade < 21) {
                crescer(null);
            }
            this.idade += 1;
        }
    }

    public void engordar(float peso) {
        if (peso > 0) {
            this.peso += peso;
        }
    }

    public void emagrecer(float peso) {
        if (peso > 0) {
            this.peso -= peso;
        }
    }

    public void crescer(Float altura) {
        if (altura == null) {
            this.altura += .05f;
        } else {
            this.altura += altura;
        }
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(java.util.Date data) {
        this.data_nasc = data;
    }

}
