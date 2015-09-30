import groovy.transform.Canonical
import groovy.transform.ToString

/**
 * Created by hellenxu on 2015/9/29.
 */

@Canonical
@ToString(excludes = 'age')
class Person {
    String name
    int age
}
