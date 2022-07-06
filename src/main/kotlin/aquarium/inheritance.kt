package aquarium

interface AquariumAction{
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim(){
        println("swim")
    }
}

 interface FishAction2{
     fun eat()
 }

abstract class AquariumFish2: FishAction2{
    abstract val color: String
    override fun eat() = println("yum")
}