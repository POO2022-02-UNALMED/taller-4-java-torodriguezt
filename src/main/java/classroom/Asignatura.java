package classroom;

public class Asignatura {
	
	String nombre;
	String n = nombre;
	double codigoInterno;
	int codigoExterno;
	Tipo tipo;
	
	Asignatura(){
		this(0);
	}
	
	Asignatura(String nombre, Tipo tipo){
		this.nombre = nombre;
		this.tipo = Tipo.FUNDAMENTACION;
	}
	
	Asignatura(int codigoExterno, Tipo tipo){
		this.codigoExterno = codigoExterno;
	}
	

	public Asignatura(int i) {
		this.nombre = "Sin nombre";
	}
	
	public void setCodigoInterno(int numero) {
		this.codigoInterno = numero;
	}
	
	public void cambiarDatos(String nombre) {
		this.nombre = nombre;
	}
	
	public void cambiarDatos(int numeroExterno) {
		this.codigoExterno = numeroExterno;
	}
	
	
}