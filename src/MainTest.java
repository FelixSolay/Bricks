
public class MainTest {
	
	public static void main(String[] args) {
		GestorArchivos archIn = new GestorArchivos("pared.in");
		Pared paredPrueba = new Pared(archIn.leerArchivo());
		paredPrueba.marcarSalidas();
		GestorArchivos archOut = new GestorArchivos("pared.out");
		if(archOut.escribirArchivo())
			System.out.println("El archivo fue escrito correctamente");
		
		// TODO Auto-generated method stub

	}

}
