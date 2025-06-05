package net.javaguides;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private String cliente;
    private LocalDate dataPedido;
    private List<Item> itens;
    private boolean finalizado;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.dataPedido = LocalDate.now();
        this.itens = new ArrayList<>();
        this.finalizado = false;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        if (finalizado) throw new IllegalStateException("Pedido já finalizado");
        itens.add(new Item(nome, preco, quantidade));
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(i -> i.preco * i.quantidade).sum();
    }

    public int totalDeItens() {
        return itens.stream().mapToInt(i -> i.quantidade).sum();
    }

    public void finalizarPedido() {
        if (itens.isEmpty()) throw new IllegalStateException("Pedido sem itens");
        finalizado = true;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void cancelarPedido() {
        if (finalizado) throw new IllegalStateException("Pedido já finalizado");
        itens.clear();
    }

    // Classe interna para representar um item do pedido
    private static class Item {
        String nome;
        double preco;
        int quantidade;

        Item(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    }

    // Getters
    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public LocalDate getDataPedido() { return dataPedido; }
    public List<Item> getItens() { return itens; }

}
