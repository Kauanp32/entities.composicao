package entities.composicao;

// Declaração da classe Comment.
public class Comment {
	
    // Atributo para armazenar o texto do comentário.
    private String text;
	
    // Construtor padrão da classe Comment.
    public Comment() {
    }

    // Construtor com parâmetro para inicializar o texto do comentário.
    public Comment(String text) {
        this.text = text; // Define o texto do comentário com o valor do parâmetro text.
    }

    // Método getter para obter o texto do comentário.
    public String getText() {
        return text; // Retorna o texto do comentário.
    }

    // Método setter para definir o texto do comentário.
    public void setText(String text) {
        this.text = text; // Define o texto do comentário com o valor do parâmetro text.
    }
}