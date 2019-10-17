package figuras;

public class Main {

	public static void main(String[] args) {
	
		// Crea la forma principal
		FormaComponent formaPrin = new Forma("Principal");
		formaPrin.anyade(new Rectangulo(10,10,20,20));
		formaPrin.anyade(new Circulo(10,10,20));

		// Crea la forma interior
		FormaComponent formaInt = new Forma("Interna");
		FormaComponent r1= new Rectangulo(2,2,3,3);
		FormaComponent r2= new Rectangulo(3,3,4,4);
		formaInt.anyade(r1);
		formaInt.anyade(r2);
		formaInt.anyade(new Circulo(1,1,20));

		// Añade la forma interior a la principal
		formaPrin.anyade(formaInt);

		System.out.println("\nDibujo INICIAL:");
		formaPrin.dibuja();
		System.out.println("\nDibujo tras desplazar:");
		formaPrin.desplazaRelativo(100,100);
		formaPrin.dibuja();
		System.out.println("\nDibujo tras eliminar:");
		formaInt.elimina(r1);
		formaInt.elimina(r2);
		formaPrin.dibuja();

	}

}
