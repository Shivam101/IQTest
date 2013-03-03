package com.example.iqtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Resultd extends Activity {

	Button rstd;
	TextView tvf1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resultd);
		tvf1=(TextView)findViewById(R.id.final3);
		rstd=(Button)findViewById(R.id.restartd);
		tvf1.setText(String.valueOf(Difficult1.dc1));
		rstd.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View arg0) {
 
			  
				Intent i = new Intent(Resultd.this,First.class);
			    startActivity(i);
			    
 
			}
 
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_resultd, menu);
		return true;
	}

}
