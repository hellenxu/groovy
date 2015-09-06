def aList = [5, 'string', true]
assert aList[1] == 'string'
assert aList[5] == null
aList[100] = 100
assert aList[100] == 100


println aList.size
//println aList

def aMap = ['key1': 'value1', 'key2': true]
def aNewMap = [key1: 'value', key2: true]
def key1 = 'wowo'
def aConfusedMap =[key1: 'who am i?']
aConfusedMap = [(key1):'who am i?']
println aMap.keyName
println aMap['keyName']
aMap.anotherKey = 'i am map'
println aMap
println aMap.key1


def aRange = 1..5
def aRangeWithoutEnd = 1..<5
println aRange.from
println aRange.to
println aRangeWithoutEnd.from
println aRangeWithoutEnd.to
