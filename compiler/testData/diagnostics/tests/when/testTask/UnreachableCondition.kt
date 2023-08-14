fun foo(x: Boolean): Int = when (x) {
    false -> 0
    true -> 1
    <!DUPLICATE_LABEL_IN_WHEN!>true<!> -> 2
}
