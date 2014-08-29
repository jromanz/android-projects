package pe.demo.registro.activity;

import pe.demo.registro.R;
import pe.demo.registro.dao.AlumnoDAO;
import pe.demo.registro.helper.FormularioHelper;
import pe.demo.registro.modelo.Alumno;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class FormularioActivity extends Activity {

	private FormularioHelper helper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formulario);

		helper = new FormularioHelper(this);

		Button btnGrabar = (Button) findViewById(R.id.btnGrabar);
		btnGrabar.setOnClickListener(new BtnGrabarListener());
	}

	public class BtnGrabarListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Alumno alumno = helper.guardaAlumnoDeFormulario();
			AlumnoDAO alumnoDAO = new AlumnoDAO(FormularioActivity.this);
			alumnoDAO.guardar(alumno);
			alumnoDAO.close();
			finish();
			Toast.makeText(FormularioActivity.this,
					"Objeto creado: " + alumno.getName(), Toast.LENGTH_SHORT)
					.show();
		}

	}
}
