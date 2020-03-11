package main;

public class Usuario {
	private String username, contrasenia;
	public Usuario(String username, String contrasenia) {
		this.username = username;
		this.contrasenia = contrasenia;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}
