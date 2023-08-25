package taller3.televisores;

public class Control {
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