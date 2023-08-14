fun foo(x: Int) {
    when (x) {
        in 0..9 -><!SYNTAX!><!> <!SYNTAX!><!SYNTAX!><!>val<!> <!UNRESOLVED_REFERENCE!>y<!> = x
        else -> {}
    }
}
