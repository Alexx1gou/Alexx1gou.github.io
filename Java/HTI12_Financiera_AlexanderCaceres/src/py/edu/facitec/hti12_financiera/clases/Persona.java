package py.edu.facitec.hti12_financiera.clases;

public class Persona {
	//Definir atributos de persona
	private int id;
	private String nombre;
	private String cedula;
	private String direccion;
	private String telefono;

	//Definir constructor por defecto
	public Persona() {
		id=0;
		nombre="";
		cedula="";
		direccion="";
		telefono="";
	}

	//Definir constructor por parametro
	public Persona(int id, String nombre, String cedula, String direccion, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//Generar getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	//Metodos propios de la persona
	public void imprimirDatosBasicos() {
		System.out.println("El id de la persona es "+id);
		System.out.println("El nombre de la persona es "+ nombre);
		System.out.println("La cedula de la persona es "+cedula);
		System.out.println("La direccion de la persona es "+direccion);
		System.out.println("El telefono de la persona es "+telefono);
	}
	//Generar ToString
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", toString()=" + super.toString() + "]";
	}

	

}


