package pl.sternik.kk.proc_obj.objektowo;

public class Kwadrat implements Figura{
    public int a;

    public Kwadrat(int a) {
        super();
        this.a = a;
    }
    @Override
    public double countPole() {
        return a * a;
    }
    @Override
    public double countObwod() {
        return 4 * a;
    }
}
