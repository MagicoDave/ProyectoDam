package proyectodam;

import javax.swing.ImageIcon;

public class Especie {
    
    private String nombre;
    private int baseHP, baseAtk, baseSpAtk, baseDef, baseSpDef, baseSpeed;
    private ImageIcon imagenFrente, imagenEspalda, imagenIcono;
    private Movimientos mov1, mov2, mov3, mov4;
    private String tipo1, tipo2;

    public Especie(String nombre, int[] statsBase, String[] tipos, Movimientos[] setMovimientos, 
    ImageIcon[] imagenes){

        this.nombre = nombre;
        this.baseHP = statsBase[0];
        this.baseAtk = statsBase[1];
        this.baseSpAtk = statsBase[2];
        this.baseDef = statsBase[3];
        this.baseSpDef = statsBase[4];
        this.baseSpeed = statsBase[5];
        this.tipo1 = tipos[0];
        this.tipo2 = tipos[1];
        this.mov1 = setMovimientos[0];
        this.mov2 = setMovimientos[1];
        this.mov3 = setMovimientos[2];
        this.mov4 = setMovimientos[3];
        this.imagenFrente = imagenes[0];
        this.imagenEspalda = imagenes[1];
        this.imagenIcono = imagenes[2];

    }
}
