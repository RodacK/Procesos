package app.model;

public class Proceso {

	private static int id_;
	private int id;
	private String name;
	private Estado estado;
	private int tiempo;

	public Proceso(String name, Estado estado, int tiempo){
		this.id = id_++;
		this.name = name;
		this.estado = estado;
		this.tiempo = tiempo;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
}
