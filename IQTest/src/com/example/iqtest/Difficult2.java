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

public class Difficult2 extends Activity {

	RadioButton rb1;
	RadioButton rb2;
	RadioButton rb3;
	RadioButton rb4;
	Button db23;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_difficult2);
		db23=(Button)findViewById(R.id.button1);
		rb2=(RadioButton)findViewById(R.id.rbtn2);
		db23.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View arg0) {
 
				 if(rb2.isChecked())
				    {
				    	Toast.makeText(getBaseContext(), "Correct",Toast.LENGTH_SHORT).show();
				    	Difficult1.dc1++;
				    }
				    else
				    {
				    	Toast.makeText(getBaseContext(), "Wrong!! The correct answer was Plutocracy",Toast.LENGTH_SHORT).show();
				    }
				Intent i = new Intent(Difficult2.this,Difficult3.class);
			    startActivity(i);
 
			}
 
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_difficult2, menu);
		return true;
	}

}
