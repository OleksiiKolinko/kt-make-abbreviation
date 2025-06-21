package mate.academy

fun makeAbbr(source: String) : String {
    val split = source.split(" ")
    val string: String = split.joinToString("") { word -> word[0].toString().uppercase() }
    return string
}
