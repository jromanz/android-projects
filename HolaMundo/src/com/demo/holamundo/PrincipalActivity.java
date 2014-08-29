package com.demo.holamundo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrincipalActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);

		Button boton = (Button) findViewById(R.id.boton);
		EditText cajita = (EditText) findViewById(R.id.cajita);

		boton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(PrincipalActivity.this, "Boton presionado!",
						Toast.LENGTH_LONG).show();
			}
		});
	}
	
	@Override
	protected void onStart() {
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.i("CICLO DE VIDA","onResume");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i("CICLO DE VIDA","onRestart");		
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.i("CICLO DE VIDA","onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i("CICLO DE VIDA","onStop");
	}
}
