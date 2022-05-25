package proyectodam;

import javax.swing.ImageIcon;


// https://github.com/Jmgiacone/Pokemon

public class Pokemon {
    
    private String apodo;
    private Especie nombre;
    private boolean[] estado; //Envenenado, Paralizado, Quemado, Congelado, Dormido
    private int nivel;
    private int[] statsCombate; //HP, Atk, Def, AtkSp, DefSp, Speed

    public Pokemon(String apodo, Especie nombre, int nivel){
        this.apodo = apodo;
        this.nombre = nombre;
        this.nivel = nivel;
    }

}
