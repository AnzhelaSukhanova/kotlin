fun foo(x: Boolean) = when (x) {
    false -> {}
    <!INCOMPATIBLE_TYPES!>1<!> -> {}
    else -> {}
}
