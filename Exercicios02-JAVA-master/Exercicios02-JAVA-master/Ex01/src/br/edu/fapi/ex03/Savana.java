package br.edu.fapi.ex03;

import java.util.ArrayList;
import java.util.List;

public class Savana {

	public static void main(String[] args) {
		List<Animal> meusAnemaezenhos = new ArrayList<Animal>();
		
		Animal elefantenho = new Animal();
		elefantenho.cor="Laranja";
		
		Animal leaozenho = new Animal();
		leaozenho.cor = "Cinza";
		
		meusAnemaezenhos.add(elefantenho);
		meusAnemaezenhos.add(leaozenho);
		
		for(Animal animal : meusAnemaezenhos) {
			System.out.println("Minha corzenha: " + animal.cor);
		}
		
		
	}
	
}
