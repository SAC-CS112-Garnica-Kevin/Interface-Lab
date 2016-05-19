/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inferfacelab;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class InferfaceLab {

    public static void main(String[] args) 
    {
        int numberOfTurns;
        
        Scanner scan = new Scanner(System.in); 
        RandomNumber[]  History = new RandomNumber [2];
        
        Dice DiceValue = new Dice();
        Cards CardDraw = new Cards();
        
        History[0] = DiceValue;
        History[1] = CardDraw;
        
        System.out.println("How Many Turns Do You Want?");
        numberOfTurns = scan.nextInt();
        System.out.println(" ");
        
        for (int i = 1; i <= numberOfTurns; i++)
        {
            for (RandomNumber X: History)
            {
                X.History(i);
                System.out.println(X.getRandomNumber());
                
            }
            System.out.println(" ");
        }
        
        
        
    }
    
}
