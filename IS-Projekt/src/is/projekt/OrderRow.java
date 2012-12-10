package is.projekt;


public class OrderRow {
float pris;
int antal;

    public OrderRow(float pris, int antal) {
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
