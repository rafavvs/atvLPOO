public class Animal {
    private String nome;
    private int idade;

    public Animal(){    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Animal setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double getIdade() {
        return idade;
    }

    public Animal setIdade(double idade) {
        idade = idade;
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
