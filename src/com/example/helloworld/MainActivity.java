package com.example.helloworld;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	protected static final Activity V = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.practice);
		
		EditText name_edttxt = (EditText) findViewById(R.id.name_edttxt);
		EditText phone_edttxt = (EditText) findViewById(R.id.phone_edttxt);
		
		EditText Email_edttxt = (EditText) findViewById(R.id.email_edttxt);
		Button save_click = (Button) findViewById(R.id.save_click);
		Button cancel_click = (Button) findViewById(R.id.cancel_click);
		
	
	

	
	
	//	final EditText emailid_edttxt = (EditText) findViewById(R.id.emailid_edttxt);
	//	TextView emailhome = (TextView) findViewById(R.id.emailhome);
		// final Button emailid = (Button) findViewById(R.id.emailid); {   
			 
			// .setOnClickListener(new View.OnClickListener() 	 
			 
			 
			 
		 }

		//	@Override
		//	public void onClick(View v) {
			//	 startActivity(new intent(MainActivity.this,pop.class));
				// TODO Auto-generated method stub

			//	String editval = emailid_edttxt.getText().toString();

			
		//	InputMethodManager imm = (InputMethodManager)getSystemService(
					//      Context.INPUT_METHOD_SERVICE);
					//imm.hideSoftInputFromWindow(emailid.getWindowToken(), 0);
		    
			//	Toast.makeText(getApplicationContext(), "welcome !! " + editval ,
					//	Toast.LENGTH_SHORT).show();
	//		}
		//});

	//}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
