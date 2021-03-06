def targetFile = new File('test.groovy')
targetFile.eachLine {
    String oneLine ->
    println oneLine
}

def ism = targetFile.newInputStream()
ism.eachLine {
    String oneLine ->
    println oneLine
}
ism.close()

targetFile.withInputStream {
    is -> println is.readLines()
}