package com.company;

import java.util.Scanner;

public class Exerciciojuros {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("Digite o tipo do pagamento [1 = à vista / 2 = a prazo]: ");
        Integer tipoPagamento = scanner.nextInt();
        Boolean pagamentoAVista = tipoPagamento.equals(1);
        Double juros = 0.0;
        if (!pagamentoAVista) {
            juros = 10.0;
        }
        Double acrescimo = valorProduto * juros / 100;
         double valorTotal = acrescimo + valorProduto;
        System.out.println("Valor total: " + valorTotal);
        scanner.close();

       }
}


