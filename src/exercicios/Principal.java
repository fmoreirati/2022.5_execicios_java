// Comando git para liberar o SSL: 
// git config --global http.sslbackend schannel

package exercicios;

public class Principal {
    public static void main(String[] args) {
//        int valor = 3;        
//        if (valor % 2 == 0){
//            System.out.print("PAR");
//        }else{
//            System.out.print("IMPAR");
//        };
            Numero numero = new Numero();
            numero.valor =4;
            System.out.println(numero.parImpar());
            System.out.println(numero.maiorValor(6,8));
            System.out.println(numero.ordenarCrescente(94,5,39));           
    }
    
}
