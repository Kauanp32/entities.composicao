// Pacote que contém a classe HourContract.
package entities.composicao;

// Importação da classe Date do pacote java.util para manipulação de datas.
import java.util.Date;

// Declaração da classe HourContract.
public class HourContract {
	
    // Declaração dos atributos privados da classe: data, valor por hora e horas trabalhadas.
	private Date date; // Armazena a data do contrato.
	private Double valuePerHour; // Armazena o valor pago por hora de trabalho.
	private Integer hours; // Armazena a quantidade de horas trabalhadas no contrato.
	
    // Construtor padrão sem argumentos que não inicializa os atributos.
	public HourContract() {
	}

    // Construtor com parâmetros para inicializar a classe com uma data, valor por hora e horas trabalhadas.
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date; // Define a data do contrato.
		this.valuePerHour = valuePerHour; // Define o valor por hora trabalhada.
		this.hours = hours; // Define a quantidade de horas trabalhadas.
	}

    // Métodos getters e setters para acessar e modificar os atributos da classe.
	public Date getDate() {
		return date; // Retorna a data do contrato.
	}

	public void setDate(Date date) {
		this.date = date; // Atualiza a data do contrato.
	}

	public Double getValuePerHour() {
		return valuePerHour; // Retorna o valor por hora de trabalho.
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour; // Atualiza o valor por hora de trabalho.
	}

	public Integer getHours() {
		return hours; // Retorna a quantidade de horas trabalhadas.
	}

	public void setHours(Integer hours) {
		this.hours = hours; // Atualiza a quantidade de horas trabalhadas.
	}
	
    // Método para calcular o valor total do contrato com base nas horas trabalhadas e no valor por hora.
	public double totalValue() {
		return valuePerHour * hours; // Calcula e retorna o valor total do contrato.
	}
} 