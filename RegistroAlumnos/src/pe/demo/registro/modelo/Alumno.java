package pe.demo.registro.modelo;

public class Alumno {
		
	private Long id;
	private String name;
	private String site;
	private String direccion;
	private String telefono;
	private double nota;
	private String foto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
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
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", name=" + name + ", site=" + site
				+ ", direccion=" + direccion + ", telefono=" + telefono
				+ ", nota=" + nota + ", foto=" + foto + "]";
	}
	
	
}
