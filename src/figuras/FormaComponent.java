package figuras;

public abstract class FormaComponent {
	public void dibuja() {
		dibuja(0);
	}
	
	protected void dibuja(int n) {
		throw new UnsupportedOperationException();
	}
	
	
	public void desplazaRelativo(int x, int y) {
		throw new UnsupportedOperationException();

	}
	
	public void anyade(FormaComponent fc) {
		throw new UnsupportedOperationException();
		
	}
	
	public void elimina(FormaComponent fc) {
		throw new UnsupportedOperationException();
	}
	
	
	

}
