fun main(){
    val f1 = Fraction(5F,125F)
    val f2 = Fraction(1F,25F)

    println(f1 == f2)
    println(f1.toString())
    println(f1.multiplication(f1))
    println(f1.division(f2))
    println(f1.division(f1))
}

class Fraction(n: Float, d:Float) {
    var numerator: Float = n
    var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if ((numerator * other.denominator) / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator, $denominator"
    }

    fun multiplication(fraction: Fraction): Float {
        return ((numerator * fraction.numerator) / (denominator * fraction.denominator))
    }

    fun division(fraction: Fraction): Float {
        return ((numerator * fraction.denominator / denominator * fraction.numerator))
    }

    fun shortering(): String {
        for (i in 1..10000000000000) {
            if (denominator / i == numerator)
                println(denominator / numerator)
        }
        return "ვერ შევკვეცე"
    }

}


