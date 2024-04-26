package entities.composicao;

// Importações necessárias para a classe.
import java.text.SimpleDateFormat; // Importa a classe SimpleDateFormat para formatar datas.
import java.util.ArrayList; // Importa a classe ArrayList para usar listas dinâmicas.
import java.util.Date; // Importa a classe Date para trabalhar com datas.
import java.util.List; // Importa a interface List para trabalhar com listas.

// Classe que representa uma postagem em uma rede social.
public class Post {

    // Objeto SimpleDateFormat para formatação de datas.
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    // Atributos da classe Post.
    private Date moment; // Representa a data e hora da postagem.
    private String title; // Representa o título da postagem.
    private String content; // Representa o conteúdo da postagem.
    private Integer likes; // Representa o número de curtidas da postagem.
    
    private List<Comment> comments = new ArrayList<>(); // Lista de comentários associados à postagem.
    
    // Construtor padrão da classe Post.
    public Post() {
    }

    // Construtor com parâmetros para inicializar uma postagem com valores específicos.
    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment; // Inicializa o atributo moment com o valor do parâmetro moment.
        this.title = title; // Inicializa o atributo title com o valor do parâmetro title.
        this.content = content; // Inicializa o atributo content com o valor do parâmetro content.
        this.likes = likes; // Inicializa o atributo likes com o valor do parâmetro likes.
    }

    // Método getter para obter a data e hora da postagem.
    public Date getMoment() {
        return moment; // Retorna a data e hora da postagem.
    }

    // Método setter para definir a data e hora da postagem.
    public void setMoment(Date moment) {
        this.moment = moment; // Define a data e hora da postagem com o valor do parâmetro moment.
    }

    // Método getter para obter o título da postagem.
    public String getTitle() {
        return title; // Retorna o título da postagem.
    }

    // Método setter para definir o título da postagem.
    public void setTitle(String title) {
        this.title = title; // Define o título da postagem com o valor do parâmetro title.
    }

    // Método getter para obter o conteúdo da postagem.
    public String getContent() {
        return content; // Retorna o conteúdo da postagem.
    }

    // Método setter para definir o conteúdo da postagem.
    public void setContent(String content) {
        this.content = content; // Define o conteúdo da postagem com o valor do parâmetro content.
    }

    // Método getter para obter o número de curtidas da postagem.
    public Integer getLikes() {
        return likes; // Retorna o número de curtidas da postagem.
    }

    // Método setter para definir o número de curtidas da postagem.
    public void setLikes(Integer likes) {
        this.likes = likes; // Define o número de curtidas da postagem com o valor do parâmetro likes.
    }

    // Método getter para obter a lista de comentários da postagem.
    public List<Comment> getComments() {
        return comments; // Retorna a lista de comentários da postagem.
    }

    // Método para adicionar um comentário à lista de comentários da postagem.
    public void addComment(Comment comment) {
        comments.add(comment); // Adiciona o comentário à lista de comentários da postagem.
    }

    // Método para remover um comentário da lista de comentários da postagem.
    public void removeComment(Comment comment) {
        comments.remove(comment); // Remove o comentário da lista de comentários da postagem.
    }

    // Sobrescrita do método toString para exibir informações da postagem de forma personalizada.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Cria um StringBuilder para construir a representação da postagem.
        sb.append(title).append("\n"); // Adiciona o título da postagem.
        sb.append(likes).append(" Likes - "); // Adiciona o número de curtidas da postagem.
        sb.append(sdf.format(moment)).append("\n"); // Adiciona a data e hora da postagem formatadas.
        sb.append(content).append("\n"); // Adiciona o conteúdo da postagem.
        sb.append("Comments:\n"); // Adiciona o cabeçalho para os comentários.
        for (Comment c : comments) { // Itera sobre os comentários.
            sb.append(c.getText()).append("\n"); // Adiciona o texto de cada comentário seguido por uma quebra de linha.
        }
        return sb.toString(); // Retorna a representação da postagem como uma string.
    }
}