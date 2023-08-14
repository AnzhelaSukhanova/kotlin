fun foo(x: Int) = <!NO_ELSE_IN_WHEN!>when<!>(x) {
    <!USELESS_IS_CHECK!>is Any<!> -><!UNRESOLVED_REFERENCE!>print<!>(x)
}
