
public class GestorArchivos {
	private String nombreArchivo;
	
	public GestorArchivos(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}
	

	public Pared leerArchivo() {
		Pared foo;
		return foo = new Pared(1,21);
	}
	
	public boolean escribirArchivo() {
		return true;
	}
}
