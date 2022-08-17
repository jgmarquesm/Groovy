package javatogroovy

import groovy.transform.Field
import groovy.transform.ToString

@ToString
class Finish {

    Long id
    String firstName
    String lastName
    String email
    Date dob

    void printFullName(){
        println "FullName: $firstName $lastName"
    }
}
