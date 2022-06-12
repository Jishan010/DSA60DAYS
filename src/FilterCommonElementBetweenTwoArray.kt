data class Element(val id: String, val name: String)


var list1 = mutableListOf<String>("first", "second", "third")
var list2 = mutableListOf<Element>()
// Hello World Program

fun main(args: Array<String>) {
    list2.add(Element(id = "first", name = "Eva"))
    list2.add(Element(id = "second", name = "John"))
    list2.add(Element(id = "fourth", name = "Don"))
    println(deleteRepeated(list1, list2))
}

fun deleteRepeated(
    list1: List<String>,
    list2: List<Element>
): List<Element> {
    return list2.filter {
        isTheSameID(it, list1)
    }
}

private fun isTheSameID(element: Element, list1: List<String>): Boolean {
    list1.forEach {
        if (element.id == it) {
            return true
        }
    }
    return false
}

