fun foo(x: Int) = when (x)
{
    in 9..0 ->print(0)
    in 0 downTo 9 ->print(1)
    else ->print(2)
}