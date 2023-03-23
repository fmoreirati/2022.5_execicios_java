package exercicios.conta;

public class Inicio {
    public static void main(String[] args) {
        try {

            Conta conta = new Conta("Ana", "123456", 2300);
            getConta(conta);
            conta.deposito(200);
            getConta(conta);
            conta.saque(2000);
            getConta(conta);

        } catch (Exception e) {
            System.err.println("Erros: " + e.getMessage());
        }
    }

    private static void getConta(Conta conta) {
        System.out.println(""
                + "Conta :" + conta.getNumero() + " | "
                + "Nome :" + conta.getNome() + " | "
                + "Saldo :" + String.format("%.2f", conta.getSaldo()) + " | ");
    }
}
