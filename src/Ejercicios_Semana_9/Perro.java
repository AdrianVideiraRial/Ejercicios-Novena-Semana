package Ejercicios_Semana_9;
/* Ejercicio 1: Crea una clase qué se llame Perro. Añade 3 atributos de clase llamados
“pelo” y “color” de tipo String y “chip” de tipo int.*/

import org.w3c.dom.ls.LSOutput;

public class Perro {

    //Atributos de la clase Perro.

    private String pelo="Corto";
    private String color="Marron";
    private int chip=52542;

    //------------------------------------------------------------------------------------------//

/* EJERCICIO 3:
    Cambia los atributos del tipo Perro para que su visibilidad sea “private”.
    ¿Qué ocurre con el código escrito anteriormente? Escribe un comentario sobre lo que observas.*/

    /*RESPUESTA: Los valores encapsulados con el modificador de acceso "private" son solo modificables desde la
    propia clase, por lo tanto los valores dados a las variables en la clase main dan error. Habría que
    modificarlos desde la Clase Perro.
     */
//------------------------------------------------------------------------------------------------//
 /*EJERCICIO 4:
        Añade un método get y un método set para cada atributo de la clase Perro.
        Modifica en el método main la modificación de los atributos del objeto anteriormente creado.
         */

    //METODOS GETTER.
    public String color_pelo(){
        return "El color del pelo es "+ color;
    }

    public String largo_pelo(){
        return "El tipo de pelo es "+ pelo;
    }

    public String numero_chip(){
        return "El numero de identificación es: "+ chip;
    }

    //MÉTODOS SETTER.

    public void establece_color(String valor_color){
        color=valor_color;
    }

    public void establece_largo(String valor_pelo){
        pelo=valor_pelo;
    }

    public void establece_chip(int valor_chip){
        chip= valor_chip;
    }

    /*EJERCICIO: 5
    Añade un atributo privado a la clase perro que sea “peso” y otro “altura” de
    tipo entero. Incluye los métodos get y set de cada uno.*/

    //Atributos nuevos.
    private int peso;
    private int altura;

    //METODOS GETTER.
    public String peso(){
        return "El peso es "+ peso + " Kg";
    }
    public String alto(){
        return "El alto es "+ altura + " cm";
    }

    //MÉTODOS SETTER.
    public int establece_peso (int valor_peso){
       peso = valor_peso;
       return peso;
    }
    public int establece_altura (int valor_altura){
        altura = valor_altura;
        return altura;
    }

    /*EJERCICIO 6:
    Añade un método público a la clase Perro que sea “ladrar” y devuelva un String con el ladrido.
    Dependiendo del peso y la altura del perro, debe emitir un ladrido más agudo o más grave.*/

    public String ladrar(int valor1, int valor2){
        String ladrido="";
        //Variables que hacen referencia a los atributos de la clase.
        peso = valor1;
        altura = valor2;

        if(peso>35 && altura>70){
            ladrido = "WOOFF,WOOFF, WOOFF!!";
        } else if (peso>15 && altura>50) {
            ladrido ="Guau,Guau,Guau!!";
        } else if (peso<=15 && altura<=50) {
            ladrido="buu, buu, buu!!";
        }
        return ladrido;
    }


}
