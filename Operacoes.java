package Calculadora;
import java.util.Scanner;

public class Operacoes {
     
    double resultado;

    public void soma(double n1, double n2){

        resultado = n1 + n2;

        System.out.println("O resultado da soma é " + resultado);
    }
    public void subtracao(double n1,double n2){

        resultado = n1 - n2;

        System.out.println("O resultado da subtração é " + resultado);
    }
    public void multiplicacao(double n1, double n2){

        resultado = n1 * n2;

        System.out.println("O resultado da multiplicação é " + resultado);
    }
    public void divisao(double n1, double n2){

        if(n2==0){
            System.out.println("Divisão por zero não permitida");
        }
        else{

            resultado = n1/n2;

             System.out.println("O resultado da divisão é " + resultado);
        }
    } 

    Scanner leia = new Scanner(System.in);

    public void Menu(){
        System.out.println("Qual operação deseja realizar? Digite o número:\n"
                + "1 Soma\n"
                + "2 Subtração\n"
                + "3 Divisão\n"
                + "4 Multiplicação\n"
                + "0 Encerrar o programa\n");

        int opcaoSelecionada  = leia.nextInt();
        if(opcaoSelecionada ==0){
            System.exit(0);
        }

        System.out.println("Digite o primeiro Número:");
        double n1 = leia.nextDouble();

        System.out.println("Digite o segundo Número:");
        double n2 = leia.nextDouble();

        System.out.println("opção selecionada");
        if(opcaoSelecionada ==1){
            soma(n1, n2);
        }
        if(opcaoSelecionada ==2){
            subtracao(n1, n2);
        }
        if(opcaoSelecionada ==3){
            divisao(n1, n2);
        }
        if(opcaoSelecionada ==4){
            multiplicacao(n1, n2);
        }

        System.out.println("Deseja fazer uma nova operação:[ S / N]");
        String decisao = leia.next();

        if("S".equals(decisao)){
            Menu();
        }
        else{
            System.out.println("Fim do programa");
        }
    }
    
}
