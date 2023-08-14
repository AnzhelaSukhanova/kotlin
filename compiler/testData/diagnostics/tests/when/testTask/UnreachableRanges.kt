fun foo(x: Int) = when (<!TYPE_MISMATCH!>x<!>)
{
    in 0..19 -><!UNRESOLVED_REFERENCE!>print<!>(0)
    in 0..9 -><!UNRESOLVED_REFERENCE!>print<!>(1)
    <!TYPE_MISMATCH_IN_RANGE!>in<!> 20..900000000000 -><!UNRESOLVED_REFERENCE!>print<!>(2)
    else -><!UNRESOLVED_REFERENCE!>print<!>(3)
}
