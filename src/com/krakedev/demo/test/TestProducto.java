package com.krakedev.demo.test;
import com.krakedev.demo.*;

public class TestProducto {
	public static void main(String[] args) {
		Producto p1 = new Producto(0, null, null, 0);
		p1.setCodigo(987);
		p1.setNombre("Carla");
		p1.setDescripcion("Mi consentida");
		p1.setPeso(23);
		System.out.println("---------Datos-------");
		System.out.println("Codigo: "+p1.getCodigo());
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Descipcion: "+p1.getDescripcion());
	}

}
