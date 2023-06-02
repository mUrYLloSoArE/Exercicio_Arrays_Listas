import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Criar um vetor A com 10 elementos inteiros. Implementar um
//        programa que defina e escreva a média aritmética simples
//        dos elementos ímpares armazenados neste vetor.


        int soma=0;
        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com valor da posição " + (i+1));
            vetorA[i]=sc.nextInt();
            if (i%2==1){
                soma+=i;
            }
        }

        System.out.println("Vetor A ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i]);
        }

        System.out.println(" Soma dos números impares " + soma);

        sc.close();

    }
}
