fun foo() = when (1) {
    1 -> <!UNRESOLVED_REFERENCE!>print<!>(1)
    2 -> <!UNRESOLVED_REFERENCE!>print<!>(2)
    else -> <!UNRESOLVED_REFERENCE!>print<!>(0)
}
