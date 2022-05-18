package com.mycompany.unisul_templatemethod;



public abstract class Game {
abstract void initialize();
abstract void startPlay();
abstract void endPlay();

//metodo template
public final void play(){
//inicializa
initialize();

//comeca
startPlay();

//termina
endPlay();
}


}
