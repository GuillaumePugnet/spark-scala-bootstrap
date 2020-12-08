package guillaumepugnet.scala.template.helloworld

class Person(var firstName: String, var lastName: String){
    var age = 0

    override def toString = s"$firstName $lastName is $age years old"
    def printFullName{
        // this will call the toString overriden method
        println(this)
    }
}
