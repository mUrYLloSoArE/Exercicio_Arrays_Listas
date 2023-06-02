import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Tem-se um conjunto de dados contendo a altura e o sexo
//        (masculino, feminino) de 10 pessoas. Fazer um algoritmo que
//        calcule e escreva:
//        a. a maior e a menor altura do grupo;
//        b. média de altura dos homens;
//        c. o número de mulheres.

        double altura=0.0;
        String sexo= "";
        double maior=0.0;
        double menor=0.0;
        double media=0.0;
        double soma=0.0;
        int contadorM=0;
        int contadorF=0;
        boolean condicao=true;


        List<String>lista = new ArrayList();

        int[] dados = new int[10];

        for (int i=0; i<dados.length; i++){

            System.out.println("Digite a sua altura");
            altura= sc.nextDouble();
            System.out.println(" Qual o seu genero? M - masculino, F - feminino ");
            sexo= sc.next();
            lista.add(sexo);
            lista.add(String.valueOf(altura));

            if (condicao == true){
                maior = altura;
                menor = altura;
            }
            condicao = false;
            if (altura>maior){
                maior=altura;
            }
            if (altura<menor){
                menor=altura;
            }
            if (sexo.equalsIgnoreCase("M")){
                contadorM++;
                soma+=altura;
                media=soma/contadorM;
            }
            if (sexo.equalsIgnoreCase("F")){
                contadorF++;
            }

        }

        System.out.println(" Lista dos Dados coletados ->" + lista);
        System.out.println(" A maior  altura é -> " + maior);
        System.out.println(" A menor  altura é -> " + menor);
        System.out.printf(" A média da altura de homens é -> %.2f\n ",media );
        System.out.println("Total de Mulheres participantes -> " + contadorF);

        sc.close();

    }

}
