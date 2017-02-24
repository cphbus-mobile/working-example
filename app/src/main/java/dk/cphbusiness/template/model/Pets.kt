package dk.cphbusiness.template.model

/*
class Pet(val name: String, var age: Int) {
    constructor(name: String) : this(name, 0) {
        println("constructed")
        }
    }
 */

open class Pet(val name: String, owner: Person, var age: Int = 0) {
    var owner: Person = owner
        get() = field
        set(value) {
            if (field != null) field.pets.remove(this)
            field = value
            field.pets.add(this)
            }

    open fun petAge() = age

    override fun toString() = "$name er $age år gammel og er ${owner}s"

    }

class Cat(name: String, owner: Person, age: Int) : Pet(name, owner, age) {
    override fun petAge() = 7*age
    }


class Person(val firstName: String, var lastName: String) {
    var name: String
        get() = "$firstName $lastName"
        set(value) { lastName = value.substringAfterLast(" ") }
    val pets = mutableListOf<Pet>()
    override fun toString() = name
    }

fun main(args: Array<String>) {
    val kurt = Person("Kurt", "Jensen")
    println(kurt.name)
    kurt.name = "Hansen"
    println(kurt.name)

    val fido = Pet("Fido", kurt)
    val rufus = Pet(age = 5, name = "Rufus", owner = kurt)
    println("${fido.name} er ${fido.age} år gammel")
    // One liner
    fido.age = rufus.age
    println("${fido.name} er ${fido.age} år gammel")

    }
