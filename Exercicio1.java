public class MyClass {
  public static void main(String args[]) {
      
      //1 calculo para empresa
      int install = 300;
      int limpeza = 150;
      double manut = 499.99;
      double custo = install + limpeza + manut;
      System.out.println(custo);
      
      //2 sal
      int hora = 35;
      int trab = 8;
      int fimdia = hora * trab;
      System.out.println(fimdia);
      
      //3
      int caixa = 27;
      int quant = 16;
      int bombons = caixa * quant;
      System.out.println(bombons);
      
      //4
      int agua = 300;
      int caixaQuant = 20;
      int caixaUsadas = agua / caixaQuant;
      System.out.println(caixaUsadas);
      
      //5
      int compras = 120;
      int vendas = 80;
      int custo5 = 30;
      int compras2 = 50;
      int faturamento = (compras + compras2) * custo5;
      int camisas = compras - vendas + compras2;
      System.out.println(faturamento + " e "+ camisas);
      
      //6
      int variavel = 67;
      int dobro = variavel * 2;
      int metade = variavel / 2;
      System.out.println(dobro + " e " + metade);
  }
}

