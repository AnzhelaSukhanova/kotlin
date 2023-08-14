fun foo(x: Boolean, y: Boolean, z: Boolean) {
    when {
        x -> print(0)
        !y -> print(1)
        y && z -> print(2)
    }
}