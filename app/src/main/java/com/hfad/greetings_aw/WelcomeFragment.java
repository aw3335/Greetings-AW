package com.hfad.greetings_aw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * WelcomeFragment fragment allows the user to select a language and translate hello in that language
 * Author: Austin Weaver
 */
public class WelcomeFragment extends Fragment {

    /**
     * Creates the fragment each time needed and allows for information to be passed to other fragments.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return The layout of the file
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //Stores view and inflates it so it can be passed around where needed
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        //Button object that allows the program to notice when the button is pressed
        Button BtnTranslate = view.findViewById(R.id.Btn_Translate);
        //Spinner object that allows the program to get what string is click on in the spinner
        Spinner spinnerTranslate = view.findViewById(R.id.Translate_Array);

        /**
         * BtnTranslate setOnClickListener lets the program know when the button is click and
         * where to go once clicked
         */
        BtnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a string that holds the item selected from the spinner object
                String language = spinnerTranslate.getSelectedItem().toString();

                //Creates a action variable that sends what the string was over to the translate fragment
                WelcomeFragmentDirections.ActionWelcomeFragmentToTranslateFragment action =
                        WelcomeFragmentDirections.actionWelcomeFragmentToTranslateFragment(language);

                //Allows the navigation to different fragments to work
                Navigation.findNavController(v).navigate(action);
            }
        });
        return view;
    }
}