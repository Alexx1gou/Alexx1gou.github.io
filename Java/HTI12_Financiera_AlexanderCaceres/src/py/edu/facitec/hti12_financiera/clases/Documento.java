package py.edu.facitec.hti12_financiera.clases;

import java.util.Date;

public class Documento {
	//Definir atributos del Documento
	private int id;
	private String tipo;
	private String archivoPDF;
	private Date fechaEntrega;
	private SolicitudPrestamo solicitudPrestamo;

	//Definir constructor por defecto
	public Documento() {
		id=0;
		tipo="";
		archivoPDF="";
		fechaEntrega=null;
		solicitudPrestamo=null;
	}
	//Definir constructor por parametros
	public Documento(int id, String tipo, String archivoPDF, Date fechaEntrega, SolicitudPrestamo solicitudPrestamo) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.archivoPDF = archivoPDF;
		this.fechaEntrega = fechaEntrega;
		this.solicitudPrestamo = solicitudPrestamo;
	}
	//Definir Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getArchivoPDF() {
		return archivoPDF;
	}
	public void setArchivoPDF(String archivoPDF) {
		this.archivoPDF = archivoPDF;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public SolicitudPrestamo getSolicitudPrestamo() {
		return solicitudPrestamo;
	}
	public void setSolicitudPrestamo(SolicitudPrestamo solicitudPrestamo) {
		this.solicitudPrestamo = solicitudPrestamo;
	}
	//Definir To String
	@Override
	public String toString() {
		return "Documento [id=" + id + ", tipo=" + tipo + ", archivoPDF=" + archivoPDF + ", fechaEntrega="
				+ fechaEntrega + ", solicitudPrestamo=" + solicitudPrestamo + ", toString()=" + super.toString() + "]";
	}


}
