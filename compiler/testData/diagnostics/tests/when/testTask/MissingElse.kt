fun foo(x: Int): Boolean = <!NO_ELSE_IN_WHEN!>when<!> (x) {
    0 -> false
    1 -> true
}
