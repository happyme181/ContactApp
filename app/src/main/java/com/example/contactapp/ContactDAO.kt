package com.example.contactapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao

interface ContactDAO {

    @Insert
    fun addContactList(contactList: ContactModel)

    @Query("SELECT * from contactmodel")
    fun getAllContactLists(): LiveData<List<ContactModel>>

    @Delete
    fun delete (contactList: ContactModel)


}