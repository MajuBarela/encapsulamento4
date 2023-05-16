public class Perfil {

    private String nome;
    private int idade;
    private String username;
    private int senha;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return this.senha;
    }

    public Perfil(String nome, int idade, String username, int senha) {
        this.nome = nome;
        this.idade = idade;
        this.username = username;
        this.senha = senha;
    }

    public Perfil() {
        
    }
}