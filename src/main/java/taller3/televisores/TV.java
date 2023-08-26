package taller3.televisores;

public class TV {

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public int getCanal() {
        return this.canal;
    }

    public int getPrecio() {
        return this.precio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public Control getControl() {
        return this.control;
    }

    // ------------------------------
    public void setNumTv(int num) {
        TV.numTV = num;
    }

    public int getNumTv() {
        return TV.numTV;
    }
    // ------------------------------

    // ------------------------------
    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return this.estado;
    }
    // ------------------------------

    // ------------------------------
    // Canal
    public void canalUp() {
        if (this.canal < 120 && this.estado) {
            this.canal += 1;
        }
    }

    public void canalDown() {
        if (this.canal > 1 && this.estado) {
            this.canal -= 1;
        }

    }

    // Volumen
    public void volumeUp() {
        if (this.volumen < 7 && this.estado) {
            this.volumen += 1;
        }
    }

    public void volumeDown() {
        if (this.volumen > 0 && this.estado) {
            this.volumen -= 1;
        }
    }
    // ------------------------------

}