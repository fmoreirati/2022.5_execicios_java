// Comando git para liberar o SSL: 
// git config --global http.sslbackend schannel

package exercicios;

public class Principal {

    public static void main(String[] args) {
//        int valor = 3;
//        
//        if (valor % 2 == 0){
//            System.out.print("PAR");
//        }else{
//            System.out.print("IMPAR");
//        };

            Numero numero = new Numero();
            numero.valor =4;
            System.out.print(numero.parInpar());
    }
    
}
