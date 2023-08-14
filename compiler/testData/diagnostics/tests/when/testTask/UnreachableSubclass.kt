open class A {}
open class B : A() {}
class C : B() {}

fun foo(x: A) = when (x)
{
    is B -><!UNRESOLVED_REFERENCE!>print<!>("B")
    is C -><!UNRESOLVED_REFERENCE!>print<!>("C")
    else -> {}
}
