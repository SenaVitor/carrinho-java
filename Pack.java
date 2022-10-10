class Pack extends Produto{
  int quantidade;
  Pack(String nome, String descricao, String fabricante, String vendedor, float preco, int quantidade){
    super(nome, descricao, fabricante, vendedor, preco);
    this.quantidade = quantidade;
  }
}