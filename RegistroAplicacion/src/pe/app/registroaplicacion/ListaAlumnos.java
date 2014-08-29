package pe.app.registroaplicacion;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListaAlumnos extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listade_alumnos);

		String[] nombres = { "Elias", "Camila", "Felipe", "Ines", "Deborah",
				"Maria" };

		int layout = android.R.layout.simple_list_item_1;
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, layout,
				nombres);

		ListView lista = (ListView) findViewById(R.id.lista);
		lista.setAdapter(adapter);

		lista.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View view,
					int position, long id) {
				Toast.makeText(ListaAlumnos.this,
						"Click en la posicion: " + position, Toast.LENGTH_LONG)
						.show();
			}
		});

		lista.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> adapter, View view,
					int position, long id) {
				Toast.makeText(ListaAlumnos.this,
						"Click largo "+ adapter.getItemIdAtPosition(position) +" en la posici�n: "+ position,
						Toast.LENGTH_SHORT).show();
				return false;
			}

		});
	}

}
