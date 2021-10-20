fun main(args:Array<String>) {
    var isAura ="green"
    val PlyerHealthMadigal=89
    val plyerkarma = (Math.pow(Math.random(), (100 - PlyerHealthMadigal) / 100.0) * 20 ).toInt()
    println("the player color is :$isAura")
    when(PlyerHealthMadigal) {
        in 0..5 -> isAura = "red"
        in 6..10 -> isAura = "orange"
        in 11..15  -> isAura ="purple"
        in 16..20 -> isAura = "green"
        }

            println("Aur Now is :$isAura")
            println("visible")
        }

