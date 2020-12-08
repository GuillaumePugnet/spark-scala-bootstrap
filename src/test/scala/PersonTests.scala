package guillaumepugnet.scala.template.helloworld

import org.scalatest.funsuite.AnyFunSuite

class PersonTests extends AnyFunSuite {

        test("the first name is set correctly in constructor") {
            val person = new Person("guillaume", "pugnet")
            assert(person.firstName == "guillaume")
        }

        test("the last name is set correctly in constructor") {
            val person = new Person("guillaume", "pugnet")
            assert(person.lastName == "pugnet")
        }
        
        

}