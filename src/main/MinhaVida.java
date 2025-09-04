package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinhaVida {

 public String nomeCompleto;
 public String dataNascimento;
 private List<Acontecimento> linhaDoTempo;
 private List<String> sonhosEMetas; 
 private String gostosDaInfancia;
 private String gostosDaAdolescencia;
 private String gostosAtuais;

 public MinhaVida() {
     this.linhaDoTempo = new ArrayList<>();
     this.sonhosEMetas = new ArrayList<>();
     carregarDadosPessoais();
     carregarLinhaDoTempo();
     carregarSonhosEMetas();
     carregarGostos();
 }
 
 public void carregarDadosPessoais() {
     this.nomeCompleto = "Cairo Lima Lopes";
     this.dataNascimento = "30/04/2003";
 }
 
 private void carregarLinhaDoTempo() {
     
     linhaDoTempo.add(new Acontecimento("Eu nasci em Canoas!", "2003", FaseDaVida.NASCIMENTO));
     linhaDoTempo.add(new Acontecimento("Comecei a frequntar a igreja", "2003", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Comecei a falar e andar", "2004", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Comecei a frequntar uma casa-creche", "2007", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Fui no cinema pela primeira vez", "2008", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Quebrei meu dente pulando de um cômodo para outro em casa", "2008", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Visitar o restante da familia em Candelária.", "2008", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Entrei para e escola", "2009", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Nos mudamos para Candelária", "2010", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Minha irmã Nasceu", "2010", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Entrei para escolinha de futsal", "2011", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Minha tia morreu e as duas filhas vieram morar com a gente", "2011", FaseDaVida.INFANCIA));
     linhaDoTempo.add(new Acontecimento("Comecei a praticar Capoeira", "2014", FaseDaVida.INFANCIA));
     
     
     linhaDoTempo.add(new Acontecimento("Meu cachorro que estava com a gente desde Canoas morreu", "2016", FaseDaVida.ADOLESCENCIA));
     linhaDoTempo.add(new Acontecimento("Me afastei um pouco do futebol para trabalhar", "2017", FaseDaVida.ADOLESCENCIA));
     linhaDoTempo.add(new Acontecimento("Campeão da OESC", "2017", FaseDaVida.ADOLESCENCIA));
     linhaDoTempo.add(new Acontecimento("Fui para a praia pela primeira vez", "2018", FaseDaVida.ADOLESCENCIA));
     linhaDoTempo.add(new Acontecimento("Terminei o ensino fundamental", "2018", FaseDaVida.ADOLESCENCIA));
     linhaDoTempo.add(new Acontecimento("Pandemia", "2019", FaseDaVida.ADOLESCENCIA));
     linhaDoTempo.add(new Acontecimento("Quando peguei gosto real por tecnologia", "2019", FaseDaVida.ADOLESCENCIA));
     linhaDoTempo.add(new Acontecimento("Terminei o ensino médio", "2021", FaseDaVida.ADOLESCENCIA));
     
     
     linhaDoTempo.add(new Acontecimento("Entrei para faculdade", "2022", FaseDaVida.VIDA_ATUAL));
     linhaDoTempo.add(new Acontecimento("Me mudei para o Recanto Maestro", "2022", FaseDaVida.VIDA_ATUAL));
     linhaDoTempo.add(new Acontecimento("Comecei a trabalhar no Recanto Maestro", "2022", FaseDaVida.VIDA_ATUAL));
     linhaDoTempo.add(new Acontecimento("Bolsa ProUni", "2022", FaseDaVida.VIDA_ATUAL));
     linhaDoTempo.add(new Acontecimento("Viagem para BH, primeira vez voando de avião", "2024", FaseDaVida.VIDA_ATUAL));
     linhaDoTempo.add(new Acontecimento("Participei de projetos", "2022 - 2024 - 2025", FaseDaVida.VIDA_ATUAL));
     linhaDoTempo.add(new Acontecimento("Começando o próprio negócio", "2025", FaseDaVida.VIDA_ATUAL));
     
 }
 
 private void carregarSonhosEMetas() {
     sonhosEMetas.add("Queria ser jogador de futebol");
     sonhosEMetas.add("Queria ser youtuber");
     sonhosEMetas.add("Queria ser jogador de futebol");
     sonhosEMetas.add("Viajar pelo mundo");
     sonhosEMetas.add("Ter o próprio negócio");
     sonhosEMetas.add("Não ficar preso a nada");
 }

 private void carregarGostos() {
     this.gostosDaInfancia = "Gostava de jogar futebol, brincar que tinha super poderes, correr por aí, jogar video games, andar de bicicleta " + 
            "viajar, desenhos animados, blocos de montar. Minha comida favorita era macarrão com carne moída";

     this.gostosDaAdolescencia = "Gostava de praticar todo tipo de esporte, jogar video games, viajar, séries, filmes e animes " + 
            "Minha comida favorita era frango a milanesa";
     
     this.gostosAtuais = "Gosto de particar todo tipo de esporte, jogar video game, viajar, series e filmes, gosto de fazer nada também " + 
    		 			"Estudar coisas inovadoras" +
                        "Minha comida favorita é frango a milanesa";

 }
 
 public String getLinhaDoTempoCompletaAsString() {
     StringBuilder sb = new StringBuilder();
     sb.append("===== MINHA LINHA DO TEMPO COMPLETA =====\n");
     sb.append("Nome: ").append(this.nomeCompleto).append("\n");
     sb.append("----------------------------------------\n");
     
     this.linhaDoTempo.stream()
         .sorted((a1, a2) -> a1.getData().compareTo(a2.getData()))
         .forEach(evento -> sb.append(evento.toString()).append("\n"));
     
     return sb.toString();
 }

 public String getDetalhesDaFaseAsString(FaseDaVida fase) {
     StringBuilder sb = new StringBuilder();
     String titulo = "===== DETALHES DA " + fase.toString() + " =====";
     sb.append(titulo).append("\n\n");

     sb.append("Acontecimentos Marcantes:\n");
     this.linhaDoTempo.stream()
         .filter(e -> e.getFase() == fase)
         .forEach(e -> sb.append("  - ").append(e.toString()).append("\n"));

     sb.append("\nO que eu mais gostava/gosto de fazer:\n");
     if (fase == FaseDaVida.INFANCIA) {
         sb.append("  ").append(this.gostosDaInfancia).append("\n");
     } else if (fase == FaseDaVida.ADOLESCENCIA) {
         sb.append("  ").append(this.gostosDaAdolescencia).append("\n");
     } else if (fase == FaseDaVida.VIDA_ATUAL) {
         sb.append("  ").append(this.gostosAtuais).append("\n");
     }
     
     return sb.toString();
 }
 
 public String getSonhosEMetasAsString() {
     StringBuilder sb = new StringBuilder();
     sb.append("===== SONHOS E METAS =====\n");
     for (String sonho : this.sonhosEMetas) {
         sb.append("  - ").append(sonho).append("\n");
     }
     return sb.toString();
 }

 public void exibirLinhaDoTempoCompleta() {
     System.out.println(getLinhaDoTempoCompletaAsString());
 }

 public void exibirDetalhesDaFase(FaseDaVida fase) {
     System.out.println(getDetalhesDaFaseAsString(fase));
 }

 public void exibirSonhosEMetas() {
     System.out.println(getSonhosEMetasAsString());
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     MinhaVida minhaVida = new MinhaVida(); 
     int opcao = 0;

     System.out.println(">>> BEM-VINDO(A) À LINHA DO TEMPO DA VIDA DE " + minhaVida.nomeCompleto.toUpperCase() + " <<<");

     while (opcao != 6) { 
         System.out.println("\n--- MENU DE OPÇÕES ---");
         System.out.println("1. Ver linha do tempo completa");
         System.out.println("2. Ver detalhes da Infância");
         System.out.println("3. Ver detalhes da Adolescência");
         System.out.println("4. Ver detalhes da Vida Atual"); 
         System.out.println("5. Ver meus Sonhos e Metas (Projeto de Natureza)");
         System.out.println("6. Sair");
         System.out.print("Escolha uma opção: ");

         try {
             opcao = scanner.nextInt();

             switch (opcao) {
                 case 1:
                     minhaVida.exibirLinhaDoTempoCompleta();
                     break;
                 case 2:
                     minhaVida.exibirDetalhesDaFase(FaseDaVida.INFANCIA);
                     break;
                 case 3:
                     minhaVida.exibirDetalhesDaFase(FaseDaVida.ADOLESCENCIA);
                     break;
                 case 4: 
                     minhaVida.exibirDetalhesDaFase(FaseDaVida.VIDA_ATUAL);
                     break;
                 case 5: 
                     minhaVida.exibirSonhosEMetas();
                     break;
                 case 6:
                     System.out.println("Encerrando a jornada... Até mais!");
                     break;
                 default:
                     System.out.println("Opção inválida! Tente novamente.");
             }
         } catch (Exception e) {
             System.out.println("Entrada inválida! Por favor, digite um número.");
             scanner.next(); 
         }
     }
     scanner.close();
 }
}