import java.util.ArrayList;
import java.util.List;

// Interfaz Forma
interface Forma {
    void moverse(int x, int y);
    void dibujar();
    void aceptar(Visitante v);
}

// Clase Punto implementando Forma
class Punto implements Forma {
    // Implementación de métodos y otros atributos de la clase Punto
    // ...

    @Override
    public void moverse(int x, int y) {

    }

    @Override
    public void dibujar() {

    }

    @Override
    public void aceptar(Visitante v) {
        v.visitarPunto(this); // Llama al método visitarPunto del visitante
    }
}

// Clase Círculo implementando Forma
class Circulo implements Forma {
    // Implementación de métodos y otros atributos de la clase Círculo
    // ...

    @Override
    public void moverse(int x, int y) {

    }

    @Override
    public void dibujar() {

    }

    @Override
    public void aceptar(Visitante v) {
        v.visitarCirculo(this); // Llama al método visitarCirculo del visitante
    }
}

// Clase Rectangulo implementando Forma
class Rectangulo implements Forma {
    // Implementación de métodos y otros atributos de la clase Rectángulo
    // ...

    @Override
    public void moverse(int x, int y) {

    }

    @Override
    public void dibujar() {

    }

    @Override
    public void aceptar(Visitante v) {
        v.visitarRectangulo(this); // Llama al método visitarRectangulo del visitante
    }
}

// Clase FormaCompuesta implementando Forma
class FormaCompuesta implements Forma {
    // Implementación de métodos y otros atributos de la clase FormaCompuesta
    // ...

    @Override
    public void moverse(int x, int y) {

    }

    @Override
    public void dibujar() {

    }

    @Override
    public void aceptar(Visitante v) {
        v.visitarFormaCompuesta(this); // Llama al método visitarFormaCompuesta del visitante
    }
}

// Interfaz Visitante
interface Visitante {
    void visitarPunto(Punto p);
    void visitarCirculo(Circulo c);
    void visitarRectangulo(Rectangulo r);
    void visitarFormaCompuesta(FormaCompuesta fc);
}

// Clase XMLExportVisitor implementando Visitante
class XMLExportVisitor implements Visitante {
    // Implementación de métodos para exportar en formato XML
    // ...

    @Override
    public void visitarPunto(Punto p) {
        // Exportar la información del punto en formato XML
    }

    @Override
    public void visitarCirculo(Circulo c) {
        // Exportar la información del círculo en formato XML
    }

    @Override
    public void visitarRectangulo(Rectangulo r) {
        // Exportar la información del rectángulo en formato XML
    }

    @Override
    public void visitarFormaCompuesta(FormaCompuesta fc) {
        // Exportar la información de la forma compuesta en formato XML
    }
}

// Clase Aplicacion
class Aplicacion {
    private List<Forma> todasLasFormas = new ArrayList<>();

    public void exportar() {
        Visitante exportVisitor = new XMLExportVisitor(); // Crea un visitante para exportar

        for (Forma forma : todasLasFormas) {
            forma.aceptar(exportVisitor); // Llama al método aceptar de cada forma con el visitante
        }
    }

    // Otros métodos y atributos de la clase Aplicación
    // ...
}
