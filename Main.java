public class Main{
   static void main() {
      Dev dev1 = new Dev("niel", 20000, "Java");
      Vendedor vendedor1 = new Vendedor("diego", 1700);
      Gerente gerente1 = new Gerente("ewerton", 3000, "002");

      System.out.println("teste aumento");
      System.out.println("salario base");
      dev1.exibirDados();
      dev1.aumentarSalario(10);
      System.out.println("pos aumento");
      dev1.exibirDados();

      System.out.println("teste venda");
      System.out.println("dados sem alteração");
      System.out.println(vendedor1.getTotalVendido());
      System.out.println("pos vendas");
      vendedor1.registrarVenda(1000);
      vendedor1.registrarVenda(500);
      System.out.println(vendedor1.getTotalVendido());

      System.out.println("teste comissao");
      System.out.println(vendedor1.calcularComissao());

      System.out.println("teste venda invalida");
      vendedor1.registrarVenda(-1);
      System.out.println(vendedor1.getTotalVendido());



   }
}