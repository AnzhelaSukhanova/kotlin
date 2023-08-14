fun foo(x: Boolean) = <!NO_ELSE_IN_WHEN!>when<!> {
    x -> 1
    !x -> 0
}
