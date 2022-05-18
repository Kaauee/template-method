package com.mycompany.unisul_templatemethod;



public class CS extends Game{

    @Override
    void initialize() {
        System.out.println("CS Game Inicialized! Start Playing.");
        
    }

    @Override
    void startPlay() {
        System.out.println("CS Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("CS Game Finished!");
    }



}
