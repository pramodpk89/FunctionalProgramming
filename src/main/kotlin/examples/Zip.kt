package examples

fun main(){
    val players:List<String> = listOf("Messi","Ronaldo","Zlatan","Baichung")
    val nations:List<String> = listOf("Argentina","Portugal","Sweden","India")
    println(players zip nations)

    val players1:Set<String> = setOf("Messi","Ronaldo","Zlatan","Baichung")
    val nations1:Set<String> = setOf("Argentina","Portugal","Sweden","India")
    println(players1 zip nations1)


}