fun main(args: Array<String>) {

    var healthPoints = 60
    var isBlessed = true
    var name = "Arua"
    var isImmortal = false

    if ( isBlessed && healthPoints > 60 ||  isImmortal) {}
    val auraVisible = isBlessed && healthPoints > 60 ||  isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    val healthStatus: String = when (healthPoints) {
        100 -> "excellent "
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition"
    }

    println("(Aura: $auraColor) "
            + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")


    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()

    var KarmaValue = 3
    when(KarmaValue) {
        in 0..5 -> {
            println("red ")
        }
        in 6..10 -> {
            println("orange")
        }
        in 11..15  -> {
            println("Purple")
        }
        in 16..20 -> {
            println("Green ")
        }

        else -> {
            print("visible")
        }
    }

}
