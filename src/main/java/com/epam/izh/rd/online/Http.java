package com.epam.izh.rd.online;

import com.epam.izh.rd.online.entity.Pokemon;
import com.epam.izh.rd.online.service.PokemonFetchingServices;
import com.epam.izh.rd.online.service.PokemonFigthingClub;

public class Http {

    public static void main(String[] args) {
        PokemonFetchingServices pokemonFetchingServices = new PokemonFetchingServices();
        Pokemon pikachu = pokemonFetchingServices.fetchByName("pikachu");
        Pokemon slowpoke = pokemonFetchingServices.fetchByName("slowpoke");
        System.out.println(new PokemonFigthingClub().doBattle(slowpoke,pikachu).getPokemonName() + " win!");
    }
}
