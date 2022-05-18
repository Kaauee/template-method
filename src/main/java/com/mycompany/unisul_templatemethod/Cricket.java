package com.mycompany.unisul_templatemethod;



public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket Game Inicialized! Start Playing.");
        
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }



}
