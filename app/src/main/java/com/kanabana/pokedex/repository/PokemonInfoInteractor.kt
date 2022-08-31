package com.kanabana.pokedex.repository

import com.kanabana.pokedex.model.PokemonInfo

interface PokemonInfoInteractor {
    suspend fun getPokemonInfo(): List<PokemonInfo>
}
