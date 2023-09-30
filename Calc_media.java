package com.mycompany.calc_media;
import java.util.Scanner;

public class Calc_media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Digite o valor do segmento A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor do segmento B: ");
        b = sc.nextInt();
        System.out.print("Digite o valor do segmento C: ");
        c = sc.nextInt();
        
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.print("É possível formar um triângulo");
        } else {    
            System.out.print("Não é possível formar um triângulo");
        }
        
        sc.close();
        
        //cheguei em compostas
    }
}
