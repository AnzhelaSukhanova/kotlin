fun foo(x: Boolean): Int = when (x) {
    false -> 0
    true -><!CONSTANT_EXPECTED_TYPE_MISMATCH!>1.0<!>
}
