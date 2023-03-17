package exercicios.bola;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Bola bolinha = new Bola();
        bolinha.trocaCor("vermelho");
        bolinha.circunferencia = 10.5;
        bolinha.material = "metal";

        JOptionPane.showMessageDialog(null, ""
                + "Cor: " + bolinha.mostrarCor() + "\n"
                + "Circunferência: " + bolinha.circunferencia + "\n"
                + "Material: " + bolinha.material + "\n");
    }
}