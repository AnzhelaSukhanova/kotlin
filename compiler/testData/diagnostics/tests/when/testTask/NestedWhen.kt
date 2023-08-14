// FIR_IDENTICAL
fun foo(x: Int) {
    when (x) {
        Int.MIN_VALUE -> {}
        else -> foo(x - 1)
    }
}
