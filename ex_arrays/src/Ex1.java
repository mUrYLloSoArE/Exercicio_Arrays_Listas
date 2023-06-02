import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Escreva um programa para remover um elemento específico de uma
//        lista.

        List<String> lista = new ArrayList<String>();


        lista.add("Muryllo");
        lista.add("Mattheus");
        lista.add("Michell");
        lista.add("Marianne");
        lista.add("Marli");

        System.out.println(" Elementos da Lista -> " +lista);

        lista.remove(1);
        System.out.println(" Elementos da Lista com o elemento escolhido removido -> " +lista);


        sc.close();

    }
}
