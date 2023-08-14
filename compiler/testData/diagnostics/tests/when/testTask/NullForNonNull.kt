fun foo(x: Int): Boolean = when (x) {
    0 -> false
    1 -> true
    else -><!NULL_FOR_NONNULL_TYPE!>null<!>
}
