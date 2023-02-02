/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpgoldweek6day4.exercice2;

import java.util.Random;

/**
 *
 * @author ezekielkouassi
 */
public class PairOfDice {
    private int die1;
    private int die2;
    
    public PairOfDice() {
        this.die1 = 0;
        this.die2 = 0;
    }
    
    public int getDie1() {
        return this.die1;
    }
    
    public int getDie2() {
        return this.die2;
    }
    
    public void setDie1(int die1) {
        this.die1 = die1;
    }
    
    public void setDie2(int die2) {
        this.die2 = die2;
    }
    
    public int rolledDicePair() {
        int diceRolledNbre = 0;
        
        while(this.die1 + this.die2 != 2) {
            diceRolledNbre++;
            this.die1 = (int) (1 + Math.random() * (6 - 1));
            this.die2 = (int) (1 + Math.random() * (6 - 1));
        }
        
        return diceRolledNbre;
    }
}
