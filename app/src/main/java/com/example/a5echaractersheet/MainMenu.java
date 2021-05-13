package com.example.a5echaractersheet;

import android.app.Dialog;
import   android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainMenu#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainMenu extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Button button;
    private TextView char_name;
    private TextView char_level;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainMenu() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainMenu.
     */
    // TODO: Rename and change types and number of parameters
    public static MainMenu newInstance(String param1, String param2) {
        MainMenu fragment = new MainMenu();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // dialog = new Dialog(getActivity());
        // dialog.setContentView(R.layout.text_popup);
        // dialog.getWindow().setBackgroundDrawable(ResourcesCompat.getDrawable(R.drawable.pop_background));


        // Inflate the layout for this fragment
        View thisView = inflater.inflate(R.layout.fragment_main_menu, container, false);

        char_name = thisView.findViewById(R.id.char_name);
        char_level = thisView.findViewById(R.id.char_level);

        Bundle bundle = new Bundle();
        bundle.putString("name", char_name.getText().toString());

        // make button that launches dialog
        button = thisView.findViewById(R.id.dialog_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopUp popUp = new PopUp();
                popUp.setArguments(bundle);
                popUp.show(getActivity().getSupportFragmentManager(), "PopUp");
            }
        });


        return thisView;

    }
}