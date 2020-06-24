package com.example.test;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentTwo extends Fragment {
    private static final String TAG = "FragmentTwo";
    TextChangeListener listener2;
    EditText editText;
    TextView textView;

    public void setTextTwo(String param) {
        textView.setText(param);
    }

    public void setTextChangeTwo(TextChangeListener listn2){
        listener2 = listn2;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragtwo, container, false);
        Log.d(TAG, "onCreateView: ");
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.txt2);
        editText = view.findViewById(R.id.edittxt2);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                listener2.onTextchangeOne(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
