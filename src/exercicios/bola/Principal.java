package exercicios.bola;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Bola bolinha = new Bola();

        bolinha.trocarCor(JOptionPane.showInputDialog("Qual a cor?"));

        bolinha.trocarCircunferencia(Double.parseDouble(JOptionPane.showInputDialog("Qual a circunferência?")));

        bolinha.trocarMaterial(JOptionPane.showInputDialog("Qual a material?"));

        JOptionPane.showMessageDialog(null, ""
                + "Cor: " + bolinha.mostrarCor() + "\n"
                + "Circunferência: " + bolinha.mostrarCircunferencia() + "\n"
                + "Material: " + bolinha.mostrarMaterial() + "\n");
    }
}