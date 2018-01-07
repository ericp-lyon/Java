
public class TroisPoints {

	private Point premier;
	private Point deuxieme;
	private Point troisieme;

	public TroisPoints(Point premier, Point deuxieme, Point troisieme) {
		super();
		this.premier = premier;
		this.deuxieme = deuxieme;
		this.troisieme = troisieme;
	}

	public Point getPremier() {
		return premier;
	}

	public void setPremier(Point premier) {
		this.premier = premier;
	}

	public Point getDeuxieme() {
		return deuxieme;
	}

	public void setDeuxieme(Point deuxieme) {
		this.deuxieme = deuxieme;
	}

	public Point getTroisieme() {
		return troisieme;
	}

	public void setTroisieme(Point troisieme) {
		this.troisieme = troisieme;
	}

	public boolean testerAlignement() {

		double AB, AC, BC;
		AB = premier.calculerDistance(deuxieme);
		AC = premier.calculerDistance(troisieme);
		BC = deuxieme.calculerDistance(troisieme);

		if (AB == AC + AB || AC == AB + BC || BC == AC + AB) {

			return true;
		}

		else
			return false;

	}

	public boolean estTriangleEquilateral() {

		double AB, AC, BC;
		AB = premier.calculerDistance(deuxieme);
		AC = premier.calculerDistance(troisieme);
		BC = deuxieme.calculerDistance(troisieme);

		if (AB == AC && AC == BC)

			return true;

		else
			return false;
	}

}
