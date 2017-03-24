package com.test.hassan.codey;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

/**
 * Created by Hassan on 31-Oct-16.
 */

public class FragmentTwelve extends Fragment {
    public Button button;
    public TextView txt;
    public EditText etxt;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_twelve_layout, container, false);

        txt = (TextView) view.findViewById(R.id.txtResult3);

        button = (Button) view.findViewById(R.id.runbttn4);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String[] planets = {"mercury", "venus", "earth"};



                String str = "<font color=\"#FFFFFF\">" +
                        "This is output to the code ran above:</font>" +
                        "<br>--------------------------------------------------------------------------------<br> " +
                        "<font color=\"#FFFFFF\">" +
                        planets +
                        "</font>" +
                        "<br>--------------------------------------------------------------------------------<br>" +
                        "<font color=\"#FFFFFF\">As you can see, it just spits out computer talk which is not what we want" +
                        "! <br><br>So we always convert the array to string before outputting it. The next exercise will look at how to specify what items to output from within an array</font>";
                txt.setText(Html.fromHtml(str));
                txt.setBackgroundResource(R.color.colorAccent);
            }
        });

        return view;
    }

}
