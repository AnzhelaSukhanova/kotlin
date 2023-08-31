fun foo(x: Boolean) = when (x) {
    false -> {}
    true -> {}
    <!INCOMPATIBLE_TYPES!>2<!> -> {}
}
