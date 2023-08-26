package taller3.televisores;

public class TV {

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;

    TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    void setMarca(Marca marca) {
        this.marca = marca;
    }

    void setCanal(int canal) {
        this.canal = canal;
    }

    void setPrecio(int precio) {
        this.precio = precio;
    }

    void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    void setControl(Control control) {
        this.control = control;
    }

    Marca getMarca() {
        return this.marca;
    }

    int getCanal() {
        return this.canal;
    }

    int getPrecio() {
        return this.precio;
    }

    int getVolumen() {
        return this.volumen;
    }

    Control getControl() {
        return this.control;
    }

    // ------------------------------
    void setNumTv(int num) {
        TV.numTV = num;
    }

    int getNumTv() {
        return TV.numTV;
    }
    // ------------------------------

    // ------------------------------
    void turnOn() {
        this.estado = true;
    }

    void turnOff() {
        this.estado = false;
    }

    boolean getEstado() {
        return this.estado;
    }
    // ------------------------------

    // ------------------------------
    // Canal
    void canalUp() {
        if (this.canal < 120 && this.estado) {
            this.canal += 1;
        }
    }

    void canalDown() {
        if (this.canal > 1 && this.estado) {
            this.canal -= 1;
        }

    }

    // Volumen
    void volumeUp() {
        if (this.volumen < 7 && this.estado) {
            this.volumen += 1;
        }
    }

    void volumeDown() {
        if (this.volumen > 0 && this.estado) {
            this.volumen -= 1;
        }
    }
    // ------------------------------

}