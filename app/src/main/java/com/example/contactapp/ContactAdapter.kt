package com.example.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.databinding.ContactListBinding

class ContactAdapter (
    val contactList: List<ContactModel>,
    val clickerFnx: (ContactModel) -> Unit
    ):RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

        inner class ViewHolder(val binding: ContactListBinding)
            : RecyclerView.ViewHolder(binding.root){

            fun bind(contactList: ContactModel) {
                binding.contactName.text = contactList.contactName
                binding.phoneNumber.text = contactList.phoneNumber
                binding.root.setOnClickListener {
                    clickerFnx(contactList)
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding: ContactListBinding = ContactListBinding.inflate(LayoutInflater.from(parent.context))
            return ViewHolder (binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(contactList.get(position))

        }

        override fun getItemCount() = contactList.size
}
