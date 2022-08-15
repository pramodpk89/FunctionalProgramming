package examples

fun main(){
    //Map applies a transformation on a collection using a functiona which results in another collection
    val numbers:List<Int> = listOf(1,2,33,44,55,66,77,88,99,100)
    println(numbers.map { it*2 })
    println(numbers.mapIndexed{idx,value->idx*value})


    //Transformations applied on keys of a map affects only keys and vice versa
    val topCenturians:Map<String,Int> = mapOf("Tendulkar" to 101,"Ponting" to 71,"Kohli" to 70,"Sangakkara" to 63,"Kallis" to 62,"Amla" to 55)

    println(topCenturians.mapKeys { it.key.uppercase() })
    println(topCenturians.mapValues { it.value.toDouble() })
}