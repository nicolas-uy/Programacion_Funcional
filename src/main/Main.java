package main;

import automotora.Automotora;
import celulares.Ventas;
import clientes.Calificacion;
import cultivos.Granja;
import empresa.Empresa;
import imc.IndiceMasaCorporal;
import instituto.Instituto;
import libros.Biblioteca;
import mascotas.Veterinaria;
import personas.PrincipalPersona;
import supermercado.Supermercado;
import unidadcurricular.Curso;
import usuarios.Personas;

public class Main {

	public static void main(String[] args) {
		// Ejericio de Biblioteca - Libros
		System.out.println("-- Ejercicio Libros: --");
		Biblioteca.crearLibros();
		Biblioteca.ejercicio1();
		Biblioteca.ejercicio2();
		Biblioteca.ejercicio3();
		Biblioteca.ejercicio4();
		// Ejercicio de Veterinaria - Mascotas
		System.out.println("\n\n\n-- Ejercicio Mascostas: --");
		Veterinaria.crearMascotas();
		Veterinaria.ejericio1();
		Veterinaria.ejericio2();
		Veterinaria.ejericio3();
		// Ejercicio de Ventas - Celulares
		System.out.println("\n\n\n-- Ejercicio Celulares: --");
		Ventas.crearCelulares();
		Ventas.ejercicio1();
		Ventas.ejercicio2();
		Ventas.ejercicio3();
		// Ejercicio de Personas y Usuarios
		System.out.println("\n\n\n-- Ejercicio Usuarios: --");
		Personas.crearPersonas();
		Personas.ejercicio1();
		Personas.ejercicio2();
		Personas.ejercicio3();
		// Ejercicio de Prestamos a Clientes
		System.out.println("\n\n\n-- Ejercicio Prestamo: --");
		Calificacion.crearClientes();
		Calificacion.evaluarPrestamo();
		// Ejercicio de Automotora y Auto
		System.out.println("\n\n\n-- Ejercicio Autos: --");
		Automotora.crearAutos();
		Automotora.ejercicio1();
		Automotora.ejercicio2();
		Automotora.ejercicio3();
		Automotora.ejercicio4();
		// Ejercicio de Granja y Cultivo
		System.out.println("\n\n\n-- Ejercicio Cultivos: --");
		Granja.crearCultivos();
		Granja.ejercicio1();
		Granja.ejercicio2();
		Granja.ejercicio3();
		// Ejercicio de I.M.C. - Indice Masa corporal.
		System.out.println("\n\n\n-- Ejercicio I.M.C.: --");
		IndiceMasaCorporal.ejercicio1();
		IndiceMasaCorporal.ejercicio2();
		// Ejercicio de Empresa y Empleado.
		System.out.println("\n\n\n-- Ejercicio Empresa y Empleado: --");
		Empresa.crearEmpleados();
		Empresa.ejercicio1();
		Empresa.ejercicio2();
		Empresa.ejercicio3();
		System.out.println("\n\n\n-- Ejercicio Instituto y Alumno: --");
		Instituto.crearAlumnos();
		Instituto.ejercicio1();
		Instituto.ejercicio2();
		Instituto.ejercicio3();
		Instituto.ejercicio4();
		Instituto.ejercicio5();
		Instituto.ejercicio6();
		Instituto.ejercicio7();
		System.out.println("\n\n\n-- Ejercicio Supermercado y Articulo: --");
		Supermercado.crearArticulos();
		Supermercado.ejercicio1();
		Supermercado.ejercicio2();
		Supermercado.ejercicio3();
		Supermercado.ejercicio4();
		Supermercado.ejercicio5();
		Supermercado.ejercicio6();
		Supermercado.ejercicio7();
		System.out.println("\n\n\n-- Ejercicio Personas: --");
		PrincipalPersona.crearPersonas();
		PrincipalPersona.ejercicio1();
		PrincipalPersona.ejercicio2();
		PrincipalPersona.ejercicio3();
		System.out.println("\n\n\n-- Ejercicio Unidades Curriculares: --");
		Curso.crearUnidades();
		Curso.ejercicio1();
		Curso.ejercicio2();
		Curso.ejercicio3();
	}

}
