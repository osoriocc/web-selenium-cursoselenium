package com;

public class Condicionales {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
	int velocidad = 40;
	int limiteVelocidad = 60;

//*****************IF*************	
	//	if ( velocidad > limiteVelocidad)
//	{
//		System.out.println("Multa");
//	}
//		
//IF ELFE***********************************************************
//	if ( velocidad > limiteVelocidad)
//	{
//		System.out.println("Multa Por Exceso de Velocidad");
//	}
//	else 
//	{
//		System.out.println("Velocidad Adecuada");
//	}
	//*****************************************************************
//IF ANIDADOS*****************************************************************
//	boolean carretera = true;
//	if(carretera == true)	
//	{
//		System.out.println("Vamos en la carretera");
//	}
//	
//	limiteVelocidad = 100;
//	
//	if ( velocidad > limiteVelocidad)
//		{
//			System.out.println("Multa Por Exceso de Velocidad");
//		}
//		else 
//		{
//			System.out.println("Velocidad Adecuada");
//		}
//	
	
	//IF ELSE IF*****************************************************************
//	boolean carretera = true;
//	if(carretera == true)	
//	{
//		System.out.println("Vamos en la carretera");
//	}
//	
//	limiteVelocidad = 100;
//	
//	if ( velocidad > limiteVelocidad)
//		{
//			System.out.println("Multa Por Exceso de Velocidad");
//		}
//		else 
//		{
//			System.out.println("Velocidad Adecuada");
//		}
//	
//	 if(velocidad > limiteVelocidad)
//	{
//		System.out.println("Vas en una calle y en exceso de velocidad, MULTA!");
//	}
//	
//	
//	else 
//	{
//		System.out.println("Vas en una calle y en exceso de velocidad adecuada");
//	}
	
//*****************************************************************
// *******************SWITCH********************************************
	int temperatura = 22;
	
	switch(temperatura)
	{
	case 10:
		System.out.println("Frío");
        break;	
		
	case 20:
		System.out.println("Agradable");
		break;
	
	case 30:
		System.out.println("Calor");
		break;
		
	case 40:
		System.out.println("Estamos en el desierto");
		break;
		
	default:
		System.out.println("Da Igual el clima");
		break;
			
		
	}
	
	
	
	
	
	
	
	
//*****************************************************************
	}

}
