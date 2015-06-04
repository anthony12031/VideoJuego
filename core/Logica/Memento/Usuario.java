package Memento;

import java.io.Serializable;

import EnteMagico.EnteMagico;

public class Usuario implements Cloneable,Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String nickName;
	private String passWord;
	private EnteMagico ente;
	private String keyRep;
	private int posicionX;
	private int posicionY;
	
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public String getKeyRep() {
		return keyRep;
	}
	public void setKeyRep(String keyRep) {
		this.keyRep = keyRep;
	}
	public Memento getMemento() throws CloneNotSupportedException{
		return new Memento((Usuario)this.clone());
	}
	
}
