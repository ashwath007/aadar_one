package com.example.ashwath.adverifyjsonone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.json.JSONException;
import org.json.JSONObject;

import static com.example.ashwath.adverifyjsonone.R.id.adr;


public class MainActivity extends AppCompatActivity {

    EditText et;  // et > variable edittext
    Button b;     // btn > b
    //EditText et1;
    Intent intent;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;

    // here i am over riding the oncreate bunble basic
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(adr);
        //b = (Button) findViewById(R.id.ok);
        // et1 = (EditText) findViewById(R.id.ed2);
        //JSONObject reader = new JSONObject();
        // override OnClickListener
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {

                                     Button submitButton = (Button) findViewById(R.id.ok);

                                     submitButton.setOnClickListener(new View.OnClickListener() {



                                         public void onClick(View v) {
                                             JSONObject postData = new JSONObject();
                                             Btn();
                                             try {
                                                 JSONObject name = postData.put("aadar number", et.getText().toString());


                                                 new SendDeviceDetails.execute("http://52.88.194.67:8080/IOTProjectServer/registerDevice", postData.toString());
                                             } catch (JSONException e) {
                                                 e.printStackTrace();
                                             }
                                         }
                                     });

                                 }
                             }


        );
    }
//here i am calling new page !!
    private void Btn() {
        Intent intent = new Intent(this, Public.class);          //calling the new activity
        startActivity(intent);


    }
}


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    //    client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    //}

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
 /**   public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[EN"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
*/