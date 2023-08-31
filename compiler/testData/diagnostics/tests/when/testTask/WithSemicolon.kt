// FIR_IDENTICAL
fun foo(x: Int) = when (x) {
    0 -> {}; 1 -> {}; else -> { when (x) { 2 -> {}; 3 -> {}; else -> {}; }; }
}
