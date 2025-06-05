package net.javaguides;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1, "Ícaro");

        pedido.adicionarItem("Hambúrguer", 25.0, 1);
        pedido.adicionarItem("Refrigerante", 5.0, 1);

        System.out.println("Total de itens: " + pedido.totalDeItens());
        System.out.println("Valor total: R$" + pedido.calcularTotal());

        pedido.finalizarPedido();
        System.out.println("Pedido finalizado? " + pedido.isFinalizado());

        //pedido.adicionarItem("Batata Frita", 3.0, 1); // Isso vai lançar exceção, pois o pedido já foi finalizado.




    }
}