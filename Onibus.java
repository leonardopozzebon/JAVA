//trabalhando com get e set (Encapsulamento)
package com.pozzebon.objetos;

public class Onibus {
	
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	
	public String getMarca() {
		return this.marca;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
