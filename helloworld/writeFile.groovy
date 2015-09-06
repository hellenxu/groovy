def srcFile = new File("E:\\groovy_factory\\000.txt")
def targetFile = new File ("E:\\groovy_factory\\111.txt")
targetFile.withOutputStream { os ->
    srcFile.withInputStream { ins ->
        os << ins
    }
}


def write2File(String fileName, String content) {
    def targetFile = new File(fileName)
    
    targetFile.withWriter{
        Writer writer ->
        writer.append(content)
    }
}

write2File('E:\\groovy_factory\\000.txt', 'write to file')