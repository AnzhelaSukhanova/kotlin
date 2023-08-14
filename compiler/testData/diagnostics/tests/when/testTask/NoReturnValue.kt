fun foo(x: Boolean): Int = when (x) {
    false -><!UNRESOLVED_REFERENCE!>print<!>(0)
    true -><!UNRESOLVED_REFERENCE!>print<!>(1)
}
