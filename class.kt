/**
 * Example using Class in Kotlin
 */
class myClass{
    private var a:Int=100;

    fun display(){
        print("Value of a is "+a);
    }
}//end of class

fun main() {
    val obj=myClass();
    obj.display();
}
