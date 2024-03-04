public class ItemVenda {
    Produto produto;
    double quantidade;

    ItemVenda(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double valorTotalItem(){
        double total = (double)  (produto.preco * quantidade);
        return total;
    }

}
