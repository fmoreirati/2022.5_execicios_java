package exercicios;

public class Numero {
    int valor;
    
    public String parInpar(){
        if(this.valor % 2 ==0 ){
            return "PAR";
        }else {
            return "IMPAR";
        }
    }
}
