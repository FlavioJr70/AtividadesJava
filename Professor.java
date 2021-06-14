import java.util.Scanner;

public class Professor{

    //atributos

    int matricula;
    String nome;
    String disciplina;
    double qdtAulas;   
    
    Scanner leia = new Scanner(System.in);

    //criando metodos para o cadastro do professor

    public void CadastroNovoProfessor(){
        System.out.println("Cadastro de novo Professor"+
        "\n***************************\n");
        System.out.println("Informe o nome completo do Professor(a):");
        nome = leia.nextLine();

        System.out.println("Qual disciplina"+" "+nome+" "+"lesciona:");
        disciplina = leia.next();

        System.out.println("Número da matrícula"+" "+nome+" "+":");
        matricula = leia.nextInt();

        System.out.println("Quantidade de aulas"+" "+nome+" "+"possui:");
        qdtAulas = leia.nextDouble();

        System.out.println("Sucesso! " + nome + "," + matricula + " foi cadastrado(a) com sucesso na "
        + "disciplina de " + disciplina + " com " + qdtAulas + " aulas"); 

        System.out.println(" "+
        "\n deseja cadastrar um novo professor? [S / N ]");
        String decisao = leia.next();

        if("S".equals(decisao)) CadastroNovoProfessor();
        if("N".equals(decisao)) System.out.println("Fim do programa");

    }
    public static void main(String args[]){

        //estânciando/criando um objeto 

        Professor cadastro = new Professor();

        //chamando o metodo para cadastrar um professor

        cadastro.CadastroNovoProfessor();
    }
}
