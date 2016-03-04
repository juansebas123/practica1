package practica1;

import java.util.Scanner;

public class practica1libros { //aqui hay una subclase que direcciona apractica1usuario

    private String nombre, autor, anodepublicacion, area;
    private int cantidad, codigo;
    boolean vf;
    public Scanner lector = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPubYear() {
        return anodepublicacion;
    }

    public void setAnodepublicacion(String anodepublicacion) {
        this.anodepublicacion = anodepublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean getVf() {
        return vf;
    }

    public void setVf(boolean vf) {
        this.vf = vf;
    }

    public void ingresarLibro() { //ingresar libro
        System.out.println("Ingrese el nombre del libro: ");
        nombre = lector.next();
        System.out.println("Ingrese el nombre del autor: ");
        autor = lector.next();
        System.out.println("Ingrese el año de publicacion: ");
        anodepublicacion = lector.next();
        System.out.println("Ingrese la cantidad de copias de este libro: ");
        cantidad = lector.nextInt();
        System.out.println("Ingrese el area de estudio: "
                + "\n1.Quimica"
                + "\n2.Fisica"
                + "\n3.Tecnologia"
                + "\n4.Calculo"
                + "\n5.Programacion");
        int op;
        do {
            op = lector.nextInt();
            switch (op) {
                case 1:
                    area = "Quimica";
                    break;
                case 2:
                    area = "Fisica";
                    break;
                case 3:
                    area = "Tecnologia";
                    break;
                case 4:
                    area = "Calculo";
                    break;
                case 5:
                    area = "Programacion";
                    break;
            }
            break;
        } while (op != 6);
        vf = true;
        System.out.println("Ha sido almacenada el libro con el codigo: " + codigo);
    }

    public void actualizarLibro() {//Actualizar Libro
        int op;
        do {
            System.out.println("\n1. Cambiar nombre del libro"
                    + "\n2. Cambiar nombre del autor"
                    + "\n3. Cambiar año de la publicacion"
                    + "\n4. Cambiar cantidad de libros disponibles"
                    + "\n5. Cambiar area del libro"
                    + "\n6. Salir");
            op = lector.nextInt();
            switch (op) {
                case 0:
                    break;
                case 1:
                    System.out.println("Actualmente el nombre es: " + nombre);
                    System.out.println("Ingrese el nuevo nombre: ");
                    nombre = lector.next();
                    break;

                case 2:
                    System.out.println("Actualmente el nombre del autor es: " + autor);
                    System.out.println("Ingrese el nuevo nombre: ");
                    autor = lector.next();

                    break;
                case 3:
                    System.out.println("Actualmente el año de publicacion es: " + anodepublicacion);
                    System.out.println("Ingrese el nuevo año: ");
                    anodepublicacion = lector.next();

                    break;
                case 4:
                    System.out.println("Actualmente el numero de libros disponibles es: " + cantidad);
                    System.out.println("Ingrese la nueva cantidad: ");
                    cantidad = lector.nextInt();

                    break;
                case 5:
                    System.out.println("Actualmente el area de estudio es: " + area);
                    System.out.println("Ingrese la nueva area: "
                            + "\n1.Quimica"
                            + "\n2.Fisica"
                            + "\n3.Tecnologia"
                            + "\n4.Calculo"
                            + "\n5.Programacion");
                    do {
                        op = lector.nextInt();
                        switch (op) {
                            case 1:
                                area = "Quimica";
                                break;
                            case 2:
                                area = "Fisica";
                                break;
                            case 3:
                                area = "Tecnologia";
                                break;
                            case 4:
                                area = "Calculo";
                                break;
                            case 5:
                                area = "Programacion";
                                break;
                        }
                        break;
                    } while (op != 6);
            }
        } while (op != 6);
    }

    public void eliminarLibro() {//Eliminar Libro
        System.out.println("Esta seguro que desea eliminar este libro"
                + "\nElija la opcion:"
                + "\n1.si"
                + "\n2.no");
        if (lector.next().compareTo("1") == 0) {
            nombre = " ";
            autor = " ";
            anodepublicacion = "";
            cantidad = 0;
            vf = false;
            System.out.println("Eliminado libro de la base de datos");
        }
    }

    public void buscarLibro() {//Buscar Libro
        System.out.println("\nNombre del libro: " + nombre
                + "\nNombre del autor: " + autor
                + "\nAño de publicacion: " + anodepublicacion
                + "\nEdiciones disponibles: " + cantidad
                + "\nCodigo: " + codigo
                + "\nArea de estudio: " + area);

    }
}
