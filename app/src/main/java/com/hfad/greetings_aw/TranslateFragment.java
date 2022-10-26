package com.hfad.greetings_aw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Author: Austin Weaver
 */
public class TranslateFragment extends Fragment {

    /**
     * Creates the fragment each time needed and allows for information to be passed to other fragments.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return The layout of the file
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Creates a view object that holds the layout of the fragment
        View view = inflater.inflate(R.layout.fragment_translate, container, false);
        //Creates a textview that will get changed according to what language was selected
        TextView tvTranslated = view.findViewById(R.id.transWord);
        //Creates a string for the language that is recieved from the bundle in the arguments section
        String language = TranslateFragmentArgs.fromBundle(requireArguments()).getLanguage();

        //Generic if statements that determine what language the string is and
        //then display hello in that language
        if(language.equals("German"))
        {
            tvTranslated.setText("Hallo");
        }
        else if(language.equals("Spanish"))
        {
            tvTranslated.setText("Hola");
        }
        else
        {
            tvTranslated.setText("Bonjour");
        }

        return view;
    }
}