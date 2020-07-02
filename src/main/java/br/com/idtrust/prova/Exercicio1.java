package br.com.idtrust.prova;

import java.util.Scanner;

public class Exercicio1 {
    public static void insercao(int n) {
        Scanner scanner = new Scanner(System.in);
        double[] nota = new double[n + 1];
        System.out.println("Você inseriu: " + n + " Alunos");
        if (n >= 1 && n <= 60) {
            for (int i = 1; i <= n; i++) {

                System.out.println("Insira a nota do aluno");
                nota[i] = scanner.nextDouble();
                if (nota[i] <= 100) {
                    System.out.println("Aluno " + i + " Nota :" + arredondamento(nota[i]));
                } else {
                    System.out.println("Insira a nota do aluno corretamente");
                    nota[i] = scanner.nextDouble();
                    System.out.println("Aluno " + i + " Nota :" + arredondamento(nota[i]));
                }
            }
        }
    }

    private static double arredondamento(double nota) {
        double multiplo = 5 * Math.ceil(nota / 5);
        if (nota > 38) {
            if ((multiplo - nota) < 3) {
                return multiplo;
            } else {
                return nota;
            }
        } else {
            return nota;
        }
    }
}
