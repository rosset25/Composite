package figuras;

public class Rectangulo extends FormaComponent{
	
	private int x1, y1, x2, y2;
	
	public Rectangulo(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void dibuja(int n) {
		StringBuilder espacio = new StringBuilder();
		for(int i =0; i < n; i++) {
			espacio.append("\t");
		}
		
		System.out.println(espacio+"Rectangulo("+ x1 + ", " + y1 + ", " + x2 + ", " + y2 + ")");
	}
	
	@Override
	public void desplazaRelativo(int x, int y) {
		this.x1 += x;
		this.x2 += x;
		this.y1 += y;
		this.y2 += y;

	}
	
	

	
	
}
