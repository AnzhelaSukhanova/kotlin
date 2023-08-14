fun foo(x: Int): Int? = when (val x = readlnOrNull()) {
    null -> null
    else -> x.toInt()
}