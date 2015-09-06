def aClosure = {
    String param1, int param2 ->
    println param1 + param2
}

aClosure.call('this is string', 100)

def greeting = {"Hello, $it!"}
assert greeting('Patrick') == 'Hello, Patrick!'
println greeting('Patrick')

def noParamClosure = {it}

noParamClosure("test")

//public static <T> List<T>each (List<T> self, Closure closure)

def iamList = [1,2,3,4,5]
iamList.each{
    println it
}

def testClosure(int a1, String b1, Closure closure){
    println 'included in testClosure'
    closure()
}

testClosure(4, 'test', {println 'i am in closure'})
