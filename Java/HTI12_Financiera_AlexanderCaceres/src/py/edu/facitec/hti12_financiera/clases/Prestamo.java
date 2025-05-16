package py.edu.facitec.hti12_financiera.clases;

import java.util.Date;

public class Prestamo {
	//Definir atributos del Prestamo
	private int id;
	private Double monto;
	private Double tasaInteres;
	private int plazoMeses;
	private Date fechaAprobacion;
	private Cliente cliente;

	//Definir constructor por defecto
	public Prestamo() {
		id=0;
		monto=0.00;
		tasaInteres=0.00;
		plazoMeses=0;
		fechaAprobacion=null;
		cliente=null;
	}
	//Definir constructor por parametros

	public Prestamo(int id, Double monto, Double tasaInteres, int plazoMeses, Date fechaAprobacion, Cliente cliente) {
		super();
		this.id = id;
		this.monto = monto;
		this.tasaInteres = tasaInteres;
		this.plazoMeses = plazoMeses;
		this.fechaAprobacion = fechaAprobacion;
		this.cliente = cliente;
	}

	//Definir Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Double getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(Double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	public int getPlazoMeses() {
		return plazoMeses;
	}
	public void setPlazoMeses(int plazoMeses) {
		this.plazoMeses = plazoMeses;
	}
	public Date getFechaAprobacion() {
		return fechaAprobacion;
	}
	public void setFechaAprobacion(Date fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	//Definir To String
	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", monto=" + monto + ", tasaInteres=" + tasaInteres + ", plazoMeses=" + plazoMeses
				+ ", fechaAprobacion=" + fechaAprobacion + ", cliente=" + cliente + ", toString()=" + super.toString()
				+ "]";
	}
}
