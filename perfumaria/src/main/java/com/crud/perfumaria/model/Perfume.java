package com.crud.perfumaria.model;

public class Perfume {
		
		private static int incr = 1;
		
		private int id = 0;
		
		private String nome;
		
		private String marca;

		public Perfume( String nome, String marca) {
			super();
			this.nome = nome;
			this.marca = marca;
		}

		public int getId() {
			return id;
		}

		public void setId() {
			if(this.id == 0) {
				this.id = incr++;
			}
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		
		
}
