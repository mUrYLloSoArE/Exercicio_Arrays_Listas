import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //        Escreva um programa para adicionar um elemento específico de uma
        //        lista.

        List<String> lista = new ArrayList<String>();


        lista.add("Muryllo");
        lista.add("Mattheus");
        lista.add("Michell");
        lista.add("Marianne");
        lista.add("Marli");

        System.out.println(" Elementos da Lista -> " +lista);

        lista.add(2,"João ");
        System.out.println(" Elementos da Lista com o elemento  adicionado na posição escolhida -> " +lista);


        sc.close();

    }
}
