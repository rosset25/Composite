package figuras;

public class Circulo extends FormaComponent {
	private int x1, y1, radio;

	public Circulo(int x1, int y1, int radio) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.radio = radio;
	}
	
	@Override
	public void dibuja(int n) {
		StringBuilder espacio = new StringBuilder();
		for(int i =0; i < n; i++) {
			espacio.append("\t");
		}
		
		System.out.println(espacio+"Circulo("+ x1 + ", " + y1 + ", " + radio + ")");
	}
	
	@Override
	public void desplazaRelativo(int x, int y) {
		this.x1 += x;
		this.y1 += y;
	
	}
}
