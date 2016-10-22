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


public class RoomActivity extends AppCompatActivity {

    int NumberOfPeople = 0;        //number of checked in people in room
    private Button button_CheckIn;  //button for "pushing" name into list @TODO unused!
    TextView txt_header;
    String peopleNames[] = new String[15];  // string array (probably obsolete?)
    String mEditString;         // string type of input text
    EditText mEdit;             // name input text field
    ListView listView;          // list of people
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, android.R.id.text1, peopleNames);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }


        });

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
            if (!mEditString.matches("")) {
                setHeader(++NumberOfPeople);
                mEdit = (EditText) findViewById(R.id.editText);
                mEditString = mEdit.getText().toString();
                adapter.add(mEditString);            } else {
                Toast.makeText(this, "Bitte Usernamen eingeben!", Toast.LENGTH_SHORT).show();
            }


        }
    }

}
