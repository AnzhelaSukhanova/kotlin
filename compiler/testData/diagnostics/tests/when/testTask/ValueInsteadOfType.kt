fun foo(x: Number) = when (x) {
    is Double -> {}
    is <!SYNTAX!>0<!> -> {}
    else -> {}
}
