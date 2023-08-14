fun foo(x: Boolean) {
    <!NO_ELSE_IN_WHEN!>when<!> (x) {
        <!CONFUSING_BRANCH_CONDITION_ERROR!>false || true<!> -> {}
    }
}
