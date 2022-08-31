package com.kanabana.pokedex.repository

import com.kanabana.pokedex.model.PokemonInfo

open class PokemonInfoRepository(
    private val localInteractor: PokemonInfoInteractor,
    private val remoteInteractor: PokemonInfoInteractor
) {
    // fun getPokemonInfo(): List<PokemonInfo>
}
