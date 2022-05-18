package com.mycompany.unisul_templatemethod;



public class Football extends Game{

     @Override
    void initialize() {
        System.out.println("Football Game Inicialized! Start Playing.");
        
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }



}
