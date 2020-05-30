package com.example.birthdaycard.ui.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.birthdaycard.R
import com.example.birthdaycard.databinding.MainFragmentBinding

class MainFragment : Fragment() {
    lateinit var binding: MainFragmentBinding
    lateinit var fromPersonName :String
    lateinit var toPersonName:String
    lateinit var  fromPerson:Person
    lateinit var toPerson:Person

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
//        if (savedInstanceState != null)
//        {
//            fromPersonName= savedInstanceState.getString("fromPerson").toString()
//            toPersonName=savedInstanceState.getString("toPesron").toString()
//        }
        binding.button.setOnClickListener {
            makeButtonClicked()
        }
        return binding.root
    }

    private fun makeButtonClicked() {
        fromPersonName = binding.editNameFrom.text.toString()
        toPersonName = binding.editNameTo.text.toString()
        fromPerson = Person(fromPersonName)
        toPerson = Person(toPersonName)
            if (fromPersonName.checkEmpty() || toPersonName.checkEmpty()) {
                Toast.makeText(context, "Please enter both the names!!", Toast.LENGTH_LONG).show()
            } else if (fromPerson == toPerson) {  // as person is a data class we can directly check whether the names are equal without overriding .equals() method
                Toast.makeText(context, "Both the names are same!!", Toast.LENGTH_LONG).show()
            } else {
                this.findNavController().navigate(
                    MainFragmentDirections.actionMainFragmentToMessageFragment(
                        fromPerson.name,
                        toPerson.name
                    )
                )
            }
        }

//        override fun onSaveInstanceState(outState: Bundle) {
//            super.onSaveInstanceState(outState)
//            outState.putString("fromPerson",fromPersonName)
//            outState.putString("toPerson",toPersonName)
//        }



    private fun String.checkEmpty() = this == "" //used an extension function for string class and also used compact function

}
