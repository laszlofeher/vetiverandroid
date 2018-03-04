package com.example.lenovo.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ResultList extends ListActivity {


    String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        this.data = intent.getExtras().getString("data");
        Toast.makeText(getApplicationContext(), data,
                Toast.LENGTH_LONG).show();
        VetiverAdapter adapter = new VetiverAdapter(this, generateData(this.data));

        //2. setListAdapter
        setListAdapter(adapter);



        setContentView(R.layout.activity_result_list);
    }

    private ArrayList<Item> generateData(String data){
        ArrayList<Item> listdata = new ArrayList();
        try {

            JSONArray jsonArray = new JSONObject(data).getJSONArray("data");
            if (jsonArray != null) {
                for (int i=0;i<jsonArray.length();i++){
                    JSONObject jsonObject = new JSONObject(jsonArray.getString(i));
                    Item item = new Item(jsonObject.getString("title"),jsonObject.getString("author"),jsonObject.getString("description"),jsonObject.getInt("overallrating"),jsonObject.getInt("vetcurriculum"),jsonObject.getInt("userfriendly"),jsonObject.getInt("classcapacity"));

                    listdata.add(item);
                }
            }


        } catch (Throwable t) {
            Log.e("My App", "Could not parse malformed JSON: \"" + data + "\"");
        }
        return listdata;
    }





}
