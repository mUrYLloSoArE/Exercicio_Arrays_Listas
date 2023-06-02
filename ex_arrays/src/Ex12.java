import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Ler um vetor A com 20 elementos. Construir dois vetores B e
//        C, sendo que nos vetor B e C serão armazenados o valores
//        pares e ímpares de A, respectivamente.

        // Joy aqui eu armazenei os valores par no vetorB e os impares no C

        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int[] vetorC = new int[20];


        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com valor da posição do Vetor A " + (i+1));
            vetorA[i]=sc.nextInt();
            vetorB[i]=vetorA[i];
            vetorC[i]=vetorA[i];
        }

        System.out.println("Vetor A ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i]);
        }

        System.out.println("Vetor B com valores par de A ");
        for (int i=0; i<vetorA.length; i++){
            if ((i-1)%2==0){
                System.out.println(vetorB[i]);
            }
        }

        System.out.println("Vetor C com valores impares de A ");
        for (int i=0; i<vetorA.length; i++){
            if ((i+1)%2==1){
                System.out.println(vetorC[i]);
            }
        }
        sc.close();
    }
}
