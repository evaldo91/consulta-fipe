package br.com.evaldo91.tabelaFipe.menu;

public class MenuTipo {
    public String selecionarTipo(Integer opcao){
        var tipo = "";

            switch (opcao){
                case 1:
                    tipo = "carros";
                    break;
                case 2:
                    tipo = "motos";
                    break;
                case 3:
                    tipo = "caminhoes";
                    break;
                default:
                    System.out.println("Tipo invalido");
            }
            return tipo;


    }
}
