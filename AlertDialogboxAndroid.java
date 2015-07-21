package com.example.hassan.alquranexpert;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;


public class HomeActivity extends ActionBarActivity {

    EditText first_name ;
    EditText last_name ;
    EditText email ;
    EditText mobile ;
    final Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        first_name = (EditText) findViewById(R.id.txt_firstname);
        last_name = (EditText) findViewById(R.id.txt_lastname);
        email = (EditText) findViewById(R.id.txt_email);
        mobile = (EditText) findViewById(R.id.txt_mobile);

    }

    public void showpage(View view)
    {

        HomeActivity.this.finish();

        Intent intent =new Intent(this, Questions.class);

        startActivity(intent);

    }

    public void click_me(View view)
    {
        String valone = first_name.getText().toString();
        String valtwo = last_name.getText().toString();
        String valthree = email.getText().toString();
        String valfour = mobile.getText().toString();

        AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(context);

        alertDialogBuilder.setTitle("User Entered Data...");

        alertDialogBuilder.setMessage("this is data");

        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int id) {

                showpage(null);

            }

        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {


            public void onClick(DialogInterface dialog, int id) {

                dialog.cancel();
            }


        });

        AlertDialog alertdialog = alertDialogBuilder.create();

        alertdialog.show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
