package br.com.evaldo91.tabelaFipe.services;


import java.util.List;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);

    <T> List<T> obterlista(String json, Class<T> classe);

}
