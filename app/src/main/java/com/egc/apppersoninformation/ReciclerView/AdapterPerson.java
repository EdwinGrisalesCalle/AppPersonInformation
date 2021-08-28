package com.egc.apppersoninformation.ReciclerView;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.egc.apppersoninformation.Models.Person;
import com.egc.apppersoninformation.R;

import java.util.ArrayList;

public class AdapterPerson extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Person> people;

    public AdapterPerson(Activity activity, ArrayList<Person> people) {
        this.activity = activity;
        this.people = people;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int position) {
        return people.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.person_item,null);
        }

        Person personElement = people.get(position);

        TextView tvName = v.findViewById(R.id.tvNameItem);
        tvName.setText(personElement.getName());

        TextView tvSurname = v.findViewById(R.id.tvSurnameItem);
        tvSurname.setText(personElement.getSurname());

        TextView tvIdentificationCard = v.findViewById(R.id.tvCardItem);
        tvIdentificationCard.setText(personElement.getIdentifiacionCard());


        return v;
    }
}
