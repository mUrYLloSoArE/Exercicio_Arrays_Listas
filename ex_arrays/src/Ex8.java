import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Crie um programa para exibir todos os inteiros dentro do
//            intervalo 100-150 cuja soma de todos os dígitos é um número
//        par.

        int num=150;
        int soma=0;


        for (int i =num; i >=100 ; i--) {
            int unidade=i%10;
            int dezena=(i%100)/10;
            int centena=(i/100);
            int somaDigito=unidade+dezena+centena;
            System.out.println(i + " Soma dos digitos -> " + somaDigito);
            if (somaDigito%2==0){
                soma+=i;
            }
        }
        System.out.println("Soma dos numeros com digitos pares  do intervalo " + soma);

        sc.close();

    }
}
