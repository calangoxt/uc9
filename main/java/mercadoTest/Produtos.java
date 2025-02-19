/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoTest;

/**
 *
 * @author MIGUELDONATODEMIRAND
 */

public class Produtos {
   String nome;
   int Quant;
   public Produtos(String Nome, int q){
       this.nome=Nome;
       this.Quant=q;
       }
   public String getNome(){
       return this.nome;
   }
   public int addq(int q){
       return this.Quant+=q;
   }
   public int delete(int q){
       return this.Quant-=q;
   }
     public int getq(){
       return this.Quant;
   }
 
}
    