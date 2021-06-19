package Conversordemoedas;
import java.util.Scanner;

public class conversor {
    
    double dolar = 5.09;
    double euro = 6.04;
    double remimbi = 0.79;

    Scanner leia = new Scanner(System.in);
    

    public void menu(){
        System.out.println("**************************************");
        System.out.println("*Informa a moeda que deseja converter*");
        System.out.println("********[1] => Real para dolar *******");
        System.out.println("********[2] => Real para Euro ********");
        System.out.println("********[3] => Real para Remimbi *****");
        System.out.println("********[4] => Fechar programa *******");
        System.out.println("**************************************");
    }
    public void realparadolar(){
        System.out.print("Digite o valor em reais => ");
        double converter = leia.nextDouble();
        Double saida = converter/dolar;
        Integer valor = saida.intValue();
        System.out.println("O valor em dolar é "+valor+" dolares");
    }
    public void realparaeuro(){
        System.out.print("Digite o valor em reais => ");
        double converter = leia.nextDouble();
        Double saida = converter/euro;
        Integer valor = saida.intValue();
        System.out.println("O valor em Euro é "+ valor+" Euros");
    }
    public void realpararemimbi(){
        System.out.print("Digite o valor em reias => ");
        double converter = leia.nextDouble();
        Double saida = converter/remimbi;
        Integer valor = saida.intValue();
        System.out.println("O valor em Remimbi é "+valor+" Remimbi");
    }
    
    public static void main(String[] args) {
       while(true){
           conversor novo = new conversor();
           novo.menu();
           var entrada = new Scanner(System.in);
           int opcao = entrada.nextInt();
           entrada = null;
           if(opcao==4){
               System.out.println("Fim do programa");
                break;}
            if(opcao==1){
                novo.realparadolar();
            }
            if(opcao==2){
                novo.realparaeuro();
            }
            if(opcao==3){
                novo.realpararemimbi();
            }
}
}
}
