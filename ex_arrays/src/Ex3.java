import java.util.*;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        Peça ao usuário dois números e exiba em ordem decrescente
//        (suponha números diferentes).


        int[] lista = new int[2];


        for (int i=0; i<lista.length; i++){
            System.out.println("Entre com valor da posição " + (i+1));
            lista[i]=sc.nextInt();
        }

        Arrays.sort(lista);
        System.out.println(" lista em forma decrescente ");
        for (int i=0; i<lista.length; i++){
            System.out.print(lista[2-i-1]);
        }



        sc.close();


    }

}
