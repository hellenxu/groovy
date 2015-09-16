def input = 'Probably the easiest way to get groovy is to try working with collections.'

if(input ==~ /^.*?groovy.*$/){
    println 'Found groovy'
}

def matcher = 'The Groovy Cook Book contains Groovy recipes' =~ /(.oo.)\s/
//println "<${matcher[0][0]}>"
//println "<${matcher[0][1]}>"
//println "<${matcher[1][0]}>"
//println "<${matcher[1][1]}>"

matcher.each { match ->
    match.each { group ->
    println "<$group>"
    }
}

def input2 = 'The Groovy Cook Book contains Groovy recipes'
println input2.replaceAll(/\b\w*?oo\w*?\b/){
