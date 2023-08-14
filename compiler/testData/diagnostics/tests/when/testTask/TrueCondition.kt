fun foo() = when {
    true -> <!UNRESOLVED_REFERENCE!>print<!>(0)
    else -> {}
}
