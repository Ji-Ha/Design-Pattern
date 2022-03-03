package strategy

fun main() {
    val swordBehavior = SwordBehavior()
    val bowBehavior = BowAndArrowBehavior()
    val swordKing = King(swordBehavior)
    val bowKing = King(bowBehavior)

    swordKing.fight()
    bowKing.fight()
}