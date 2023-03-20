package exercicios.quadrado;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Inicio {
    public static void main(String[] args) {
        List<Quadrado> quadrados = new ArrayList<>();
        String dadosEntrada = " ";
        while (!dadosEntrada.equals("")) {
            try {
                Quadrado quadrado = new Quadrado();
                dadosEntrada = JOptionPane.showInputDialog(null, "Qual o tamanho do lado?");
                if (!dadosEntrada.equals("")) {
                    quadrado.setLado(Float.parseFloat(dadosEntrada));
                    JOptionPane.showMessageDialog(null, ""
                            + "Tamanho do lado: " + quadrado.getLado() + "\n"
                            + "Area do Quadrado: " + quadrado.calcularArea() + "\n");
                    ;
                    quadrados.add(quadrado);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor invalido!");
                dadosEntrada = " ";
            }
        }
    }
}
