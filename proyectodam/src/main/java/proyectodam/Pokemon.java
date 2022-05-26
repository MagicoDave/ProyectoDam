package proyectodam;

// https://github.com/Jmgiacone/Pokemon
// https://github.com/ewhalenkamp/Java-Pokemon-Battle-Simulator

public class Pokemon {
    
    private String apodo;
    private Especie nombre;
    private boolean[] estado; //Envenenado, Paralizado, Quemado, Congelado, Dormido
    private int nivel;
    private int actualHP, actualAtk, actualSpAtk, actualDef, actualSpDef, actualSpeed;

    public Pokemon(String apodo, Especie nombre, int nivel){
        this.apodo = apodo;
        this.nombre = nombre;
        this.nivel = nivel;
    }

}
