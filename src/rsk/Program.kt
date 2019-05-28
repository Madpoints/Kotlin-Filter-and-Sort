package rsk

fun main(args: Array<String>) : Unit {
    val ints = listOf(1,2,3,4,5)

    val smallInts = ints.filter { it < 4 }

//    for (i: Int in smallInts) println(i)

    val squaredInts = ints.map { it*it }

//    for (i: Int in squaredInts) println(i)

    val smallSquaredInts = ints.
                            filter { it < 5 }.
                            map { it*it }

//    for (i: Int in smallSquaredInts) println(i)

    val meetings = listOf(Meeting(1, "Board Meeting"),
                            Meeting(2, "Sales Meeting"))

    val titles = meetings
        .filter {it -> it.title.startsWith("S")}
        .map { m-> m.title }

    for (t in titles) println(t)
}

class Meeting(val id: Int, val title: String) {

}