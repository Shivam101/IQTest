package com.example.iqtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Easy2 extends Activity {

	RadioButton rb1;
	RadioButton rb2;
	RadioButton rb3;
	RadioButton rb4;
	Button eb23;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_easy2);
		eb23=(Button)findViewById(R.id.button1);
		rb2=(RadioButton)findViewById(R.id.rbtn2);
		eb23.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View arg0) {
 
			  if(rb2.isChecked())
			  {
				  Toast.makeText(getBaseContext(),"Correct!!",Toast.LENGTH_SHORT).show();
				  Easy1.ec1++;
			  }
			  else
			  {
				  Toast.makeText(getBaseContext(),"Wrong!! The correct answer was P",Toast.LENGTH_SHORT).show();
				
			  }
				Intent i = new Intent(Easy2.this,Easy3.class);
			    startActivity(i);
 
			}
 
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_easy2, menu);
		return true;
	}

}
