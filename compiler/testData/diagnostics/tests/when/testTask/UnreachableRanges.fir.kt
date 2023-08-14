fun foo(x: Int) = when (x)
{
    in 0..19 ->print(0)
    in 0..9 ->print(1)
    in 20..900000000000 ->print(2)
    else ->print(3)
}