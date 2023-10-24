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
      notas.add(nota);
      scan.nextLine();
    }
    
    scan.close();
  }
}