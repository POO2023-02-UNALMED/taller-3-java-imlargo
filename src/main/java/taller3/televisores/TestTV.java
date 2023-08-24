package taller3.televisores;

public class TestTV {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Semsung");
	    Marca marca2 = new Marca("Lj");
		
	    TV tv1 = new TV(marca1, true);
	    TV tv2 = new TV(marca2, false);
	    
	    tv1.setPrecio(2000);
	    tv2.setCanal(90);
	    tv1.setCanal(121);
		tv2.setVolumen(7);
		
		Control control1 = new Control();
		control1.enlazar(tv1);
		control1.turnOff();
		control1.setCanal(50);
		control1.turnOn();
		control1.canalUp();
		control1.volumenUp();
		
	    System.out.println(tv2.getCanal());
	    System.out.println(tv1.getPrecio());
	    System.out.println(tv1.getMarca().getNombre());
	    System.out.println(tv1.getCanal());
	}
}



//------------------------
//Mi Codigo:
class Marca {

    String nombre;

    Marca(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() {
        return this.nombre;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }
}


class TV {

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
    

    void setMarca(Marca marca){
        this.marca = marca;
    }

    void setCanal(int canal){
        this.canal = canal;
    }

    void setPrecio(int precio){
        this.precio = precio;
    }

    void setVolumen(int volumen){
        this.volumen = volumen;
    }
    void setControl(Control control){
        this.control = control;
    }

    Marca getMarca(){
        return this.marca;
    }

    int getCanal(){
        return this.canal;
    }

    int getPrecio(){
        return this.precio;
    }

    int getVolumen(){
        return this.volumen;
    }
    Control getControl(){
        return this.control;
    }

    //------------------------------
    int setNumTv(int num){
        TV.numTV = num;
    }

    int getNumTv(){
        return TV.numTV;
    }
    //------------------------------

    //------------------------------
    void turnOn() {
        this.estado = true;
    }

    void turnOff() {
        this.estado = false;
    }
    boolean getEstado() {
        return this.estado;
    }
    //------------------------------

    //------------------------------
    //Canal
    void canalUp(){
        if(this.canal < 120 && this.estado) {
            this.canal += 1;
        }
    }

    void canalDown(){
        if(this.canal > 1 && this.estado) {
            this.canal -= 1;
        }
        
    }

    //Volumen
    void volumeUp(){
        if(this.volumen < 7 && this.estado) {
            this.volumen += 1;
        }    
    }

    void volumeDown(){
        if(this.volumen > 0 && this.estado) {
            this.volumen -= 1;
        }
    }
    //------------------------------

}


class Control {
    private TV tv;
    
    //------------------------------
    void turnOff() {
        this.tv.turnOff();   
    }
    void turnOn(){
        this.tv.turnOn();
    }
    //......
    void canalUp() {
        this.tv.canalUp();
    }
    void canalDown() {
        this.tv.canalDown();
    }
    //......
    void volumenUp() {
        this.tv.volumeUp();
    }
    void volumenDown() {
        this.tv.volumeDown();
    }
    //......
    void setCanal(int canal) {
        this.tv.setCanal(canal);
    }
    void setVolumen(int volumen) {
        this.tv.setVolumen(volumen);
    }
    //------------------------------
    

    //------------------------------
    void enlazar(TV tv) {
        this.tv = tv;
        tv.setControl(this);
    }
    //------------------------------

    void setTv(TV tv){
        this.tv = tv;
    }

    TV getTv(){
        return this.tv;
    }
}
