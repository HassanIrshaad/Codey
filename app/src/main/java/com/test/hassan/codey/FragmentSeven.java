package com.test.hassan.codey;

import android.graphics.Color;
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hassan on 30-Oct-16.
 */

public class FragmentSeven extends Fragment {


    public Button button;
    public TextView txt;
    public EditText etxt;
    public EditText etxt1;
    public EditText etxt2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_seven_layout, container, false);

        etxt = (EditText) view.findViewById(R.id.editText1);
        etxt1 = (EditText) view.findViewById(R.id.editText2);
        etxt2 = (EditText) view.findViewById(R.id.editText3);
        etxt.setTextColor(Color.parseColor("#ffa200"));
        etxt2.setTextColor(Color.parseColor("#ffa200"));

        txt = (TextView) view.findViewById(R.id.txtResult1);

        button = (Button) view.findViewById(R.id.runbttn2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String User = etxt.getText().toString();
                    String User1 = etxt1.getText().toString();
                    String User2 = etxt2.getText().toString();

                if (User.matches("") || User1.matches("") || User2.matches("")) {
                    String str = "<font color=\"#FFFFFF\">Tip: Make sure to fill in the empty spaces, ha, get it, space-s?</font>";
                    txt.setText(Html.fromHtml(str));
                    txt.setBackgroundResource(R.color.colorAccent);
                }
                else {
                    if (!User.equals(User2)) {
                        String str2 = "<font color=\"#FFFFFF\">Tip: Make sure the variable name and the variable you want to output are the same.</font> ";
                        txt.setText(Html.fromHtml(str2));
                        txt.setBackgroundResource(R.color.colorAccent);
                    } else {
                        String planet = "";
                        if (User1.matches("Mercury") || User1.matches("mercury") || User1.matches("Venus") || User1.matches("venus") || User1.matches("Earth") || User1.matches("earth") ||
                                User1.matches("Mars") || User1.matches("mars") || User1.matches("Jupiter") || User1.matches("jupiter") || User1.matches("Saturn") || User1.matches("saturn")
                                || User1.matches("Uranus") || User1.matches("uranus") || User1.matches("Neptune") || User1.matches("neptune")) {
                            planet = User1;
                            String str = "<font color=\"#FFFFFF\">" +
                                    "This is output to the code ran above:</font>" +
                                    "<br>--------------------------------------------------------------------------------<br>" +
                                    "<font color=\"#FFFFFF\">" +
                                    planet +
                                    "</font>"+
                                    "<br>--------------------------------------------------------------------------------<br>" +
                                    "<font color=\"#FFFFFF\">Awesome! You successfully wrote Java code all by yourself! Gold star for you my friend. ★" +
                                    "<br><br>As you can see, we did the same thing as last time but with Planets! Cool, right?</font>";
                            txt.setText(Html.fromHtml(str));
                            txt.setBackgroundResource(R.color.colorAccent);
                        } else if (User1.matches("Pluto") || User1.matches("pluto"))
                        {
                            planet = User1;
                            String str = "<font color=\"#FFFFFF\">" +
                                    "This is output to the code ran above:</font>" +
                                    "<br>--------------------------------------------------------------------------------<br>" +
                                    "<font color=\"#FFFFFF\">" +
                                    planet +
                                    "</font>" +
                                    "<br>--------------------------------------------------------------------------------<br>" +
                                    "<font color=\"#FFFFFF\">Awesome! You successfully wrote Java code all by yourself! Gold star for you my friend. ★" +
                                    "<br><br>As you can see, we did the same thing as last time but with Planets! Pluto will always be a planet in my eyes...</font>";
                            txt.setText(Html.fromHtml(str));
                            txt.setBackgroundResource(R.color.colorAccent);
                        }
                        else
                        {
                            Pattern pattern = Pattern.compile("\\s");
                            Matcher matcher = pattern.matcher(User1);
                            boolean found = matcher.find();
                            if (found = true)
                            {
                                String str = "<font color=\"#FFFFFF\"> Tip: Make sure there aren't any spaces before or after the name of your planet as this can mess with how Java interprets your String.</font>";
                                txt.setText(Html.fromHtml(str));
                                txt.setBackgroundResource(R.color.colorAccent);
                            }
                        }
                    }
                }
            }
        });

        return view;
    }
}
