import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Crie um programa para verificar se o inteiro fornecido é um
//        múltiplo de 5 e 7

        int num;
        System.out.println("Digite um número para descobrir se ele é multiplo de 7 e 5");
        num=sc.nextInt();

        if (num%5==0 && num%7==0){
            System.out.println(num + " É número múltiplo de 5 e 7");
        }else {
            System.out.println(" Não é multiplo de 5 e 7 ");
        }

        sc.close();


    }

}
