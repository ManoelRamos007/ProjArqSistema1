import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto samsung = new Produto("Samsung", 200);
        Produto apple = new Produto("Apple", 300);
        Produto lg = new Produto("Lg", 150);

        ItemVenda samsungOrder = new ItemVenda(samsung, 2);
        ItemVenda appleOrder = new ItemVenda(apple, 3);
        ItemVenda lgOrder = new ItemVenda(lg, 4);

        ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();

        itens.add(samsungOrder);
        itens.add(appleOrder);
        itens.add(lgOrder);

        ListaVenda orderList = new ListaVenda(itens);

        orderList.CriarItemVenda("Samsung", 200, 2);
        orderList.CriarItemVenda("Apple", 300, 3);
        orderList.CriarItemVenda("Lg", 150, 4);

        System.out.println("Valor total da venda = R$" + orderList.valorTotalVenda());

    }
}