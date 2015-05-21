package Memento;

import EnteMagico.EnteMagico;

public class Usuario implements Cloneable {
	
	private String nombre;
	private String apellido;
	private String nickName;
	private String passWord;
	private EnteMagico ente;
	private Usuario user=null;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public EnteMagico getEnte() {
		return ente;
	}
	
	public void setEnte(EnteMagico e){
		ente=e;
	}
	
	public void setMemento(Memento m){
		user=m.getUsuario();
	}
	
	public Memento getMemento() throws CloneNotSupportedException{
		return new Memento((Usuario)user.clone());
	}
	
}
