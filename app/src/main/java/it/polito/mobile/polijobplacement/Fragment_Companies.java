package it.polito.mobile.polijobplacement;


import android.os.Bundle;
import android.app.Fragment;
import android.provider.ContactsContract;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class Fragment_Companies extends android.support.v4.app.Fragment {


    public Fragment_Companies() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_fragment__home, container, false);
        ListView lt = (ListView) v.findViewById(R.id.list_company);
        lt.setAdapter( new BaseAdapter() {
            Database db = (Database) getActivity().getApplicationContext();
            List<App_User> list_company = db.Company_List();
            @Override
            public int getCount() {
                return list_company.size();
            }

            @Override
            public Object getItem(int position) {
                return list_company.get(position).getName();
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_company, parent, false);
                TextView tv = (TextView)convertView.findViewById(R.id.company_name);
                tv.setText(getItem(position).toString());
                return convertView;
            }
        });
        return v;
    }


}
