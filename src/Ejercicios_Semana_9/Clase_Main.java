package Ejercicios_Semana_9;


public class Clase_Main {
    public static void main(String[] args) {
        /*EJERCICIO 2: Crea un objeto del tipo Perro en el método main de la clase main del
        proyecto. Asigna a los valores “pelo”, “color” y “chip” valores.*/

        //Creacion Objeto Perro_1
        Perro perro_1 = new Perro();

        //Asignacion valores.
        //perro_1.chip=25412;
        //perro_1.pelo="largo y rizado";
        //perro_1.color="marron fuego";

        //Mostrar valores en pantalla.
        //System.out.println("EL perro tiene el color "+ perro_1.color);
        //System.out.println("El pelo del perro es "+ perro_1.pelo);
        //System.out.println("El numero del chip es "+perro_1.chip);

        //-------------------------------------------------------------------//

        //EJERCICIO 4:
        //LLamada a los metodos SETTER donde se modifican los parámetros de la clase Perro.

        perro_1.establece_color("Blanco con pintas negras");
        perro_1.establece_largo("Largo y rizado");
        perro_1.establece_chip(123456789);

        //Mostramos en pantalla con el metodo GETTER los nuevos atributos establecidos con el método SETTER.

        System.out.println(perro_1.color_pelo());
        System.out.println(perro_1.largo_pelo());
        System.out.println(perro_1.numero_chip());


        /*EJERCICIO 7:
        Crea tres objetos Perro en el método main y almacénalos en un array
        (Puedes usar la construcción Perro [] nombreArray). Asina valores a cada objeto perro.*/

        Perro Pastor_aleman = new Perro();
        Perro Labrador = new Perro();
        Perro Caniche = new Perro();

        Perro[]mascotas = {Pastor_aleman,Labrador,Caniche};

        //Objeto:1 Asignación valores.
        Pastor_aleman.establece_peso(40);
        Pastor_aleman.establece_altura(78);
        System.out.println(Pastor_aleman.peso()+ " para el Pastor aleman");
        System.out.println(Pastor_aleman.alto()+ " para el Pastor aleman");

        //Objeto:2 Asignación valores.
        Labrador.establece_peso(28);
        Labrador.establece_altura(68);
        System.out.println(Labrador.peso() + " para el Labrador");
        System.out.println(Labrador.alto() + " para el Labrador");

        //Objeto:3 Asignación valores.

        Caniche.establece_peso(8);
        Caniche.establece_altura(40);
        System.out.println(Caniche.peso()+ " para el Caniche");
        System.out.println(Caniche.alto()+ " para el Caniche");

        /*EJERCICIO 8:
        Crea un bucle que recorra el array de Perro y reproduce el método “ladrar” de cada uno */

        for(int i=2;i<mascotas.length;i++){//Modificamos el inicio de i para que solo lo lea una vez.
            System.out.println("El Pastor Aleman hace " + Pastor_aleman.ladrar(Pastor_aleman.establece_peso(40),Pastor_aleman.establece_altura(78)));
            System.out.println("El labrador hace " + Labrador.ladrar(Labrador.establece_peso(28),Labrador.establece_altura(68)));
            System.out.println("El caniche hace " + Caniche.ladrar(Caniche.establece_peso(8),Caniche.establece_altura(40)));
        }





















    }

 }
