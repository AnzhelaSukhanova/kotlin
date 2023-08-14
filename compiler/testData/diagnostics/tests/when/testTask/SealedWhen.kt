// FIR_IDENTICAL
sealed class A {
    class B(val b: Int) : A()
    class C(val c1: Int, val c2: Int) : A()

    fun foo(x: A): Int = when (x) {
        is B -> <!DEBUG_INFO_SMARTCAST!>x<!>.b
        is C -> <!DEBUG_INFO_SMARTCAST!>x<!>.c1 + <!DEBUG_INFO_SMARTCAST!>x<!>.c2
    }
}
