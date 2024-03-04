import java.util.ArrayList;

public class ListaVenda {

    ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();

    ListaVenda (ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public float valorTotalVenda(){
        float valorTotal = 0;
        for(int i = 0; i < itens.size(); i++ ){
            valorTotal +=  itens.get(i).valorTotalItem();
        }
        return valorTotal;
    }

    public void CriarItemVenda(String nome, double preco, int qtd){
        ItemVenda newItemVenda = new ItemVenda(new Produto(nome, preco), qtd);
        itens.add(newItemVenda);
    }

}
