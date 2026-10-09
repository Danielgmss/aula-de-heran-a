public class Dev extends Funcionario{
    private String linguagemPrincipal;


    public Dev(String nome, double salarioBase, String linguagemPrincipal) {
        super(nome, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    void programar() {
        System.out.printf("%s vai programar em %s", super.getNome(), this.linguagemPrincipal);
    }
}
