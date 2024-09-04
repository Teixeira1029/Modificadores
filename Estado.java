package Modificadores;

public class Estado {

	private String sigla;
	private String nome;

	   // Construtor
	   public Estado(String nome, String sigla) {
	       this.nome = nome;
	       this.sigla = sigla;
	   }

	   // Métodos getters e setters
	   public String getNome() {
	       return nome;
	   }

	   public void setNome(String nome) {
	       this.nome = nome;
	   }

	   public String getSigla() {
	       return sigla;
	   }

	   public void setSigla(String sigla) {
	       this.sigla = sigla;
	   }
	}


	}

}
