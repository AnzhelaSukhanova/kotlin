// FIR_IDENTICAL
fun foo(x: Boolean): (Int) -> Int = {
    it -> when(x) { false -> 0 true -> it }
}
