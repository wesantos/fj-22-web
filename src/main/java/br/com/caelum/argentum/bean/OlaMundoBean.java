package br.com.caelum.argentum.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {

	private String mensagem = "Quem e voce?";

	public String getMensagem() {
		System.out.println("getMensagem");
		return mensagem;
		
	}

	
	
	private String nome;

	public String getNome() {
		System.out.println("getNome");
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("setNome");
		this.nome = nome;
	}
	
	public void nomeFoiDigitado() {
		System.out.println("\nChamou o botao");
	}
	
}
