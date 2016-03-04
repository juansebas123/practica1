package practica1;

public class practica1usuarios extends practica1libros { //subclase de practicas1libros

    private int cantidadPrestamo = 0;
    private String cc;
    private practica1libros[] prestado = new practica1libros[9];
    private boolean out;

    public int getCantidadPrestamo() {
        return cantidadPrestamo;
    }

    public void setCantidadPrestamo(int cantidadPrestamo) {
        this.cantidadPrestamo = cantidadPrestamo;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public practica1libros[] getPrestado() {
        return prestado;
    }

    public void setPrestado(practica1libros[] prestado) {
        this.prestado = prestado;
    }

    public void prestarLibro(practica1libros Libro) {//Prestar Libro

        cantidadPrestamo += 1;
        this.setCantidadPrestamo(this.getCantidadPrestamo() - 1);
        Practica1.librosPrestados += 1;
        System.out.println("Fue agregado a la lista de prestamos.");
        System.out.println("Actualmente tiene " + Practica1.librosPrestados + " libros prestados");
        out = true;
    }

    public void devolverLibro() {//Devolver Libro
        if (cantidadPrestamo == 0) {
            System.out.println("No hay libros pendientes.");
        } else {
            cantidadPrestamo -= 1;
            Practica1.librosPrestados -= 1;
            this.setCantidadPrestamo(this.getCantidadPrestamo() + 1);
            System.out.println("El libro fue devuelto.");
            System.out.println("Actualmente tiene " + Practica1.librosPrestados + " libros prestados");
        }
        if (cantidadPrestamo == 0) {
            out = false;
        }
    }

    public void librosPrestados() {//Libros prestados
        if (cantidadPrestamo == 0) {
            System.out.println("Actualmente no hay libros prestados.");
        }
        if (out == true) {
            buscarLibro();
        }
    }

}
