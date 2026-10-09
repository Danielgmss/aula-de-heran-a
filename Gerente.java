public class Gerente extends Funcionario{
    private String setor;


    public Gerente(String nome, double salarioBase, String setor) {
        super(nome, salarioBase);
        this.setor = setor;
    }

    void realizarReuniao() {
        System.out.printf("%s vai realizar uma reunão no setor: %s", super.getNome(), this.setor);
    }

    public String getSetor() {
        return setor;
    }
}
