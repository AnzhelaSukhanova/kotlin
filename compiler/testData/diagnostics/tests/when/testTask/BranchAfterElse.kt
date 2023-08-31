fun foo(x: Boolean) = when (x) {
    false -> {}
    <!ELSE_MISPLACED_IN_WHEN, REDUNDANT_ELSE_IN_WHEN!>else<!> -> {}
    <!UNREACHABLE_CODE!>true -> {}<!>
}
