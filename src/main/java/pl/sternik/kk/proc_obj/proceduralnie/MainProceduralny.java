package pl.sternik.kk.proc_obj.proceduralnie;

public class MainProceduralny {
	public static void main(String[] args) {
		Prostokat p = new Prostokat(2, 4);
		System.out.print("Prostokąt pole i obwód: ");
		System.out.print(ProceduryPola.countPole(p) + "  ");
		System.out.println(ProceduryObwody.countObwod(p));

		Kwadrat k = new Kwadrat(2);
		System.out.print("Kwadrat pole i obwód: ");
		System.out.print(ProceduryPola.countPole(k) + "  ");
		System.out.println(ProceduryObwody.countObwod(k));

		Kolo ko = new Kolo(4);
		System.out.print("Koło pole i obwód: ");
		System.out.print(ProceduryPola.countPole(ko)+ "  ");
		System.out.println(ProceduryObwody.countObwod(ko));
	}
}
