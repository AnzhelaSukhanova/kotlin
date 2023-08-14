fun foo(x: Boolean, y: Boolean, z: Boolean) {
    when {
        x -> <!UNRESOLVED_REFERENCE!>print<!>(0)
        !y -> <!UNRESOLVED_REFERENCE!>print<!>(1)
        y && z -> <!UNRESOLVED_REFERENCE!>print<!>(2)
    }
}
