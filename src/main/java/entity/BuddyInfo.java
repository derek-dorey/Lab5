package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;

//    @ManyToOne
//    private AddressBook addressbook;

    protected BuddyInfo() {}

    public BuddyInfo(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
