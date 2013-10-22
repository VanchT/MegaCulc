package com.tolkachov.megacalculator;

import com.tolkachov.megacalculator.R;
import com.tolkachov.megacalculator.R.id;
import com.tolkachov.megacalculator.R.layout;
import com.tolkachov.megacalculator.R.menu;
import com.tolkachov.megacalculator.simplecalc.SimpleCalcActivity;
import com.tolkachov.megacalculator.supercalc.SuperCalcActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		((TextView)findViewById(R.id.btn_simple_calc)).setOnClickListener(this);
		((TextView)findViewById(R.id.btn_super_calc)).setOnClickListener(this);
		((TextView)findViewById(R.id.btn_expression_calc)).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.btn_simple_calc:
			intent = new Intent(getApplicationContext(), SimpleCalcActivity.class);
			break;
			
		case R.id.btn_super_calc:
			intent = new Intent(getApplicationContext(), SuperCalcActivity.class);
			break;
			
		case R.id.btn_expression_calc:
			intent = new Intent(getApplicationContext(), SuperCalcActivity.class);
			break;
			
		default:
			break;
		}
		
		startActivity(intent);
	}

}
