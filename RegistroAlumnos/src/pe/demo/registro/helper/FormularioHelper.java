package pe.demo.registro.helper;

import pe.demo.registro.R;
import pe.demo.registro.activity.FormularioActivity;
import pe.demo.registro.modelo.Alumno;
import android.widget.EditText;
import android.widget.RatingBar;

public class FormularioHelper {
	private EditText nombre;
	private EditText site;
	private EditText direccion;
	private EditText telefono;
	private RatingBar nota;
	private EditText foto;
	private Alumno alumno;
	
	public FormularioHelper(FormularioActivity activity) {
		nombre = (EditText)activity.findViewById(R.id.txtNombre);
		site = (EditText)activity.findViewById(R.id.txtSite);
		direccion = (EditText)activity.findViewById(R.id.txtDireccion);
		telefono = (EditText)activity.findViewById(R.id.txtTelefono);
		nota = (RatingBar)activity.findViewById(R.id.rbNotas);
		alumno = new Alumno();
	}
	
	public Alumno guardaAlumnoDeFormulario(){
		alumno.setName(nombre.getEditableText().toString());
		alumno.setSite(site.getEditableText().toString());
		alumno.setDireccion(direccion.getEditableText().toString());
		alumno.setTelefono(telefono.getEditableText().toString());
		alumno.setNota(nota.getRating());
		return alumno;
	}
}
