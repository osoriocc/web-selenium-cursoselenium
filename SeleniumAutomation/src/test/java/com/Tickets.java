package com;

public class Tickets {

	
	
	int precioAdulto, edad;
	double precioNino, precioEstudiante;
	boolean estudiante = false;
	String costo;
	
	//CONSTRUCTOR
	public Tickets (int precioNormal, int edadPerson, boolean credencialEstudiante)
	{
		precioAdulto= precioNormal;
		precioNino= precioNormal * (.85);
		precioEstudiante= precioNormal *(.5);
		costo="Precio Normal";
		edad=edadPerson;
		estudiante=credencialEstudiante;
		
	}
	
	//***************** METODO**********************
	public void costoDia()
	{
		System.out.println("El costo del ticket es: " + costo);
	}
	
	
	public void precioAdulto()
	{
		System.out.println("El costo del ticket de Adulto es: $" + precioAdulto);
	}
	
	public void precioNino()
	{
		System.out.println("El costo del ticket de Niño es: $" + precioNino);
	}
		
	public void precioEstudiante()
	{
		System.out.println("El costo del ticket de Estudiante es: $$$$$$ " + precioEstudiante);
	}
	
	
	public void verificarcostoTicket()
	{
		if(estudiante==true) {
		System.out.println("Eres un Estudiante, y el precio de tu ticket es: $ " + precioEstudiante);
		}else if(edad>18)
		 {
			System.out.println("Eres un ADULTO, y el precio de tu ticket es: $ " + precioAdulto);
		 }else {
			 System.out.println("Eres un NIÑO, y el precio de tu ticket es: $ " + precioNino);
		       }
		
	}
	
	
	//**************************OVERLOADING*************************************
	public double sumarTicket()
	{
		double suma = precioAdulto + precioNino;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(int descuento)
	{
		double suma = precioAdulto + precioNino - descuento;
		System.out.println(suma);
		return suma;
	}
	
	
	public double sumarTicket(int descuento, int descuentoExtra)
	{
		double suma = precioAdulto + precioNino - descuento - descuentoExtra;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(boolean descuento, boolean descuentoExtra)
	{
		double suma = precioAdulto + precioNino - 30 - 30;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(boolean descuento, int descuentoExtra)
	{
		double suma = precioAdulto + precioNino - 30 - descuentoExtra;
		System.out.println(suma);
		return suma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tickets tickets = new Tickets(100, 19, true);
		
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		
		tickets.sumarTicket(); // cuando no se le pone un valor 
		tickets.sumarTicket(20); // cuando tiene un valor especifico
		tickets.sumarTicket(20,20 ); // cuando tiene varios valores
		tickets.sumarTicket(true,false ); // con valores booleanos
		tickets.sumarTicket(true,30 ); // con valores combinados
		
	}

}
