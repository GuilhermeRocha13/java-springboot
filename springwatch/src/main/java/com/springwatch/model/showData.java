package com.springwatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record showData(@JsonAlias("Title") String titulo,
                       @JsonAlias("totalSeasons") Integer totalTemporadas,
                       @JsonAlias("imdbRating") String avaliacao) {

}
