package practica1;

import java.util.Scanner;

public class Practica1 {

    public static int librosPrestados;//aplica a un miembro que pertenece a la clase en general y no a un objeto en particular

    public static void main(String[] args) {
        int op, libroActual;
        int[] vector = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //asigno los valores a todos los elementos del array para la declaracion
        practica1usuarios[] Libros = new practica1usuarios[10]; //array de tamaño 10
        for (int i = 0; i < 9; i++) {//rango
            Libros[i] = new practica1usuarios();
        }
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("\nINGRESE UNA OPCION" //menu principal
                    + "\n\nGESTION LIBRO:"
                    + "\n1.Ingresar Libro"
                    + "\n2.Actualizar Libro"
                    + "\n3.Eliminar Libro"
                    + "\n4.Buscar Libro"
                    + "\n\nGESTION PRESTAMO:"
                    + "\n5.Prestar Libro"
                    + "\n6.Devolver Libro"
                    + "\n7.Libros prestados"
                    + "\n\nSI NO VA HACER NADA:"
                    + "\n8.Salir");
            op = lector.nextInt();
            switch (op) {
                case 0:
                    break;
                case 1://ingresar libro
                    System.out.println("Ingrese un codigo nuevo del libro del 0 al 9");
                    libroActual = lector.nextInt();
                    if (libroActual < 0 || libroActual > 9) {//rango
                        System.out.println("Estamo mal no hay mas espacio, no hay plata para base de datos.");
                        break;
                    }
                    for (int i = 0; i < 9; i++) {
                        if ((Libros[i].getVf() == true) && (libroActual == i)) {//sintasis para igualdad
                            System.out.println("Ya existe un libro con este codigo");
                            break;
                        } else if (libroActual == i) {
                            Libros[i].setCodigo(libroActual);
                            Libros[i].ingresarLibro();// lo ingreso a la base de datos pratica1librros
                            vector[i] = 1;
                            break;
                        }
                    }
                    break;

                case 2://Actualizar Libro
                    System.out.println("Ingrese el nombre");
                    String name = lector.next();
                    boolean v = false;
                    for (int i = 0; i < 10; i++) {
                        if (vector[i] == 1) {
                            if (Libros[i].getNombre().compareTo(name) == 0) {
                                Libros[i].actualizarLibro();//lo ingreso a la base de datos pratica1librros
                                v = true;
                                break;
                            }
                        }
                    }
                    if (v == false) {
                        System.out.println("No se ha encontrado el libro en la base de datos.");
                    }
                    break;

                case 3://Eliminar Libro
                    System.out.println("Ingrese el nombre del libro a eliminar");
                    name = lector.next();
                    v = false;
                    for (int i = 0; i < 10; i++) {
                        if (vector[i] == 1) {
                            if (Libros[i].getNombre().compareTo(name) == 0) {
                                Libros[i].eliminarLibro();//lo ingreso a la base de datos pratica1librros
                                vector[i] = 0;
                                v = true;
                            }
                        }
                    }
                    if (v == false) {
                        System.out.println("No se ha encontrado el libro en la base de datos.");
                    }
                    break;

                case 4://Buscar Libro
                    System.out.println("Ingrese el nombre del libro que desea buscar: ");
                    name = lector.next();
                    v = false;
                    for (int i = 0; i < 10; i++) {
                        if (vector[i] == 1) {
                            if (Libros[i].getNombre().compareTo(name) == 0) {
                                Libros[i].buscarLibro();//lo ingreso a la base de datos pratica1librros
                                v = true;
                            }
                        }
                    }
                    if (v == false) {
                        System.out.println("No se ha encontrado el libro en la base de datos.");
                    }
                    break;

                case 5://Prestar Libro
                    System.out.println("Ingrese el nombre del libro que desea prestar");
                    name = lector.next();
                    v = false;
                    for (int i = 0; i < 10; i++) {
                        if (vector[i] == 1) {
                            if (Libros[i].getNombre().compareTo(name) == 0) {
                                Libros[i].prestarLibro(Libros[i]);//lo ingreso a la subclase pratica1usuarios
                                v = true;
                            }
                        }
                    }
                    if (v == false) {
                        System.out.println("No se ha encontrado el libro en la base de datos.");
                    }
                    break;

                case 6://Devolver Libro
                    System.out.println("Ingrese el nombre del libro que desea devolver");
                    name = lector.next();
                    v = false;
                    for (int i = 0; i < 10; i++) {
                        if (vector[i] == 1) {
                            if (Libros[i].getNombre().compareTo(name) == 0) {
                                Libros[i].devolverLibro();//lo ingreso a la subclase pratica1usuarios
                                v = true;
                            }
                        }
                    }
                    if (v == false) {
                        System.out.println("No se ha encontrado el libro en la base de datos.");
                    }
                    break;

                case 7://Libros prestados
                    for (int i = 0; i < 10; i++) {
                        if (vector[i] == 1) {
                            Libros[i].librosPrestados();//lo ingreso a la subclase pratica1usuarios
                        }
                    }
                    break;
            }
        } while (op != 8);
        System.out.println("TODO BIEN °_°");
    }

}