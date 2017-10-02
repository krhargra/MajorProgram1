/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

/**
 *
 * @author kahya
 */
public class Level {
    int levelNum;
    BrickRow[] brickRow;
    
    public Level() {
        levelNum = 0;
    }
    public Level(int levelNum, int numBrickRows) {
        
    }
    public BrickRow getBrickRow(int index) {
       return brickRow[index]; 
    }
    public void setBrickRow(int index, BrickRow bkRow) {
       this.brickRow = brickRow;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return null;
    }
}
