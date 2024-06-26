package com.gabriel.mychallengelist.data

import androidx.annotation.DrawableRes
import com.gabriel.mychallengelist.R

data class Person(
    @DrawableRes val image: Int,
    val name: String,
    val telephone: String
)

val contacts = listOf(
    Person(
        image = R.drawable.rita_alves,
        name = "Rita Alves",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.pedro_lucio,
        name = "Pedro Lucio",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.lucia_santos,
        name = "Lucia Santos",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.robert_alves,
        name = "Roberto Alves",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.maria_alves,
        name = "Maria Alves",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.alexandre_borges,
        name = "Alex Borges",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.antonia_maria,
        name = "Antonia Maria",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.franscico_antonio,
        name = "Francisco Silva",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.gabriela_souza,
        name = "Gabriela Souza",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.joao_medeiros,
        name = "João Medeiros",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.natalia_moraes,
        name = "Natalia Moraes",
        telephone = "(55)1112345678"
    ),
    Person(
        image = R.drawable.mateus_henrique,
        name = "Mateus Henrique",
        telephone = "(55)1112345678"
    ),
)
