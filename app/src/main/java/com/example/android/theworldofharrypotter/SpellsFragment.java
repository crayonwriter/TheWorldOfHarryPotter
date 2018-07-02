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
public class SpellsFragment extends Fragment {


    public SpellsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.entity_list, container, false);

        // Create a list of Creature entities
        final ArrayList<Entity> entity = new ArrayList<Entity>();
        entity.add(new Entity("Accio (Summoning Charm)", "This charm summons an object to the caster"));
        entity.add(new Entity("Aguamenti (Water-Making Spell)", "Produces a fountain or jet of water from the wand tip."));
        entity.add(new Entity("Alohomora (Unlocking Charm)", "Used to open and unlock doors."));
        entity.add(new Entity("Avada Kedavra (Killing Curse) ", "Causes instant death to the victim wherever it hits on the body, is accompanied by a flash of green light and a rushing noise"));
        entity.add(new Entity("Expecto Patronum (Patronus Charm)", "a defensive spell which will conjure a spirit-like incarnation of their positive emotions to defend against dark creatures; it can also send messages to other witches or wizards."));
        entity.add(new Entity("Expelliarmus (Disarming Charm)", "Causes whatever the victim is holding to fly away, knocks out an opponent if used too forcefully."));
        entity.add(new Entity("Firestorm", " Produces a ring of fire from the wand tip that can strike targets."));
        entity.add(new Entity("Geminio (Gemino Curse)", "Creates an identical, useless copy of the target."));
        entity.add(new Entity("Horcrux Curse", "This spell allows a part of a wizard's soul to pass into an object, thereby making the object a Horcrux. One has to commit murder and take advantage of the soul's \"splitting apart\""));
        entity.add(new Entity("Immobulus (Freezing Charm)", "Renders living targets immobile."));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        EntityAdapter adapter = new EntityAdapter(getActivity(), entity, R.color.creatures);

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
