fun foo() = <!NO_ELSE_IN_WHEN!>when<!> (val x = null) {
    null -> <!UNRESOLVED_REFERENCE!>print<!>("Null is null.")
}
