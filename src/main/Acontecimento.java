package main;

public class Acontecimento {
 private String descricao;
 private String data;
 private FaseDaVida fase;

 public Acontecimento(String descricao, String data, FaseDaVida fase) {
     this.descricao = descricao;
     this.data = data;
     this.fase = fase;
 }

public String getDescricao() {
     return descricao;
 }

 public String getData() {
     return data;
 }

 public FaseDaVida getFase() {
     return fase;
 }

 @Override
 public String toString() {
     return "[" + data + "] " + descricao;
 }
}
