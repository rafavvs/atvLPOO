public class Cachorro extends Animal {

    public Cachorro(){
        super();
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String toString() {
        return "Cachorro{}";
    }
}
