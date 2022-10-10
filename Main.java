public class Main {
  public static void main(String[] args) {
  
    Produto celular = new Produto("Celular", "Celular caro", "Uni7", "Steven", 10000.50f);
  
    Produto carregador = new Produto("Carregador", "Carregador de celular caro", "Uni7", "Jobs", 1000.00f);
    
    Pack packDeCelular = new Pack("Pack de celulares", "Pack de celulares caros", "Uni7", "Steven", 50000f, 5);
    Carrinho c = new Carrinho(9);
    Carrinho c1 = new Carrinho(19);
    Carrinho carrinho1 = new Carrinho(3);
    System.out.println(carrinho1.adicionarProduto(celular));
    System.out.println(carrinho1.adicionarProduto(carregador));
    //System.out.println(carrinho1.adicionarPack(packDeCelular));
    System.out.println(carrinho1.adicionarProduto(celular));
    carrinho1.imprimirCarrinho();
    System.out.println(carrinho1.removerProduto(celular));
    carrinho1.imprimirCarrinho();
    System.out.println(carrinho1.limparCarrinho());
    carrinho1.imprimirCarrinho();
      System.out.println(carrinho1.adicionarProduto(packDeCelular));
    carrinho1.imprimirCarrinho();
  }
}