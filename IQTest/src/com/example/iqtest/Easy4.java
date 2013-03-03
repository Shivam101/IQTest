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

public class Easy4 extends Activity {

	RadioButton rb1;
	RadioButton rb2;
	RadioButton rb3;
	RadioButton rb4;
	Button eb45;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_easy4);
		eb45=(Button)findViewById(R.id.button1);
		rb2=(RadioButton)findViewById(R.id.rbtn2);
		eb45.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View arg0) {
 
				if(rb2.isChecked())
				  {
					  Toast.makeText(getBaseContext(),"Correct!!",Toast.LENGTH_SHORT).show();
					  Easy1.ec1++;
				  }
				  else
				  {
					  Toast.makeText(getBaseContext(),"Wrong!! The correct answer was 4",Toast.LENGTH_SHORT).show();
					
				  }
				Intent i = new Intent(Easy4.this,Easy5.class);
			    startActivity(i);
 
			}
 
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_easy4, menu);
		return true;
	}

}
