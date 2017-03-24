package com.test.hassan.codey;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hassan on 02-Nov-16.
 */

public class FragmentFifteen extends Fragment {

    public TextView txt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_fifteen_layout, container, false);

        txt = (TextView) view.findViewById(R.id.textview);

      //  txt.setText( Html.fromHtml("Click this link! <a href=\"https://www.surveymonkey.co.uk/r/FW9M6CJ\">Survey</a>"));
       // txt. setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }
}
