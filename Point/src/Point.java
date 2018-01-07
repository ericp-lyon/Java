
public class Point {

	private float abs;
	private float ord;

	public Point(float abs, float ord) {
		super();
		this.abs = abs;
		this.ord = ord;
	}

	public float getAbs() {
		return abs;
	}

	public void setAbs(float abs) {
		this.abs = abs;
	}

	public float getOrd() {
		return ord;
	}

	public void setOrd(float ord) {
		this.ord = ord;
	}

	public double calculerDistance(Point p) {

		return Math.sqrt(((this.abs - p.abs) * (this.abs - p.abs)) + ((this.ord - p.ord) * (this.ord - p.ord)));
		// this.abs est l'abscisse de l'objet 1 courant et le p.abs est celui de
		// l'objet qui est en paramètre

	}

	public Point calculerMilieu(Point p) {

		float absMilieu, ordMilieu;

		absMilieu = (this.abs + p.abs) / 2;
		ordMilieu = (this.ord + p.ord) / 2;

		Point pointMilieu = new Point(absMilieu, ordMilieu);
		return pointMilieu;

	}

}
