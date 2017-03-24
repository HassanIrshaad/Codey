package com.test.hassan.codey;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Hassan on 31-Oct-16.
 */

public class FragmentNine extends Fragment {

    public Button button;
    public TextView txt;
    public EditText etxt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_nine_layout, container, false);

        txt = (TextView) view.findViewById(R.id.txtResult2);

        button = (Button) view.findViewById(R.id.runbttn3);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String[] planets = {"mercury", "venus", "earth"};



                String str = "<font color=\"#FFFFFF\">" +
                        "This is output to the code ran above:" +
                        "</font> " +
                        "<br>--------------------------------------------------------------------------------<br> " +
                        "<font color=\"#FFFFFF\">" +
                        Arrays.toString(planets) +
                        "</font>" +
                        "<br>--------------------------------------------------------------------------------<br>" +
                        "<font color=\"#FFFFFF\">Awesome! We end up with an array of planets" +
                        "! <br><br>Swipe over and we'll go through this code together.</font>";
                txt.setText(Html.fromHtml(str));
                txt.setBackgroundResource(R.color.colorAccent);
                }
            });

        return view;
    }
}
