package com.example.android.theworldofharrypotter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotableEventsFragment extends Fragment {
    public NotableEventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.entity_list, container, false);

        // Create a list of Creature entities
        final ArrayList<Entity> entity = new ArrayList<Entity>();
        entity.add(new Entity(" Triwizard Tournament", "An inter-school magical competition that consists of three dangerous tasks."));
        entity.add(new Entity("Quidditch World Cup", "Held every four years since 1473, Quidditch teams representing countries around the world compete for the World Cup, "));
        entity.add(new Entity("Battle of Hogwarts", "This battle, within the castle/on the grounds of Hogwarts School, ended the second Wizarding War on May 2, 1998."));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        EntityAdapter adapter = new EntityAdapter(getActivity(), entity, R.color.creatures);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.

        listView.setAdapter(adapter);

        return rootView;
    }
}
