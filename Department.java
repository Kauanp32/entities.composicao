package entities.composicao;

// Declaração da classe Department.
public class Department {
	
    // Atributo para armazenar o nome do departamento.
    private String name;
	
    // Construtor padrão da classe Department.
    public Department() {
    }

    // Construtor com parâmetro para inicializar o nome do departamento.
    public Department(String name) {
        this.name = name; // Define o nome do departamento com o valor do parâmetro name.
    }

    // Método getter para obter o nome do departamento.
    public String getName() {
        return name; // Retorna o nome do departamento.
    }

    // Método setter para definir o nome do departamento.
    public void setName(String name) {
        this.name = name; // Define o nome do departamento com o valor do parâmetro name.
    }
}