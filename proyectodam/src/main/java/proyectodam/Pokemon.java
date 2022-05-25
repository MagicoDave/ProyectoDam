package proyectodam;

import javax.swing.ImageIcon;


// https://github.com/Jmgiacone/Pokemon

public class Pokemon {
    
    private String apodo;
    private Especie especie;
    private boolean[] estado; //Envenenado, Paralizado, Quemado, Congelado, Dormido
    private int nivel;
    private int[] statsCombate; //HP, Atk, Def, AtkSp, DefSp, Speed

    public Pokemon(String apodo, Especie especie, int nivel){
        this.apodo = apodo;
        this.especie = especie;
        this.nivel = nivel;
    }

}
