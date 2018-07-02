package com.example.android.theworldofharrypotter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EntityAdapter extends ArrayAdapter<Entity> {
    public int mColorResourceId;

    public EntityAdapter(Activity context, ArrayList<Entity> entity, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, entity);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }


        // Get the {@link Entity} object located at this position in the list
        Entity currentEntity = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_textview
        TextView nameTextView = listItemView.findViewById(R.id.name_textview);
        // Get the version name from the current Word object and
        // set this text on the name TextView

        nameTextView.setText(currentEntity.getName());

        // Find the TextView in the list_item.xml layout with the ID description_textview

        TextView descriptionTextView = listItemView.findViewById(R.id.description_textview);
        // Get the description from the current Entity object and
        // set this text on the descriptionTextView

        descriptionTextView.setText(currentEntity.getDescription());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        //Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentEntity.hasImage()) {
            imageView.setImageResource(currentEntity.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
