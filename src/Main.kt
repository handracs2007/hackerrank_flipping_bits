// https://www.hackerrank.com/challenges/flipping-bits/problem

fun flippingBits(n: Long): Long {
    var binary = n.toString(2)
    binary = binary.padStart(32, '0')
    binary = binary.replace('1', '2')
    binary = binary.replace('0', '1')
    binary = binary.replace('2', '0')

    return binary.toLong(2)
}

fun main() {
    println(flippingBits(0))
    println(flippingBits(802743475))
    println(flippingBits(35601423))
}