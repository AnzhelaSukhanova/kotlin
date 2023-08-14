open class A {}
open class B : A() {}
class C : B() {}

fun foo(x: A) = when (x)
{
    is B ->print("B")
    is C ->print("C")
    else -> {}
}