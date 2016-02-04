/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experiments;

/**
 *
 * @author Emilio
 */
public class Startup {
    public static void main(String[] args) {
        Sports sports [] = new Sports[2];
        sports[0] = new Soccer();
        sports[1]= new Football();
        
        for (Sports s: sports){
            System.out.println(s.typeOfScore());
            System.out.println(s.typeOfFoul());
        }
    }
}
