fun foo(x: Boolean): Int = when (x) {
    false -> 0
    true -> 1
    true -> 2
}