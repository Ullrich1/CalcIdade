import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int anoAtual = 2024;
        int meses;
        int dia;


        System.out.println("Digite o ano");
        int anoNascimento = ler.nextInt();
        int idade = anoAtual - anoNascimento;

        System.out.println("Digite o mês");
        meses = ler.nextInt();
        meses = idade * 12;

        System.out.println("Digite o dia");
        dia = ler.nextInt();
        dia = meses * 365;

        System.out.println("Idade: "+idade+"\nMeses: "+meses+"\nDias: "+dia);

        //resultado
        System.out.println("---Calculadora de idade---");
        System.out.println("|Você nasceu em:"+anoNascimento+"|");
    }
}