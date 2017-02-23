package dk.cphbusiness.template.model.java;

public class Pet {
    private final String name;
    private int age;
    // public int Age { get; set; }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        }

/*  C# property
    public int Age {
        get { return age; }
        set { age = value; }
        }
*/
    public String getName() { return name; }

    public int getAge() { return age; }

    public void setAge(int value) { age = value; }

    /*
    fido.setAge(rufus.getAge());
    fido.Age = rufus.Age;
    */

    }
