public class Carrinho {
  Produto[] produtos;
  static int qtd_carrinhos = 0;
  static final int quantidadeMaximaDeProdutos = 10;
  Carrinho(int capacidade){
    if(quantidadeMaximaDeProdutos < capacidade){
      System.out.println("Falha ao criar carrinho, a capacidade máxima do carrinho é " + quantidadeMaximaDeProdutos);
      throw new Error();
    }
    produtos = new Produto[capacidade];  
    qtd_carrinhos++;
  }

  String adicionarProduto(Produto produto){
    int tamanho = 0;
    for(int i = 0; i < produtos.length; i++){
      if(produtos[i] != null){
        tamanho += 1;
      }
    }
    if(produtos.length == tamanho){
      return "Falha ao inserir o produto " + produto.nome + ", carrinho cheio!";
    }else{
      produtos[tamanho] = produto;
      return produto.nome + " adicionado ao carrinho!";
    }
  }
  
  String removerProduto(Produto produto){
    for(int i = produtos.length-1; i >= 0; i--){
      if(produtos[i] == produto){
        int diferenca = produtos.length - i-1;
        int j = 0;
        while(j < diferenca){
          produtos[i] = produtos[i+1];
          j++;
          i++;
        }
        produtos[i] = null;
        return produto.nome + " removido do carrinho!";
      }
    }
    return "Falha ao remover " + produto.nome;
  }

  String limparCarrinho(){
    int i = produtos.length - 1;
    while(produtos[0] != null){
      produtos[i] = null;
      i--;
    }
    return "Carrinho limpo!";
  }
  
  float calcularPrecoTotal(){
    float total = 0f;
    for(int i = 0; i < produtos.length; i++){
      if(produtos[i] != null){
        total += produtos[i].preco;
      }
    }
    return total;
  }

  void imprimirCarrinho(){
    System.out.println("Carrinho:");
    if(produtos.length == 0){
      System.out.println("Carrinho vazio");
    }else{
      for(int i = 0; i < produtos.length; i++){
        if(produtos[i] != null){
          System.out.println(" " + produtos[i].nome);
        }
      }
      System.out.println("Total: " + calcularPrecoTotal());
      System.out.println("Total de carrinhos: " + qtd_carrinhos);
      }
  }
}