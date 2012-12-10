package is.projekt;



import java.util.ArrayList;
import java.util.List;



public class Orderrad {
float pris;
int antal;

    public Orderrad(float pris, int antal) {
        this.pris = pris;
        this.antal = antal;
    }

    public void setPris(float pris) {
        this.pris = pris;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public float getPris() {
        return pris;
    }

    public int getAntal() {
        return antal;
    }


}
