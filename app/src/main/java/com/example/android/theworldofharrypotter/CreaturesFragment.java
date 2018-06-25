package com.example.android.theworldofharrypotter;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreaturesFragment extends Fragment {


    public CreaturesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.entity_list, container, false);

        // Create a list of Creature entities
        final ArrayList<Entity> entity = new ArrayList<Entity>();
        entity.add(new Entity("name", "desription"));
        entity.add(new Entity("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        entity.add(new Entity("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        entity.add(new Entity("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        entity.add(new Entity("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        entity.add(new Entity("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        entity.add(new Entity("black", "kululli", R.drawable.color_black, R.raw.color_black));
        entity.add(new Entity("white", "kelelli", R.drawable.color_white, R.raw.color_white));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.

        listView.setAdapter(adapter);

        return rootView;
    }
}


