package com.fab.retaildiscount.discountcalculator.enums;

public enum Level {
    EMPLOYEE  (3),  //calls constructor with value 3
    AFFILIATE(2),  //calls constructor with value 2
    OTHER   (1)   //calls constructor with value 1
    ; // semicolon needed when fields / methods follow


    private final int levelCode;

    Level(int levelCode) {
        this.levelCode = levelCode;
    }
    
    public int getLevelCode() {
        return this.levelCode;
    }
    
}