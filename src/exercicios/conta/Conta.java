package exercicios.conta;

public class Conta {
    /*
     * Classe Conta Corrente: Crie uma classe para implementar uma conta corrente. A
     * classe deve possuir os seguintes atributos: número da conta, nome do
     * correntista e saldo.
     * Os métodos são os seguintes: alterarNome, depósito e saque;
     * No construtor, saldo é opcional, com valor default zero e os demais atributos
     * são obrigatórios.
     */

    private String nome;
    private String numero;
    private double saldo;

    public Conta(String nome, String numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (!numero.equals("")) {
            this.numero = numero;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void saque(double valor) throws Exception {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            throw new Exception("Insuficiente na conta!");
        }
    }

}
