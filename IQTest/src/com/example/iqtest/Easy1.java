package com.example.iqtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Easy1 extends Activity {

	RadioButton rb1;
	RadioButton rb2;
	RadioButton rb3;
	RadioButton rb4;
	Button eb12;
	static int ec1=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_easy1);
		rb1=(RadioButton)findViewById(R.id.rbtn1);
		eb12=(Button)findViewById(R.id.button1);
		eb12.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View arg0) {
 
			  if(rb1.isChecked())
			  {
				Toast.makeText(getBaseContext(),"Correct!!",Toast.LENGTH_SHORT).show();
				Easy1.ec1++;
  
			  }
			  else
			  {
					Toast.makeText(getBaseContext(),"Wrong!!. The correct answer was 6561",Toast.LENGTH_SHORT).show();

			  }
				Intent i = new Intent(Easy1.this,Easy2.class);
			    startActivity(i);
			    
 
			}
 
		});
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_easy1, menu);
		return true;
	}

}
