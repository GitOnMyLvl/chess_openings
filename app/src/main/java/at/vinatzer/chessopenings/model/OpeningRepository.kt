package at.vinatzer.chessopenings.model

import at.vinatzer.chessopenings.R

object OpeningRepository {
    val openings = listOf(
        Opening(
            name = R.string.alekhine,
            notation = R.string.alekhine_notation,
            image = R.drawable.alekhines_defense
        ),
        Opening(
            name = R.string.benko,
            notation = R.string.benko_notation,
            image = R.drawable.benko_gambit
        ),
        Opening(
            name = R.string.bird,
            notation = R.string.bird_notation,
            image = R.drawable.birds_opening
        ),
        Opening(
            name = R.string.benoni,
            notation = R.string.benoni_notation,
            image = R.drawable.benoni_defense_modern_variation
        ),
        Opening(
            name = R.string.bogo,
            notation = R.string.bogo_notation,
            image = R.drawable.bogo_indian_defense
        ),
        Opening(
            name = R.string.caro,
            notation = R.string.caro_notation,
            image = R.drawable.caro_kann_defense
        ),
        Opening(
            name = R.string.catalan,
            notation = R.string.catalan_notation,
            image = R.drawable.catalan_opening
        ),
        Opening(
            name = R.string.dutch,
            notation = R.string.dutch_notation,
            image = R.drawable.dutch_defense
        ),
        Opening(
            name = R.string.english,
            notation = R.string.english_notation,
            image = R.drawable.english_opening
        ),
        Opening(
            name = R.string.french,
            notation = R.string.french_notation,
            image = R.drawable.french_defense
        ),
        Opening(
            name = R.string.grob,
            notation = R.string.grob_notation,
            image = R.drawable.grob_opening
        ),
        Opening(
            name = R.string.gruenfeld,
            notation = R.string.gruenfeld_notation,
            image = R.drawable.gruenfeld_defense
        ),
        Opening(
            name = R.string.nimzo,
            notation = R.string.nimzo_notation,
            image = R.drawable.nimzo_indian_defense
        ),
        Opening(
            name = R.string.nimkowitsch,
            notation = R.string.nimkowitsch_notation,
            image = R.drawable.nimzowitsch_larsen_attack
        ),
        Opening(
            name = R.string.pirce,
            notation = R.string.pirce_notation,
            image = R.drawable.pirc_defense
        ),
        Opening(
            name = R.string.polish,
            notation = R.string.polish_notation,
            image = R.drawable.polish_opening
        ),
        Opening(
            name = R.string.queens_gambit,
            notation = R.string.queens_gambit_notation,
            image = R.drawable.queens_gambit
        ),
        Opening(
            name = R.string.queens_indian,
            notation = R.string.queens_indian_notation,
            image = R.drawable.queens_indian_defense
        ),
        Opening(
            name = R.string.reti,
            notation = R.string.reti_notation,
            image = R.drawable.reti_opening
        ),
        Opening(
            name = R.string.ruy_lopez,
            notation = R.string.ruy_lopez_notation,
            image = R.drawable.ruy_lopez_opening
        ),
        Opening(
            name = R.string.scandinavian,
            notation = R.string.scandinavian_notation,
            image = R.drawable.scandinavian_defense
        ),
        Opening(
            name = R.string.scotch,
            notation = R.string.scotch_notation,
            image = R.drawable.scotch_game
        ),
        Opening(
            name = R.string.sicilian,
            notation = R.string.sicilian_notation,
            image = R.drawable.sicilian_defense
        ),
        Opening(
            name = R.string.slav,
            notation = R.string.slav_notation,
            image = R.drawable.slav_defense
        ),
        Opening(
            name = R.string.tropowsky,
            notation = R.string.tropowsky_notation,
            image = R.drawable.trompowsky_attack
        ),
        Opening(
            name = R.string.vienna,
            notation = R.string.vienna_notation,
            image = R.drawable.vienna_game
        ),
    )
}