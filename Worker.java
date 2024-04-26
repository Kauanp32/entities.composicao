// Define o pacote ao qual a classe Worker pertence, organizando as classes em pacotes para melhor manutenção do código.
package entities.composicao;

// Importações de classes e interfaces necessárias para o funcionamento da classe Worker.
import java.util.ArrayList; // Permite criar uma lista dinâmica de objetos, neste caso, de contratos de horas.
import java.util.Calendar; // Utilizada para manipulação de datas, como obter o ano e o mês de um contrato.
import java.util.List; // Interface List do Java Collections Framework, que define uma sequência de elementos.

import entities.enums.WorkerLevel; // Importa o tipo enumerado WorkerLevel, que define os níveis de um trabalhador (ex.: JUNIOR, MID_LEVEL, SENIOR).

// Declaração da classe Worker, que representa um empregado ou trabalhador na empresa.
public class Worker {
	
    // Atributos privados da classe Worker. A visibilidade privada restringe o acesso direto a estes campos, promovendo o encapsulamento.
	private String name; // Nome do trabalhador.
	private WorkerLevel level; // Nível do trabalhador, baseado no enum WorkerLevel.
	private Double baseSalary; // Salário base do trabalhador.
	
	private Department department; // Departamento ao qual o trabalhador pertence. É uma associação entre Worker e Department.
	private List<HourContract> contracts = new ArrayList<>(); // Lista que armazena os contratos de hora do trabalhador.
	
    // Construtor padrão. Permite a criação de um objeto Worker sem inicializar seus campos.
	public Worker() {
	}

    // Construtor com parâmetros para inicialização de um Worker com valores específicos para seus campos.
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name; // Define o nome do trabalhador.
		this.level = level; // Define o nível do trabalhador.
		this.baseSalary = baseSalary; // Define o salário base do trabalhador.
		this.department = department; // Associa o trabalhador a um departamento.
	}

	// Método getter para obter o nome do trabalhador.
	public String getName() {
	    return name; // Retorna o nome do trabalhador.
	}

	// Método setter para definir o nome do trabalhador.
	public void setName(String name) {
	    this.name = name; // Define o nome do trabalhador com o valor passado como parâmetro.
	}

	// Método getter para obter o nível do trabalhador.
	public WorkerLevel getLevel() {
	    return level; // Retorna o nível do trabalhador.
	}

	// Método set para definir o nível do trabalhador.
	public void setLevel(WorkerLevel level) {
	    this.level = level; // Define o nível do trabalhador com o valor passado como parâmetro.
	}
	
	// Método público que retorna o departamento ao qual o trabalhador está associado.
	public Department getDepartment() {
		return department; // Retorna o valor atual do atributo 'department'.
	}

	public void setDepartment(Department department) {
		this.department = department; // Permite alterar o departamento do trabalhador.
	}

	// Método público que retorna uma lista de objetos do tipo HourContract. 
	public List<HourContract> getContracts() {
			return contracts; // Aqui, retorna a lista 'contracts', que armazena todos os contratos de horas associados a um trabalhador.
	}

    // Adiciona um contrato à lista de contratos do trabalhador. Não retorna valor.
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
    // Remove um contrato da lista de contratos do trabalhador. Não retorna valor.
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
    // Calcula o total de renda do trabalhador em um dado ano e mês, somando o salário base com o valor dos contratos pertinentes.
	public double income(int year, int month) {
		double sum = baseSalary; // Inicia com o salário base do trabalhador.
		Calendar cal = Calendar.getInstance(); // Utilizado para manipular datas dos contratos.
		for (HourContract c : contracts) { // Itera sobre todos os contratos do trabalhador.
			cal.setTime(c.getDate()); // Configura a data do contrato atual no objeto Calendar.
			int c_year = cal.get(Calendar.YEAR); // Extrai o ano do contrato.
			int c_month = 1 + cal.get(Calendar.MONTH); // Extrai o mês do contrato (Calendar.MONTH é baseado em zero).
			if (year == c_year && month == c_month) { // Verifica se o contrato é do mês e ano especificados.
				sum += c.totalValue(); // Adiciona o valor total do contrato à soma.
			}
		}
		return sum; // Retorna a soma do salário base mais os valores dos contratos no mês/ano especificado.
	}
}