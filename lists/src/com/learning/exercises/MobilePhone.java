    package com.learning.exercises;

    import java.util.ArrayList;
    public class MobilePhone {

        private String myNumber;
        private ArrayList<Contact> myContacts;


        public MobilePhone(String phoneNum)
        {
            myNumber = phoneNum;
            myContacts = new ArrayList<>();
        }

        public boolean addNewContact(Contact contact) {

            if (findContact(contact.getName()) >= 0) {
                System.out.println("Contact is already on file");
                return false;
            }
            myContacts.add(contact);
            return true;
        }


        public boolean updateContact(Contact oldContact, Contact newContact)
        {
            if(myContacts.contains(oldContact)) {
                int idx = myContacts.indexOf(oldContact);
                myContacts.set(idx, newContact);
                return true;
            }
            return false;
        }

        public boolean removeContact(Contact myContact){
            if(myContacts.contains(myContact)){
                myContacts.remove(myContact);
                return true;
            }
            return false;
        }

        private int findContact(Contact myContact){
            return myContacts.indexOf(myContact);
        }

        public Contact queryContact(String contact)
        {
            for(var ele: myContacts)
            {
                if(ele.getName().equals(contact)){
                    return ele;
                }
            }
            return null;
        }

        private int findContact(String contact)
        {
            for(var ele: myContacts){
                if(ele.getName().equals(contact)){
                    return myContacts.indexOf(ele);
                }
            }
            return -1;
        }

        public void printContacts(){
            System.out.println("Contact List:");
            int i=1;
            for(var ele: myContacts){
                System.out.print(i+". "+ele.getName()+" -> "+ele.getPhoneNumber());
                i++;
            }
        }


    }
