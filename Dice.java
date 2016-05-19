/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inferfacelab;

/**
 *
 * @author Kevin
 */
public class Dice implements RandomNumber 
{
    private int diceValue; 
    
    @Override
    public int getRandomNumber()
    {
        int diceValue = 1 + (int)(Math.random() * ((6 - 1) + 1));
        this.diceValue = diceValue;
        return diceValue ;
        
    }
    
    @Override
    public void History(int turn)
    {
        System.out.print("On Turn " + turn + " the Die Landed on ");
    }
   
}
