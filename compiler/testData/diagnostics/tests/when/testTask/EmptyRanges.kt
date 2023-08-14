fun foo(x: Int) = when (x)
{
    in 9..0 -><!UNRESOLVED_REFERENCE!>print<!>(0)
    in 0 <!UNRESOLVED_REFERENCE!>downTo<!> 9 -><!UNRESOLVED_REFERENCE!>print<!>(1)
    else -><!UNRESOLVED_REFERENCE!>print<!>(2)
}
