import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Criar um programa que calcule a média de salários de uma
//        empresa, pedindo ao usuário a grade de funcionários e os
//        salários, e devolvendo a média salarial.

        List<String> lista = new ArrayList();


        String nome="";
        double salario;
        double soma=0.0;
        double media=0.0;
        int cont=0;
        boolean condicao=true;

        int funcionarios;
        System.out.println(" Digite quantos funcionários a sua empresa tem ");
        funcionarios=sc.nextInt();

        double[] dados = new double[funcionarios];

        for (int i=0; i<dados.length; i++){

            System.out.println("Entre com os dados do " + (i+1) + "º" + " Funcionário ");
            System.out.println("Nome: ");
            nome=sc.next();

            System.out.println("Salário: ");
            salario=sc.nextDouble();

            lista.add(nome);
            lista.add(String.valueOf(salario));

            if (condicao==true){
                cont++;
                soma+=salario;
                media=soma/cont;
            }

            System.out.println("Nome do Funcionário -> " + nome);
            System.out.println("Salário do Funcionário -> " + salario);
            System.out.println();
        }

        System.out.printf("Média salarial da empresa %.2f\n ", media);

        System.out.println("Lista completa dos dados: ");
        for (String l:lista) {
            System.out.println(l);
        }

        sc.close();


    }

}
