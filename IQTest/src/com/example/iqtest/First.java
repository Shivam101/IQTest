package com.example.iqtest;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class First extends Activity {

	Button eb;
	Button db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		eb=(Button)findViewById(R.id.button1);
		db=(Button)findViewById(R.id.button2);
		eb.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View arg0) {
 
			  
				Intent i = new Intent(First.this,Easy1.class);
			    startActivity(i);
 
			}
 
		});
	
	db.setOnClickListener(new OnClickListener() {
		 
		public void onClick(View arg0) {

		  Intent i = new Intent(First.this,Difficult1.class);
		    startActivity(i);

		}

	});
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_first, menu);
		return true;
	}

}
