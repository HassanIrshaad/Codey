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
import android.text.TextUtils;

/**
 * Created by Hassan on 01-Nov-16.
 */

public class FragmentThirteen extends Fragment {
    public Button button;
    public TextView txt;
    public EditText etxt1;
    public EditText etxt2;
    public EditText etxt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_thirteen_layout, container, false);

        txt = (TextView) view.findViewById(R.id.txtResult3);

        etxt = (EditText) view.findViewById(R.id.editText);
        etxt1 = (EditText) view.findViewById(R.id.editText1);
        etxt2 = (EditText) view.findViewById(R.id.editText2);

        button = (Button) view.findViewById(R.id.runbttn4);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String firstarrayitem = etxt.getText().toString();
                String secondarrayitem = etxt1.getText().toString();
               // String number = etxt2.getText().toString();
                int number1 = Integer.parseInt(etxt2.getText().toString());

                String [] foods = {firstarrayitem,secondarrayitem};

                if(firstarrayitem.matches("") || secondarrayitem.matches(""))
                {
                    String str1 = "<font color=\"#FFFFFF\">" +
                            "Tip: Make sure you don't leave any inputs blank." +
                            "</font>";

                    txt.setText(Html.fromHtml(str1));
                    txt.setBackgroundResource(R.color.colorAccent);
                }
                else {
                    if (number1 < 0 || number1 >= foods.length) {
                        String str1 = "<font color=\"#FFFFFF\">" +
                                "This is output to the code ran above:</font> " +
                                "<br>--------------------------------------------------------------------------------<br>" +
                                "<font color=\"#FFFFFF\">" +
                                "Array Index Out of Bounds" +
                                "</font>" +
                                "<br>--------------------------------------------------------------------------------<br>" +
                                "<font color=\"#FFFFFF\">The reason you got this error is because you are entering a number that is more than the total items in the array. We only have 2 items and because in Java we start counting from 0, the only numbers in this example we can enter is 0 or 1.</font>";

                        txt.setText(Html.fromHtml(str1));
                        txt.setBackgroundResource(R.color.colorAccent);
                    } else {
                        String str = "<font color=\"#FFFFFF\">" +
                                "This is output to the code ran above:</font> " +
                                "<br>--------------------------------------------------------------------------------<br>" +
                                "<font color=\"#FFFFFF\">" +
                                foods[number1] +
                                "</font>" +
                                "<br>--------------------------------------------------------------------------------<br>" +
                                "<font color=\"#FFFFFF\">Hey presto! You did it! You can now choose which item in the array you want to output. Mess around with it and change foods and what food you want to output." +
                                " <br><br>Once you're ready we can go over what the new line of code means, swipe over to continue.</font>";
                        txt.setText(Html.fromHtml(str));
                        txt.setBackgroundResource(R.color.colorAccent);
                    }
                }
            }
        });

        return view;
    }
}
