package com.example.iqtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Resulte extends Activity {

	TextView tvf2;
	Button rste;
	int apple1=Easy1.ec1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resulte);
		tvf2=(TextView)findViewById(R.id.final6);
		rste=(Button)findViewById(R.id.restarte);
		tvf2.setText(String.valueOf(Easy1.ec1));
		rste.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View arg0) {
 
			  
				Intent i = new Intent(Resulte.this,First.class);
			    startActivity(i);
			    
 
			}
 
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_resulte, menu);
		return true;
	}

}
