import groovy.util.slurpersupport.GPathResult

def xparser = new XmlSlurper()
def targetFile = new File('test0.xml')

GPathResult gpathResult = xparser.parse(targetFile)

def book4 = gpathResult.value.books.book[3]
def author = book4.author
assert author.text() == 'Manuel De Cervantes'

author.@id == '4'
author.@id.toInteger() == 4

GPathResult androidManifestResult = new XmlSlurper().parse('AndroidManifest.xml')
println androidManifestResult['@android:versionName']
println androidManifestResult.@'android:versionName'
println androidManifestResult.application.@'android:icon'
println androidManifestResult.application.activity.@'android:name'