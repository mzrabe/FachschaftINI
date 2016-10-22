package com.wordpress.ini8bht.fachschaftini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RoomActivity extends AppCompatActivity {

    ArrayList<String> listItems=new ArrayList<String>();
    ArrayAdapter<String> adapter;

    int NumberOfPeople = 0;        //number of checked in people in room
    private Button button_CheckIn;  //button for "pushing" name into list
    private Button button_getBack;
    TextView txt_header;
    //String peopleNames[] = new String[15];  // string array (probably obsolete?)
    String mEditString = "";         // string type of input text
    EditText mEdit;             // name input text field
    ListView listView;          // list of people

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);


        txt_header = (TextView)findViewById(R.id.textView1);
        button_CheckIn = (Button) findViewById(R.id.button6);
        button_CheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkIn();
            }
        });
        listView = (ListView) findViewById(R.id.list);
        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
    }

    void setHeader (int NumberOfPeople) {
        //writes NumberOfPeople into header text
        txt_header.setText(NumberOfPeople + " Leute sind gerade hier.");
    }
    public void checkIn() {
        //checks in a new person
        if (NumberOfPeople >= 15) {
            Toast.makeText(this, "Fehler: Zu viele Anwesende! Auschecken vergessen?", Toast.LENGTH_SHORT).show();
        } else {
            mEdit = (EditText) findViewById(R.id.editText);
            mEditString = mEdit.getText().toString();
            if (!mEditString.matches("")) {
                setHeader(++NumberOfPeople);

                adapter.add(mEditString);            }
            else
            {
                Toast.makeText(this, "Bitte Usernamen eingeben!", Toast.LENGTH_SHORT).show();
            }


        }
    }

}
