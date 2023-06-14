package aplicacao;

import model.Pizza;

public class App {
    public static void main(String[] args) {
        Pizza p = new Pizza("Frango", 30, 'p');

        System.out.println("Pedido criado!!!");
        System.out.println(p.pedidoIfood());

        Pizza p2 = new Pizza("Camarão", 40, 'm');

        System.out.println("Pedido criado!!!");
        System.out.println(p2.pedidoIfood());

    }
}
