package main;

public class Usuario {
	private String username, contrasenia,email;
	public Usuario(String username, String contrasenia, String email) {
		this.username = username;
		this.contrasenia = contrasenia;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
