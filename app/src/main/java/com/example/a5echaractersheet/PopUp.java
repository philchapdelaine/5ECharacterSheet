package com.example.a5echaractersheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import org.jetbrains.annotations.NotNull;

public class PopUp extends DialogFragment {

    TextView textView;
    Bundle bundle;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);

         View thisView = inflater.inflate(R.layout.fragment_text_popup, container, false);
         textView = thisView.findViewById(R.id.ed_text);
         bundle = this.getArguments();
         String data = bundle.getString("name");
         textView.setText(data);

         return thisView;
    }
}
