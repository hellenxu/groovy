import groovy.transform.Canonical
import groovy.transform.TupleConstructor

/**
 * Created by hellenxu on 2015/9/29.
 */

@Canonical
class Student {
    String name
    String lastName
    Long age
    List favouriteSubjects
}
