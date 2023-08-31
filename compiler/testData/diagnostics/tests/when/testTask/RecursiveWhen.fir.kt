fun foo(x: Int) = when (x) {
    0 -> foo(0)
    else -> {}
}