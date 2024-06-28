package dev.lpa.codingexercises;

import java.util.ArrayList;

public class CodingExercise44 {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("234123");
        Contact c = new Contact("gil", "123123123");
        boolean flag = mp.addNewContact(c);
        System.out.println(flag);
    }
}

class MobilePhone{
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact){
        int lookUp = findContact(contact);
        if(lookUp<0){
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int contactIndex = findContact(oldContact);
        if(contactIndex<0) return false;
        myContacts.set(contactIndex, newContact);
        return true;
    }


    private int findContact(Contact contact){
        for(Contact addedContact: myContacts){
            if(contact.getName().equals(addedContact.getName()))return myContacts.indexOf(addedContact);
        }
        return -1;
    }

    private int findContact(String name){
        for (Contact contact: myContacts){
            if(contact.getName().equals(name)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        int contactIndex = findContact(name);
        return contactIndex<0? null: myContacts.get(contactIndex);
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (Contact contact : myContacts){
            System.out.printf("%d. %s -> %s%n", myContacts.indexOf(contact)+1, contact.getName(), contact.getPhoneNumber());
        }
    }

    public boolean removeContact(Contact contact){
        int removeContact = findContact(contact);

        if(removeContact<0)return false;
        myContacts.remove(removeContact);
        return true;
    }
}

class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name,phoneNumber);
    }

}


