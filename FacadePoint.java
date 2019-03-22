
public class FacadePoint {
	Line lines = null;
	Point ponto1 = null;
	Point ponto2 = null;

	public FacadePoint(int x, int y, int z, int w) {
		this.ponto1 = new Point(x, y);
		this.ponto2 = new Point(z, z);
		this.lines = new Line(this.ponto1, this.ponto2);

	}

	public void mover(int x, int y) {
		this.lines.move(x, y);

	}

	public void rotate(int x, int y){
		this.rotate(x, y);
	}
	

}
