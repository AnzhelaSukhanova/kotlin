fun foo(x: Int) = when (x) {
    0 -> <!TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM_ERROR!><!DEBUG_INFO_MISSING_UNRESOLVED!>foo<!>(0)<!>
    else -> {}
}
