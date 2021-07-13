package com.example.contactapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class ContactViewModel: ViewModel() {

    fun addContactList (
        contactList: ContactModel,
        database: ContactDatabase){
        database.contactDao().addContactList(contactList)
    }
    fun getAllContactLists(database: ContactDatabase)
    : LiveData<List<ContactModel>> {
        return  database.contactDao().getAllContactLists()
    }

}