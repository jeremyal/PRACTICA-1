/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

/**
 *
 * @author JEREMY ALFARO
 */
public class PRACTICA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ANIMAL perro;
              perro  = new ANIMAL("kiro");
        perro.setEdad(5);
        System.out.println("el nombre del animal es:"+perro.getNombre());
        System.out.println("y la edad es de:"+perro.getEdad()+"Años");
    }
    
}
