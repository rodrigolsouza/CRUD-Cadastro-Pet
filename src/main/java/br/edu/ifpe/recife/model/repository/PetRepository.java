package br.edu.ifpe.recife.model.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.recife.model.entities.Pet;

public class PetRepository {
	private static List<Pet> pets= new ArrayList<>();
	
	public static void insert(Pet p) {
		
	}
	
	public static void uptade(Pet p) {
		
		for (Pet pAux: pets) {
			if (pAux.getNome().equals(p.getNome())) {
				pAux.setEspecie(p.getEspecie());
			}
		}
	}
	
	public static Pet read(String nome) {
		for (Pet pAux:pets) {
			if (pAux.getNome().equals(nome)) {
				return pAux;
			}else {
				return null;
			}
		}
	}
	
	public static void delete(String nome) {
		
	}
}
