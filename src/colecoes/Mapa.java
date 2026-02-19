package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		// MAP
		// Chave/Valor
		// Chave não aceita repetição
		// Valor aceita repetição

		Map<Integer, String> usuarios = new HashMap<>();

		// Não existe add no Map, pois o PUT faz o inserção e a alteração
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println("Quantidade de Usuários: " + usuarios.size());
		System.out.println("Está vazio? " + usuarios.isEmpty());
		System.out.println("ID dos Usuários: " + usuarios.keySet());
		System.out.println("Nome dos Usuários: " + usuarios.values());
		System.out.println("ID e Nome dos Usuários: " + usuarios.entrySet());
		System.out.println("Contém usuário com esse ID? " + usuarios.containsKey(4));
		System.out.println("Contém usuário com esse Nome? " + usuarios.containsValue("Rebeca"));
		System.out.println("Buscando usuário pelo ID: " + usuarios.get(4));
		System.out.println("Deletando um usuário passando ID " + usuarios.remove(1));
		System.out.println("Deletando um usuário passando ID e Nome: " + usuarios.remove(1, "Gui"));
		System.out.println();

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " - " + registro.getValue());
		}
	}

}
