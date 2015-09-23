import groovy.transform.ToString

@ToString
class Student {
    String name
}

@ToString(includeNames = true, excludes = 'lastName, age')
class Student2 {
    String name
    String lastName
    int age
}

def s = new Student(name: 'John')
assert s.toString() == 'Student(John)'
def s2 = new Student2(name: 'Tom', lastName: 'UnderWood', age: 20)
assert s2.toString() == 'Student2(name:Tom)'