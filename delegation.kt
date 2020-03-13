interface Base{
    fun hello()
}

class Impl(val x:Int):Base{
    override fun hello() {
        println(x)
    }
}
class Derived(b:Base):Base by b

fun main(args:Array<String>)
{
    val obj=Impl(10);
    Derived(obj).hello()

}
