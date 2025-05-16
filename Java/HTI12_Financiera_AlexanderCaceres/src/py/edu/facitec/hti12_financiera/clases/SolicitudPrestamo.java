package py.edu.facitec.hti12_financiera.clases;

import java.util.Date;
import java.util.List;

public class SolicitudPrestamo {
	//Definir solicitudPrestamo
	private int id;
	private Date fechaSolicitud;
	private Double montoSolicitado;
	private String estado;
	private Cliente cliente;
	private Empleado empleado;
	private List<Documento> documento;

	//Definir Constructor por defecto
	public SolicitudPrestamo() {
		id=0;
		fechaSolicitud=null;
		montoSolicitado=0.00;
		estado="";
		documento=null;
		cliente=null;
		empleado=null;
	}
	//Definir constructor por parametros
	public SolicitudPrestamo(int id, Date fechaSolicitud, Double montoSolicitado, String estado, Cliente cliente,
			Empleado empleado, List<Documento> documento) {
		super();
		this.id = id;
		this.fechaSolicitud = fechaSolicitud;
		this.montoSolicitado = montoSolicitado;
		this.estado = estado;
		this.cliente = cliente;
		this.empleado = empleado;
		this.documento = documento;
	}

	//Definir Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public Double getMontoSolicitado() {
		return montoSolicitado;
	}
	public void setMontoSolicitado(Double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public List<Documento> getDocumento() {
		return documento;
	}
	public void setDocumento(List<Documento> documento) {
		this.documento = documento;
	}
	//Metodos propios
	public boolean validar() {
		if (montoSolicitado == null || montoSolicitado <= 0) {
			System.out.println("Error: El monto solicitado debe ser mayor que cero.");
			return false;
		}

		if (documento == null) {
			System.out.println("Error: La solicitud debe tener un documento asociado.");
			return false;
		}

		if (estado == null || estado.length() == 0) {
			System.out.println("Error: El estado de la solicitud no puede estar vacío.");
			return false;
		}

		if (fechaSolicitud != null && fechaSolicitud.after(new Date())) {
			System.out.println("Error: La fecha de solicitud no puede estar en el futuro.");
			return false;
		}

		System.out.println("La solicitud de préstamo es válida.");
		return true;
	}
	//Definir ToString
	@Override
	public String toString() {
		return "SolicitudPrestamo [id=" + id + ", fechaSolicitud=" + fechaSolicitud + ", montoSolicitado="
				+ montoSolicitado + ", estado=" + estado + ", cliente=" + cliente + ", empleado=" + empleado
				+ ", documento=" + documento + ", toString()=" + super.toString() + "]";
	}

}
