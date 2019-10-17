package figuras;

import java.util.ArrayList;

public class Forma extends FormaComponent {
	private String nombre;
	private ArrayList<FormaComponent> listaElementos;

	public Forma(String nombre) {
		super();
		this.nombre = nombre;
		this.listaElementos = new ArrayList<FormaComponent>();
		
		
	}

	public void dibuja(int n) {
		StringBuilder espacio = new StringBuilder();
		for(int i =0; i < n; i++) {
			espacio.append("\t");
		}
		
		System.out.println(espacio+"Forma(" + nombre + ") {");
		for (FormaComponent f : listaElementos) {
			f.dibuja(n + 1);
		}
		System.out.println(espacio+"}");
	}

	public void desplazaRelativo(int x, int y) {
		for (FormaComponent f : listaElementos) {
			f.desplazaRelativo(x, y);
		}

	}

	public void anyade(FormaComponent fc) {
		listaElementos.add(fc);

	}

	public void elimina(FormaComponent fc) {
		listaElementos.remove(fc);
	}


}
