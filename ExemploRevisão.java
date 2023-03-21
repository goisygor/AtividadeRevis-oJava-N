package AtividadeRevisão;

import java.util.Scanner;

public class ExemploRevisão {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
       System.out.println("Digite um N°:");
       double nDigitado = sc.nextDouble();
       if (nDigitado>10){
        System.out.println("É maior que 10!");
       }else{
        System.out.println("É menor que 10!");
       }
        
       }
    
       public void exercicio2() {
        System.out.println("Informe as Horas Trabalhadas:");
        double horaMes = sc.nextDouble();
        double salarioHora = 12;
        double salubridade = 740;
        double horaFixa = 220;
        double horaExtra = horaMes - horaFixa;
        double salarioTotal = horaFixa*salarioHora+salubridade+horaExtra*salarioHora*1.5;
        System.out.println("Seu salario é"+salarioTotal);
        
       }
        
       }


