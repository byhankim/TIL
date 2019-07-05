const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>){
//    var experiencePoints: Int = "thirty-two"
    val playerName = "Estragon"
    var experiencePoints = 5
    experiencePoints += 3
    var hasSteed = false

    // challenge 2.2
    var innName = "Unicorn's Horn"
    var innkeeper = "Unicorn's Horn Innkeeper"
    var playerGold = 50

//    var liquorMenu: Map<String, Double>
    var liquorMenu = mutableMapOf("Honey Beer" to 3, "Wine" to 2, "Lacroix" to 5)

    // challenge 2.3
    println("reversed name: " + playerName.reversed())

    println("Player: " + playerName + ", Exp: " + experiencePoints + ", Gold: " + playerGold)
    println("Steed: " + hasSteed + ", innName: " + innName + ", innkeper: " + innkeeper)

}