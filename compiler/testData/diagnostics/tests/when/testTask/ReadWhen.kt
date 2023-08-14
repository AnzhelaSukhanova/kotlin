fun foo(x: Int): Int? = when (val <!NAME_SHADOWING!>x<!> = <!UNRESOLVED_REFERENCE!>readlnOrNull<!>()) {
    <!SENSELESS_NULL_IN_WHEN!>null<!> -> null
    else -> <!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>x<!>.<!DEBUG_INFO_MISSING_UNRESOLVED!>toInt<!>()
}
