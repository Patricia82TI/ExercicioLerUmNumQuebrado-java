import java.util.Scanner;

//Faça um programa que leia 1 número quebrado e imprima na tela se ele estiver entre 5 e 20
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");
    double num = sc.nextDouble();

    if(num >= 5 && num <=20){
        System.out.println("Está entre 5 e 20");
    }else{
        System.out.println("Não está entre 5 e 20");
    }
    }
}