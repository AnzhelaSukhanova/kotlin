// FIR_IDENTICAL
fun foo(x: Int): Int = when {
    x > 0 -> if (x < 10) x else 0
    else -> 0
}
