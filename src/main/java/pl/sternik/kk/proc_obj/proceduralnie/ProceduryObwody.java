package pl.sternik.kk.proc_obj.proceduralnie;

public class ProceduryObwody {
	public static int countObwod(Kwadrat k) {
		return 4 * k.a;
	}

	public static int countObwod(Prostokat p) {
		return 2 * p.a + 2 * p.b;
	}

	public static double countObwod(Kolo k) {
		return Math.PI * 2 * k.r;
	}

}
