package com.trybe.java.regraprogressao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int n1 = scan.nextInt();
    scan.nextLine();
    ArrayList<String> atividades = new ArrayList<String>();
    ArrayList<Integer> pesos = new ArrayList<Integer>();
    ArrayList<Integer> notas = new ArrayList<Integer>();

    for (int i = 1; i <= n1; i++) {
      System.out.println("Digite o nome da atividade " + i + ": ");
      String atividade = scan.nextLine();
      System.out.println("Digite o peso da atividade " + i + ": ");
      int peso = scan.nextInt();
      scan.nextLine();
      atividades.add(atividade);
      pesos.add(peso);
      System.out.println("Digite a nota obtida para " + atividades.get(i - 1) + ": ");
      int nota = scan.nextInt();
      notas.add(nota * peso);
      scan.nextLine();
    }

    int result = pesos.stream().reduce(0, Integer::sum);
    double resultAluno = notas.stream()
                          .mapToDouble(nota -> nota)
                          .sum() / result;

    if (result != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    if (resultAluno >= 85) {
      System.out.println(
          "Parabéns! Você alcançou "
            + resultAluno
              + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
            + resultAluno
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
    
    scan.close();
  }
}