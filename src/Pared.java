
public class Pared {
	private Ladrillo[][] matrizPared;

	public Pared(Ladrillo[][] matrizPared) {
		this.matrizPared = matrizPared;
	}
	
	public Pared(Pared creada) {
		this.matrizPared = creada.matrizPared;
	}
	
	public Pared(int filas, int columnas) {
		this.matrizPared = new Ladrillo[filas][columnas];
	}
	
	public void marcarSalidas() {
		
		this.matrizPared[1][1].sacar = true;
	}
}
