package br.com.evaldo91.tabelaFipe.Marcas;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MarcasDetalhadas(
        @JsonAlias("codigo") String codigo,
        @JsonAlias("nome") String nome
) {
}
