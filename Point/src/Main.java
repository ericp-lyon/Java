import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("entrer la valeur x1 du point A: ");
		float x1 = sc.nextFloat();
		System.out.println("entrer la valeur y1 du point A: ");
		float y1 = sc.nextFloat();
		Point pA = new Point(x1, y1);

		System.out.println("entrer la valeur x2 du point B: ");
		float x2 = sc.nextFloat();
		System.out.println("entrer la valeur y2 du point B: ");
		float y2 = sc.nextFloat();
		Point pB = new Point(x2, y2);

		System.out.println("entrer la valeur x3 du point C: ");
		float x3 = sc.nextFloat();
		System.out.println("entrer la valeur y3 du point C: ");
		float y3 = sc.nextFloat();
		Point pC = new Point(x3, y3);

		TroisPoints ABC = new TroisPoints(pA, pB, pC);
		// System.out.println("La distance entre ces deux points est " +
		// p1.calculerDistance(p2));
		// this.abs est l'abscisse de l'objet 1 courant et le p.abs est celui de
		// l'objet qui est en paramètre

		System.out.println("Les coordonnées du point A sont ( " + pA.getAbs() + " , " + pA.getOrd() + " )");
		System.out.println("Les coordonnées du point B sont ( " + pB.getAbs() + " , " + pB.getOrd() + " )");
		System.out.println("Les coordonnées du point C sont ( " + pC.getAbs() + " , " + pC.getOrd() + " )");

		System.out.println("Les coordonnées du milieu entre le point A et B sont ( " + pA.calculerMilieu(pB).getAbs()
				+ " , " + pA.calculerMilieu(pB).getOrd() + " )");
		System.out.println("Les coordonnées du milieu entre le point B et C sont (" + pB.calculerMilieu(pC).getAbs()
				+ " , " + pB.calculerMilieu(pC).getOrd() + " )");
		System.out.println("Les coordonnées du milieu entre le point A et C sont (" + pA.calculerMilieu(pC).getAbs()
				+ " , " + pA.calculerMilieu(pC).getOrd() + " )");

		System.out.println("distance entre A et B =  " + pA.calculerDistance(pB));
		System.out.println("distance entre A et C =  " + pA.calculerDistance(pC));
		System.out.println("distance entre B et C =  " + pB.calculerDistance(pC));

		System.out.println("Les points A, B et C sont ils alignés ? réponse:" + ABC.testerAlignement());
		System.out.println("Les trinagle formé par les points A, B et C est il equilatéral ? réponse:"
				+ ABC.estTriangleEquilateral());

		sc.close();

	}

}
