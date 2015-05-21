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

public class Archivo {
	public static final String path="jugadores.obj";//ruta del archivo, constante durante todo el programa
	private static ArrayList<Memento> jugadores=new ArrayList<Memento>();//ArrayList que guarda todos lo jugadores registrados
	private static File archivo=new File(path);//archivo de guardado y consulta
	
	static public synchronized boolean agregar(Memento jugador){//agregar jugador al archivo
		jugadores=consultar();
		archivo.delete();
		try{
			archivo=new File(path);
			FileOutputStream streamArchivo=new FileOutputStream(archivo);
			ObjectOutputStream streamObjeto=new ObjectOutputStream(streamArchivo);
			for(int i=0;i<jugadores.size();i++){//reinsecion de jugadores ya registrados
				streamObjeto.writeObject(jugadores.get(i));
			}
			streamObjeto.writeObject(jugador);//insecion de ultimo jugador registrado
			streamObjeto.close();
			return true;
		}
		catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "El archivo no se encuentra o esta da�ado");
			return false;
		}
		catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error en la escritura del archivo");
			return false;
		}
	}
	/**
	 * @return Devuleve un ArrayList con todos lo jugadores encontrados en el archivo
	 * */
	public static synchronized ArrayList<Memento> consultar() {//consulta de jugadores
		archivo=new File(path);
		ArrayList<Memento> jugadores=new ArrayList<Memento>();
		try{
			FileInputStream streamArchivo=new FileInputStream(archivo);
			ObjectInputStream streamObjeto=new ObjectInputStream(streamArchivo);
			while(true){//carga de jugadores en un ArrayList
				Memento p=(Memento)streamObjeto.readObject();
				jugadores.add(p);
			}
		}
		catch(ClassNotFoundException e){
			
		}
		catch(IOException e){
		}
		return jugadores;
	}

	public static synchronized Memento consultar(String nickName, String pass){
		ArrayList<Memento> lista=consultar();
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getUsuario().getNickName().equals(nickName) && lista.get(i).getUsuario().getPassWord().equals(pass)){
				return lista.get(i);
			}
		}
		return null;
	}
	
}
