package entities;

public class Rent {
	
	//Vari�veis de inst�ncia privada para utilizar o processo de encapsulamento. 
	private String name; 
	private String email;
	/*Construtor das vari�veis de inst�ncia privadas. Cont�m a instru��o para inicialiar
	o objeto da classe. Deve possuir mesmo nome da classe.*/
	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}
	//M�todo para retornar o nome. Forma de retirar do modo privado e instanciar publicamente.
	public String getName(String name) {
		return name;
	}//M�todo para definir o nome.
	public void setName(String name) {
		this.name = name;
	}//M�todo para retornar o email.
	public String getEmail(String email) {
		return email;
	}//M�todo para definir o email.
	public void setEmail(String email) {
		this.email = email;
	}//M�todo para imprimir o nome e o email.
	public String toString() {
		return name + ", " + email;
	}

}
