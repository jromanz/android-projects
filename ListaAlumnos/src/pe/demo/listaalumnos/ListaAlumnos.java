package pe.demo.listaalumnos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ListaAlumnos extends ActionBarActivity {

	private ListView listaAlumnos;
	private Button botoncito;
	private Button linearLayout;
	private Button tableLayout;
	private Button relativeLayout;
	private Button frameLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listade_alumnos);

		botoncito = (Button) findViewById(R.id.boton);
		linearLayout = (Button) findViewById(R.id.linearLayout);
		tableLayout = (Button) findViewById(R.id.tableLayout);
		relativeLayout = (Button) findViewById(R.id.relativeLayout);
		frameLayout = (Button) findViewById(R.id.frameLayout);
		
		String[] nombres = { "Hugo", "Paco", "Luis", "Yo" };
		listaAlumnos = (ListView) findViewById(R.id.lista);

		int layout = android.R.layout.simple_list_item_1;
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				ListaAlumnos.this, layout, nombres);

		listaAlumnos.setAdapter(adapter);

		listaAlumnos.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View view,
					int position, long id) {
				Toast.makeText(ListaAlumnos.this,
						"Position selected: " + position, Toast.LENGTH_SHORT)
						.show();
			}

		});

		listaAlumnos.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> adapter, View view,
					int position, long id) {
				Toast.makeText(
						ListaAlumnos.this,
						"OnClick selected in position"
								+ adapter.getItemIdAtPosition(position),
						Toast.LENGTH_SHORT).show();
				return false;
			}

		});

		botoncito.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ListaAlumnos.this, Formulario.class);
				startActivity(intent);
				finish();
			}
		});

		linearLayout.setOnClickListener(new LinearLayoutListener());
		tableLayout.setOnClickListener(new TableLayoutListener());
		relativeLayout.setOnClickListener(new RelativeLayoutListener());
		frameLayout.setOnClickListener(new FrameLayoutListener());
	}

	public class LinearLayoutListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(ListaAlumnos.this,
					LinearLayoutActivity.class);
			startActivity(intent);
			finish();
		}
	}

	public class TableLayoutListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(ListaAlumnos.this,
					TableLayoutActivity.class);
			startActivity(intent);
			finish();
		}

	}
	public class RelativeLayoutListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(ListaAlumnos.this,
					RelativeLayoutActivity.class);
			startActivity(intent);
			finish();
		}

	}
	
	public class FrameLayoutListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(ListaAlumnos.this,
					FrameLayoutActivity.class);
			startActivity(intent);
			finish();
		}

	}
}
