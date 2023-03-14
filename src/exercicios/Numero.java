package exercicios;

public class Numero {
    int valor;
    
    public String parImpar(){
        if(this.valor % 2 ==0 ){
            return "PAR";
        }else {
            return "IMPAR";
        }
    }

    public String parImpar(int valor){
        return "";
    }

// 7) Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles. 
    public int maiorValor(int valor1, int valor2){
        if(valor1 > valor2){
            return valor1;
        }
        return valor2;
    }

    public String ordenarCrescente(int valor1, int valor2, int valor3){
        return "";
    }
}



