package com.soulinc.cabo.model

data class TrumpCard(
    val name: String,
    val imageUrl: String,
    val type: TrumpCardType,
    val numericValue: Int,
    val isPowerCard: Boolean
)

enum class TrumpCardType(val type: String) {
    DIAMONDS("diamond"), CLUBS("club"), HEARTS("heart"), SPADES("spade")
}
