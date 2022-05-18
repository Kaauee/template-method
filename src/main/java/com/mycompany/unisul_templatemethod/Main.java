package com.mycompany.unisul_templatemethod;


public class Main {

    public static void main(String[] args) {
        
        Game game = new Cricket();
        game.play();
        
        System.out.println("");
        
        game = new Football();
        game.play();
        
        System.out.println("");
        
        game = new CS();
        game.play();
        
        
    }

}
