//The Number of such routes through a 20×20 grid are 137846528820
import java.math.BigInteger
fun factorial(number:Int):BigInteger  = if(number==1) 1.toBigInteger() else number.toBigInteger()*factorial(number-1)
fun nCr(n:Int,r:Int):BigInteger = (factorial(n)/((factorial(r))*factorial((n-r))))
fun shortestPathForGridSize(size:Int):BigInteger = nCr(2*size,size)//2ncn

fun main() {
    var gridSize=20
    println("The Number of such routes through a 20×20 grid are ${shortestPathForGridSize(gridSize)}")
}



