package com.example.lenovo.myapplication;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2018. 03. 03..
 */

public class VetiverAdapter extends ArrayAdapter<Item> {
    private final Context context;
    private final ArrayList<Item> itemsArrayList;

    public VetiverAdapter(@NonNull Context context, @NonNull ArrayList<Item> itemsArrayList) {
        super(context, R.layout.row, itemsArrayList);
        this.context = context;
        this.itemsArrayList = itemsArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        TextView title          = (TextView) rowView.findViewById(R.id.title);
        TextView author         = (TextView) rowView.findViewById(R.id.author);
        TextView description    = (TextView) rowView.findViewById(R.id.description);
        RatingBar overallrating = (RatingBar) rowView.findViewById(R.id.overallrating);
        RatingBar vetcurriculum = (RatingBar) rowView.findViewById(R.id.vetcurriculum);
        RatingBar userfriendly  = (RatingBar) rowView.findViewById(R.id.userfriendly);
        RatingBar classcapacity = (RatingBar) rowView.findViewById(R.id.classcapacity);

        title.setText(itemsArrayList.get(position).getTitle());
        author.setText(itemsArrayList.get(position).getAuthor());
        description.setText(itemsArrayList.get(position).getDescription());

        overallrating.setNumStars(itemsArrayList.get(position).getOverallrating());
        vetcurriculum.setNumStars(itemsArrayList.get(position).getVetcurriculum());
        userfriendly.setNumStars(itemsArrayList.get(position).getUserfriendly());
        classcapacity.setNumStars(itemsArrayList.get(position).getClasscapacity());
        return rowView;
    }
}
