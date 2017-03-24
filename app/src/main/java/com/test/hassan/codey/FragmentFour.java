package com.test.hassan.codey;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;

/**
 * Created by Hassan on 18-Oct-16.
 */

public class FragmentFour extends Fragment  {

    public Button button;
    public TextView txt;
    public EditText etxt;
    public ImageView iview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_four_layout, container, false);

        txt = (TextView) view.findViewById(R.id.txtResult);
        etxt = (EditText) view.findViewById(R.id.editText);

        button = (Button) view.findViewById(R.id.runbttn1);


        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                String User = etxt.getText().toString();

                if(User.matches(""))
                {
                    String str = "<font color=\"#FFFFFF\">Tip: Make sure you enter your name into the space above.</font>";
                    txt.setText(Html.fromHtml(str));
                    txt.setBackgroundResource(R.color.colorAccent);
                }
                else {
                    String str = "<font color=\"#FFFFFF\">" +
                            "This is output to the code ran above: " +
                            "</font> " +
                            "<br>--------------------------------------------------------------------------------<br> " +
                            "<font color=\"#FFFFFF\">" +
                            "Hey, " + etxt.getText().toString() +
                            "</font>" +
                            "<br>--------------------------------------------------------------------------------<br>" +
                            "<font color=\"#FFFFFF\">Awesome! Nice one " + etxt.getText().toString() +
                            "! <br><br>If you swipe left I will take you through what all this code means so you can get a better understanding.</font>";
                    txt.setText(Html.fromHtml(str));
                    txt.setBackgroundResource(R.color.colorAccent);
                }
            }
        });

        return view;
    }
}


