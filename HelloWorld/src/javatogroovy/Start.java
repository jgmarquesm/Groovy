package javatogroovy;

// Imports necessários parra o exemplo:
import java.util.Date;

// Pense como sendo a class User...
// Note que precisamos colocar o modificador public sempre que é de acesso público
public class Start {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date dob;

    // Construtor padrão definido de maneira explícita.
    public Start(){}

    // Consstrutores
    public Start(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Start(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void printFullName(){
        System.out.printf("FullName: %s %s.%n", firstName, lastName);
    }

    @Override
    public String toString(){
        return String.format("Person[first=%s,last=%s]", firstName, lastName);
    }
}
