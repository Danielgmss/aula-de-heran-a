public class Funcionario {
    private String nome;
    private double salarioBase;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    double aumentarSalario(int percentual) {
        if (percentual < 0) {
            return 0.0;
        }
        return this.salarioBase += this.salarioBase * (percentual / 100.0);
    }

    void exibirDados() {
        System.out.println("nome: " + this.nome);
        System.out.println("salario base: " + this.salarioBase);
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salariobase) {
        this.salarioBase = salariobase;
    }
}
