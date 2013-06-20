class Person {
    String name
    int age
}

// using def
def person = new Person(name: 'Erik', age:33)

assert person.name == 'Erik'
assert person['age'] == 33

// using Type
Person personType = new Person(name:'Erik', age:33)
assert person.getName() == 'Erik'
assert person.getAge() == 33

// Using properties
Person properties = new Person()
properties.name = 'Erik'
properties.age = 33



