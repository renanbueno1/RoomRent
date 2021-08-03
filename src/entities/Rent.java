package entities;

public class Rent {
	
	//Variáveis de instância privada para utilizar o processo de encapsulamento. 
	private String name; 
	private String email;
	/*Construtor das variáveis de instância privadas. Contêm a instrução para inicialiar
	o objeto da classe. Deve possuir mesmo nome da classe.*/
	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}
	//Método para retornar o nome. Forma de retirar do modo privado e instanciar publicamente.
	public String getName(String name) {
		return name;
	}//Método para definir o nome.
	public void setName(String name) {
		this.name = name;
	}//Método para retornar o email.
	public String getEmail(String email) {
		return email;
	}//Método para definir o email.
	public void setEmail(String email) {
		this.email = email;
	}//Método para imprimir o nome e o email.
	public String toString() {
		return name + ", " + email;
	}

}
