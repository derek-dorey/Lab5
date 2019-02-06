//package entity;
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@Entity
//public class AddressBook {
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addressbook")
//    private List<BuddyInfo> buddyInfoList = new ArrayList<BuddyInfo>();
//
//    protected AddressBook(){}
//
//
//}
