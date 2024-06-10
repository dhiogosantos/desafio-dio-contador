package com.service;

import com.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        System.out.print("\n");

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if(primeiroNumero >= segundoNumero){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!\n");
        }

        int quantidadeRepeticao = segundoNumero - primeiroNumero;

        for (int i = 1; i <= quantidadeRepeticao; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}