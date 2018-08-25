package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.Usudao;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}

	public static void testCadastrar() {
		Usuario usu = new Usuario();
		usu.setNome("Breno1");
		usu.setLogin("Brneologin1");
		usu.setSenha("dfa654d561");

		Usudao usudao = new Usudao();
		usudao.cadastrar(usu);

		System.out.println("Cadastrado com sucesso!!");
	}

	public static void testAlterar() {
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("Breno1Alterado");
		usu.setLogin("Brneologin1Alterado");
		usu.setSenha("dfa654d561Alterado");

		Usudao usudao = new Usudao();
		usudao.alterar(usu);

		System.out.println("alterado com sucesso!!");
	}

	public static void testExcluir() {
		Usuario usu = new Usuario();
		usu.setId(1);

		Usudao usudao = new Usudao();
		usudao.excluir(usu);

		System.out.println("Excluido com sucesso!!");
	}
}
