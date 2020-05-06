/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rifa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author doguinha
 */
public class Rifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numeroEscolhido;
        Scanner inpu = new Scanner(System.in);
       System.out.print("Sortear numero de 1 ate: ");
       numeroEscolhido=inpu.nextInt();
       Random random = new Random();
int NumeroSorteado = random.nextInt(numeroEscolhido)+1;
System.out.println("O numero Sorteado Foi! "+NumeroSorteado);

}

}
