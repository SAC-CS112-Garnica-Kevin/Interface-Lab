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
public class Cards implements RandomNumber 
{
    private int cardPicked; 
    
    @Override
    public int getRandomNumber()
    {
        int cardPicked = 1 + (int)(Math.random() * ((52 - 1) + 1));
        this.cardPicked = cardPicked;
        return cardPicked ;
        
    }
    
    @Override
    public void History(int turn)
    {
        System.out.print("On Turn " + turn + " The Card Picked Was ");
    }
    
   
}