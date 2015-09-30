/**
 * Created by hellenxu on 2015/9/28.
 */

def s1 = new Student('Mike', 'Wells', 20, ['math', 'phisics'])
def s2 = new Student('Joe', 'Garland', 22)
def s3 = new Student()

assert s1.name == 'Mike'
assert s2.favouriteSubjects == null
assert s3 != null
assert !s3.name

def p1 = new Person('Peter', 20);

println("Person" + p1.toString())

def be = new BusinessException('missing resource')
assert be.message == 'missing resource'

assert new BusinessException('hello').message == 'hello'

def be1 = new BusinessException('catastrophic failure', be)
assert be1.cause.message == 'missing resource'

def v1 = new Vehicle()
v1.brand = 'Ferrari'
v1.type = 'Testarossa'
v1.wheelsNumber = 4

def e1 = new Engine(horseEngine: 390, liter: 4.9)
v1.engine = e1

def v2 = v1.clone()

println 'Original vehicle engine liters: ' + v1.engine.liter
println 'Cloned vehicle engine liters: ' + v2.engine.liter
v2.engine.liter = 8
println 'Original vehicle engine liters: ' + v1.engine.liter