package Memento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Archivo{
	
	public static final String path="jugadores.obj";
	private ArrayList<Memento> jugadores;
	private File archivo;
	
	private static Archivo persistencia=null;
	private ObjectInputStream streamInObjeto;
	
	public Archivo() {
		jugadores=new ArrayList<Memento>();
		archivo=new File(path);
	}
	
	public boolean agregar(Memento jugador)
	{
		jugadores=consultar();
		archivo.delete();
		try{
			archivo=new File(path);
			ObjectOutputStream  streamOutObjeto=new ObjectOutputStream(new FileOutputStream(archivo));
			for(int i=0;i<jugadores.size();i++){
				streamOutObjeto.writeObject(jugadores.get(i));
			}
			streamOutObjeto.writeObject(jugador);
			streamOutObjeto.close();
			return true;
		}
		catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "El archivo no se encuentra o esta corrompido");
			return false;
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
			return false;
		}
	}
	
	public ArrayList<Memento> consultar()
	{
		archivo=new File(path);
		ArrayList<Memento> jugadores=new ArrayList<Memento>();
		try{
			streamInObjeto = new ObjectInputStream(new FileInputStream(archivo));
			while(true){
				Memento p=(Memento)streamInObjeto.readObject();
				jugadores.add(p);
			}
		}
		catch(ClassNotFoundException e){
		}
		catch(IOException e){
		}
		return jugadores;
	}

	public Memento consultar(String nickName, String pass){
		ArrayList<Memento> lista=consultar();
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getUsuario().getNickName().equals(nickName) && lista.get(i).getUsuario().getPassWord().equals(pass)){
				return lista.get(i);
			}
		}
		return null;
	}
	
	public static Archivo getPersistencia(){
		if(persistencia==null){
			persistencia=new Archivo();
		}
		return persistencia;
	}
	
	public boolean consultar(String nickName){
		ArrayList<Memento> lista=consultar();
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getUsuario().getNickName().equals(nickName)){
				return true;
			}
		}
		return false;
	}
	
	public boolean actualizar(String nickName, Memento jugador){
		jugadores=consultar();
		archivo.delete();
		try{
			archivo=new File(path);
			ObjectOutputStream  streamOutObjeto=new ObjectOutputStream(new FileOutputStream(archivo));
			for(int i=0;i<jugadores.size();i++){
				if(nickName.equals(jugadores.get(i).getUsuario().getNickName())){
					streamOutObjeto.writeObject(jugador);
				}
				else{
					streamOutObjeto.writeObject(jugadores.get(i));
				}
			}
			streamOutObjeto.close();
			return true;
		}
		catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "El archivo no se encuentra o esta corrompido");
			return false;
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
			return false;
		}
	}
	
}
