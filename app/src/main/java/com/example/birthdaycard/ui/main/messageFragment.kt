package com.example.birthdaycard.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.birthdaycard.R
import com.example.birthdaycard.databinding.FragmentMessageBinding

/**
 * A simple [Fragment] subclass.
 * Use the [messageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */



class messageFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentMessageBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_message,container,false)
        val args = messageFragmentArgs.fromBundle(arguments!!)
        val messages = listOf("Count your life by smiles, not tears. Count your age by friends, not years. Happy birthday!",
        "A wish for you on your birthday, whatever you ask may you receive, whatever you seek may you find, whatever you wish may it be fulfilled on your birthday and always. Happy birthday!",
        "Another adventure filled year awaits you. Welcome it by celebrating your birthday with pomp and splendor. Wishing you a very happy and fun-filled birthday!",
            "Count not the candles…see the lights they give. Count not the years, but the life you live. Wishing you a wonderful time ahead. Happy birthday.",
        "Happy birthday! Your life is just about to pick up speed and blast off into the stratosphere. Wear a seat belt and be sure to enjoy the journey. Happy birthday!",
        "This birthday, I wish you abundant happiness and love. May all your dreams turn into reality and may lady luck visit your home today. Happy birthday to one of the sweetest people I’ve ever known.",
        "May you be gifted with life’s biggest joys and never-ending bliss. After all, you yourself are a gift to earth, so you deserve the best. Happy birthday.",
        "May you be gifted with life’s biggest joys and never-ending bliss. After all, you yourself are a gift to earth, so you deserve the best. Happy birthday.",
        "Your birthday is the first day of another 365-day journey. Be the shining thread in the beautiful tapestry of the world to make this year the best ever. Enjoy the ride.",
        "Be happy! Today is the day you were brought into this world to be a blessing and inspiration to the people around you! You are a wonderful person! May you be given more birthdays to fulfill all of your dreams!",
        "Forget about the past, you can’t change it. Forget about the future, you can’t predict it. And forget about the present, I didn’t get you one. Happy birthday!",
        "Happy birthday to someone who is smart, gorgeous, funny and reminds me a lot of myself… from one fabulous chick to another!",
        "On your birthday, I thought of giving you the cutest gift in the world. But then I realized that is not possible because you yourself are the cutest gift in the world.",
        "It’s birthday time again, and wow! You’re a whole year older now! So clown around and have some fun to make this birthday your best one. Happy birthday!",
        "Congratulations on being even more experienced. I’m not sure what you learned this year, but every experience transforms us into the people we are today. Happy birthday",
        "When the little kids ask how old you are at your party, you should go ahead and tell them. While they’re distracted trying to count that high, you can steal a bite of their cake! Happy birthday!")

        binding.messageFrom.text="Yours lovingly,\n  ${args.fromName}" // Used String templates which is a feature of kotlin
        binding.messageTo.text="Hey ${args.toName},"
        binding.messageText.text = messages.random()

        return binding.root
    }
}

