/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import java.awt.Color;

/**
 *
 * @author kahya
 */
public class BrickRow {
    int pointValue;
    Color color;
    boolean [] brickmask;
    
    public BrickRow() {
        pointValue = 0;
    }
    
    public BrickRow(int ptVal, Color clr, String bMask) {
        this.pointValue = ptVal;
}
    public boolean getBrickMaskValue(int index) {
        return brickmask[index];
    }

    public void setBrickMaskValue(int index, boolean value) {
        this.brickmask = brickmask;
    }
    
    public int getBrickMaskLength(){
        return brickmask.length;
    }
    
    @Override
    public String toString(){
    //String str = "";
    return null;
    }
}
