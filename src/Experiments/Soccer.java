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
public class Soccer implements Sports{
    private String scoreType;
    private String foulType;
    
    @Override
    public String typeOfScore() {
        return scoreType = "Goal";
    }
    
    @Override
    public String typeOfFoul() {
        return foulType = "Penalty kick";
    }
    
}
