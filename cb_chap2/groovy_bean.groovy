import groovy.transform.Immutable

class Student {
    Long id
    String name
    String lastName
}

class StudentImmId {
    final Long id
    String name
    String lastName
    
    StudentImmId(Long id){
        this.id = id
    }
}

@Immutable
class StudentImm {
    String name, lastName
    Long id
}

def student = new Student()
student.setName('Charlie')
student.lastName = 'Parker'
student.id = 10

assert student.name == 'Charlie'
assert student.lastName == 'Parker'

def student2 = new Student(id: 100, name: 'Jack', lastName: 'Shepard')

assert student2.name == 'Jack'
assert student2.id == 100
assert student2.lastName == 'Shepard'

def student3 = new StudentImmId(200)

println("id: " + student.id + " [" + student.name + "." + student.lastName + "] ");
println("id: " + student2.id + " [" + student2.name + "." + student2.lastName + "] ");
println("id: " + student3.id + " [" + student3.name + "." + student3.lastName + "] ");