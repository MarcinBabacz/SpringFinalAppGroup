package finalApp.Model;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
 
public class Person {
 
	@NotEmpty(message = "{pl.reaktor.model.Person.firstName.NotEmpty}")
    private String firstName;
    @NotEmpty(message = "{pl.reaktor.model.Person.lastName.NotEmpty}")
    private String lastName;
    @Email(message = "{pl.reaktor.model.Person.email.Email}")
    @NotEmpty(message = "{pl.reaktor.model.Person.email.NotEmpty}")
    private String email;
    @Min(value = 18, message = "{pl.reaktor.model.Person.age.Min}")
    private int age;
     
    public Person() {}
    public Person(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
 
}
