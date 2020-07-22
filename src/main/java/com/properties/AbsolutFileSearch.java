package com.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;



public class AbsolutFileSearch implements PropertiesFileSearch {
	
	//asegurarse de colocar
	//directorio donde esta el properties de twitter
	private String ruta = "D:\\programacion\\eclipse-workspace\\PRUEBAPP2\\properties\\twitter.properties";
	
	public AbsolutFileSearch() {
	}			
	
	public FileReader getFileAddress() throws FileNotFoundException	{
		FileReader ret = new FileReader(ruta);
		return ret;
	}
	public void setAddress(String nuevaRuta) {
		this.ruta = nuevaRuta;
	}
}
