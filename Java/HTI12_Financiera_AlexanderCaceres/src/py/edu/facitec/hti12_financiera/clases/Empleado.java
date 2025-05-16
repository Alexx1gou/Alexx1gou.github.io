package py.edu.facitec.hti12_financiera.clases;

public class Empleado extends Persona{
	//Definir atributos del empleado
	private int idEmpleado;
	private String cargo;
	private Double salario;

	//Generar constructor por defecto
	public Empleado() {
		idEmpleado=0;
		cargo="";
		salario=0.00;
	}
	//Constructor por parametros
	public Empleado(int idEmpleado, String cargo, Double salario) {
		super();
		this.idEmpleado = idEmpleado;
		this.cargo = cargo;
		this.salario = salario;

	}
	//Definir Getters and Setters
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	//Definir metodos propios
	public void evaluarSolicitud() {
		System.out.println("El empleado evaluó la solicitud");
	}
	//To String
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", cargo=" + cargo + ", salario=" + salario
				+ ", toString()=" + super.toString() + "]";
	}

}
