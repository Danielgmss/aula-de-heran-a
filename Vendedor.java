public class Vendedor extends Funcionario{
    private double totalVendido;

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.totalVendido = 0;
    }

    double registrarVenda(double valor) {
        if (valor < 0) {
            System.out.println("Venda não finalizada!");
            return 0.0;
        }
        return totalVendido += valor;
    }

    double calcularComissao() {
        return totalVendido * (5/100.0);
    }

    public double getTotalVendido() {
        return totalVendido;
    }
}
