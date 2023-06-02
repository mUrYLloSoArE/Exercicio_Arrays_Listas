import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Crie um programa para exibir o inteiro fornecido pelo usuário
//        na ordem inversa.



 // ignora aqui eu fui pesquisar como faz um numero invertido
        // então eu peguei um algoritmo puro e escrito e traduzi em java
        // e inclusive foi legal a experiencia

//        int num=0;
//        System.out.println("Digite um número para ve-lo invertido ");
//        num = sc.nextInt();
//        int auxiliar = num;
//        int numNovo = 0;
//        while (auxiliar > 0) {
//            numNovo = numNovo * 10 + (auxiliar % 10);
//            auxiliar =// auxiliar / 10;
//        }
//        System.out.println("Número invertido "+ numNovo );


        
        int num=0;
        System.out.println("Digite um número de posições do array ");
        num = sc.nextInt();
        int[] arr=new int[num];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Digite os números");
            arr[i]=sc.nextInt();
        }
        System.out.println(" Array invertido ");
          for (int i=arr.length-1; i>=0; i--){
              System.out.println(arr[i]);
          }

        sc.close();

    }
}
