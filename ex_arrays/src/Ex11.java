import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maior=0;
        int menor=0;
        int idade=0;
        boolean condicao=true;


//        Ler um vetor A com 10 elementos inteiros correspondentes
//        as idades de um grupo de pessoas. Escreva um programa
//        que determine e escreva a menor e a maior idades e suas
//        respectivas posições.

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println(+(i+1)+"º"+" idade ");
            vetorA[idade]=sc.nextInt();
            if (condicao == true){
                maior = vetorA[idade];
                menor = vetorA[idade];
            }
            condicao = false;
            if (vetorA[idade]>maior){
                maior=vetorA[idade];
            }
            if (vetorA[idade]<menor){
                menor=vetorA[idade];
            }

        }

        System.out.println(" A maior idade -> " + maior);
        System.out.println(" A menor idade -> " + menor);

        sc.close();
    }
}
