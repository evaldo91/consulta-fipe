package br.com.evaldo91.tabelaFipe.menu;

import br.com.evaldo91.tabelaFipe.Marcas.MarcasDetalhadas;
import br.com.evaldo91.tabelaFipe.services.ApiService;
import br.com.evaldo91.tabelaFipe.services.ConverteDados;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner = new Scanner(System.in);
    MenuTipo tipo = new MenuTipo();
    ExibirMenus exibe = new ExibirMenus();
    private String api = "https://parallelum.com.br/fipe/api/v1/";
    private ApiService apiService = new ApiService();
    private ConverteDados conversor = new ConverteDados();








    public void menuTipo(){

        var opcao = -1;
        exibe.exibirTipos();
        while(opcao !=0){

            opcao = scanner.nextInt();
            scanner.nextLine();
            var tiposelcionado = tipo.selecionarTipo(opcao);
            api = api + tiposelcionado +"/marcas";


            var json = apiService.obterDados(api);
            List<MarcasDetalhadas> listaDeMarcas = conversor.obterlista(json, MarcasDetalhadas.class);

            listaDeMarcas.stream().
                    sorted(Comparator.comparing(MarcasDetalhadas::nome))
                    .forEach(this::mostraMarca);














        }



    }
    public void mostraMarca(MarcasDetalhadas dados){
        var detalhamento = "Codigo: " + dados.codigo() + " - Nome: " + dados.nome();

        System.out.println(detalhamento);

    }






}
