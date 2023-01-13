package com.example.gamestore.data

import com.example.gamestore.R
import com.example.gamestore.data.model.Category
import com.example.gamestore.data.model.Game

class Datasource {

    fun getGames(): List<Category> {
        return listOf(
            Category(
                "Strategy",
                listOf(
                    Game(
                        "Age of Empires",
                        R.drawable.strategy1,
                        4.7
                    ),
                    Game(
                        "Age of Empires II",
                        R.drawable.strategy2,
                        4.9
                    ),
                    Game(
                        "Poseidon",
                        R.drawable.strategy3,
                        3.5
                    )
                )
            ),
            Category(
                    "RPG",
                    listOf(
                        Game(
                            "Elden Ring",
                            R.drawable.rpg1,
                            4.4
                        ),
                        Game(
                            "The Witcher 3",
                            R.drawable.rpg2,
                            5.0
                        ),
                        Game(
                            "Cyberpunk 2077",
                            R.drawable.rpg3,
                            3.2
                        )
                    )
                ),
            Category(
                    "Indie",
                    listOf(
                        Game(
                            "Deep Rock Galactic",
                            R.drawable.ind1,
                            4.2
                        ),
                        Game(
                            "Valheim",
                            R.drawable.ind2,
                            4.6
                        ),
                        Game(
                            "Darkest Dungeon",
                            R.drawable.ind3,
                            4.1
                        )
                    )
                )
            )
    }
}