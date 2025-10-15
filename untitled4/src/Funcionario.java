public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario setSalario(double salario) {
        salario = salario;
        return this;
    }

    public double getBonificacao(){
        return this.salario*0.1;
    }


}