package javatogroovy

import groovy.transform.ToString

// Não precisamos de fazer nenhuma importação para o exemplo, por padrão o groovy já traz as seguintes importações:
/*
import java.lang.*
import java.util.*
import java.io.*
import java.net.*
import groovy.lang.*
import groovy.util.*
import java.math.BigInteger
import java.math.BigDecimal
*/

// Pense como sendo a class User...
// Já no groovy, não precisamos colocar o modificador public.

// É o mesmo que escrever: @groovy.transform.ToString()
@ToString()
class InProcessToConvert {

    // Atributos são private por padrão
    Long id
    String firstName
    String lastName
    String email
    Date dob

    // Não precisamos definir os construtores manualmente, o groovy faz isso de modo que podemos simplesmente passar os
    // paramentros no hora de instanciar os objetos
    // Construtor padrão definido de maneira explícita.

    /*
    Start(){}

    // Construtores
    Start(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Start(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    */

    // --------------------------------

    // Getters e Setters -> O Groovy criar por padrão os getters e setters dos atributos, de modo que não precisamos o fazer
    // A 'keyword' return é opcional, com isso podemos retirá-la sem afetar o código

   /*
    Long getId() { // return id;
        id
    }

    void setId(Long id) { // this.id = id
        this.id = id
    }

    String getFirstName() { // return firstName;
        firstName
    }

    void setFirstName(String firstName) { // this.firstName = firstName;
        this.firstName = firstName
    }

    String getLastName() { // return lastName;
        lastName
    }

    void setLastName(String lastName) { // this.lastName = lastName;
        this.lastName = lastName
    }

    String getEmail() { // return email;
        email
    }

    void setEmail(String email) { // this.email = email;
        this.email = email
    }

    Date getDob() { // return dob;
        dob
    }

    void setDob(Date dob) { // this.dob = dob;
        this.dob = dob
    }
    */

    // --------------------------------

    void printFullName(){
        printf "FullName: %s %s.%n", firstName, lastName
        // println "FullName: $firstName $lastName"
    }

    // Podemos usar as Transformações AST fazer esse override. Olhe imediatamente acima da declaração da classe;

    /*
    @Override
    String toString(){
       String.format "Person[first=%s,last=%s]", firstName, lastName
    }
    */
}
