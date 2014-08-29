package pe.demo.listaalumnos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TableLayoutActivity extends Activity {
	
	private Button btnRetornar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_table_layout);
		
		btnRetornar = (Button)findViewById(R.id.botonRetornarTable);
		btnRetornar.setOnClickListener(new TableLayoutListener());
	}
	
	public class TableLayoutListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(TableLayoutActivity.this,ListaAlumnos.class);
			startActivity(intent);
			finish();
		}
		
	}
}
