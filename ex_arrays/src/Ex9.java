import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        Crie um programa para exibir a soma de 20 números usando
//        uma matriz.

        int linh1,linh2;
        int i=0;
        int j=0;
        int soma=0;

        System.out.println("Digite a quantidade de colunas ");
        linh1=sc.nextInt();
        System.out.println("Digite a quantidade de numeros da  linha ");
        linh2=sc.nextInt();


        int[][]vetorA = new int[linh1][linh2];



        for ( i = 0; i <vetorA.length ; i++) {
            for ( j = 0; j < vetorA[i].length; j++) {
                System.out.println("Digite os valores da linha");
                vetorA[i][j]=sc.nextInt();
                soma+=vetorA[i][j];
            }
        }

        System.out.println("Matriz A");
        for ( i = 0; i < vetorA.length; i++) {
            for ( j = 0; j < vetorA[i].length; j++) {
                System.out.print(vetorA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma da Matriz A -> "+ soma);


        sc.close();

    }
}
