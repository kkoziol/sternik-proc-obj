package pl.sternik.kk.proc_obj.objektowo;

public class Kolo extends Figura{
    public int r;

    public Kolo(int r) {
        super();
        this.r = r;
    }
    @Override
    public double countPole() {
        return Math.PI * r * r;
    }
    @Override
    public double countObwod() {
        return Math.PI * 2 * r;
    }
}
