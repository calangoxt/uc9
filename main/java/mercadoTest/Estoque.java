/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoTest;

/**
 *
 * @author MIGUELDONATODEMIRAND
 */
import java.util.ArrayList;

public class Estoque {

    ArrayList<Produtos> pp = new ArrayList<>();

    public void adicionarProduto(String Nome, int quantidade) {
        for (Produtos prod : pp) {
            if (prod.getNome().equals(Nome)) {
                System.out.println("o produto ja existe. Adicionado " + quantidade + " ao estoque");
                prod.addq(quantidade);
                return;
            }
        }
        pp.add(new Produtos(Nome, quantidade));
        System.out.println("novo produto adicionado " + Nome + " com quantidade " + quantidade);
    }

    public void removerProduto(String Nome, int quantidade) {
        for (Produtos prod : pp) {
            if (prod.getNome().equals(Nome)) {
                if (prod.Quant >= quantidade) {
                    System.out.println(Nome + " removido " + quantidade + " ao estoque");
                    prod.delete(quantidade);
                    return;
                }
            }
            System.out.println("quantidade insuficiente");
        }
    }

    public void consultarQuantidade(String Nome) {
        for (Produtos prod : pp) {
            if (prod.getNome().equals(Nome)) {
                System.out.println("tem " + Nome + ":" + prod.getq());
                return;
            }

            System.out.println("produto nao encontrado");
        }
    }

    public void produtoMaisEstocado() {
        int M = pp.get(0).Quant;
        String Ms = pp.get(0).nome;
        for (int i = 1; i < pp.size(); i++) {
            if (M < pp.get(i).Quant) {
                M = pp.get(i).Quant;
                Ms = pp.get(i).nome;
            }
        }

        System.out.println(Ms + M);
    }

    public void limparEstoque() {
        pp.clear();
    }

    public boolean tem(String Nome) {
        for (int i = 0; i < pp.size(); i++) {
            if (Nome.equals(pp.get(i).nome)) {

            }
        }
        return false;
    }
}
