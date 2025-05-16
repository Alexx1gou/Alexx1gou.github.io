package py.edu.facitec.hti12_financiera.clases;

import java.util.Date;

public class Cliente extends Persona{
	//Definir atributos de Cliente
	private int nroCliente;
	private Date fechaRegistro;
	private String estado;
	

	//Definir constructor por defecto
	public Cliente() {
		nroCliente=0;
		fechaRegistro=null;
		estado="";
	}
	//Definir constructor por parametros
	public Cliente(int nroCliente, Date fechaRegistro, String estado) {
		super();
		this.nroCliente = nroCliente;
		this.fechaRegistro = fechaRegistro;
		this.estado = estado;
	}
	//Definir Getters and Setters
	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//Definir metodos propios
	public void solicitarPrestamo() {
		System.out.println("El cliente solicitó un prestamo");
	}
	//To String
	@Override
	public String toString() {
		return "Cliente [nroCliente=" + nroCliente + ", fechaRegistro=" + fechaRegistro + ", estado=" + estado
				+", toString()="
				+ super.toString() + "]";
	}
}
