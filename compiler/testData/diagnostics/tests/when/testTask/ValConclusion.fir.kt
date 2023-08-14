fun foo(x: Int) {
    when (x) {
        in 0..9 -> val y = x
        else -> {}
    }
}