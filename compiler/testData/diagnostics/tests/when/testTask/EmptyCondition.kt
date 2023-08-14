fun foo(x: Int): Boolean = when (x) {
    <!SYNTAX!><!>-> false
    else -> true
}
