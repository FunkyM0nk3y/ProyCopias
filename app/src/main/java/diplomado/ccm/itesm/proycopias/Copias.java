package diplomado.ccm.itesm.proycopias;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;


public class Copias extends Activity {

    private EditText etFrom;
    private EditText etTo;
    private Button btnCopia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copias);
        etFrom = (EditText) findViewById(R.id.editTextFrom);
        etTo = (EditText) findViewById(R.id.editTextTo);
        btnCopia = (Button) findViewById(R.id.buttonCopia);
        btnCopia.setOnClickListener(listenerBtnCopia);
    }

    private View.OnClickListener listenerBtnCopia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strTexto = etFrom.getText().toString();
            Log.d("Copias: ", "el texto que se va a copiar es:" + strTexto);
            etTo.setText(strTexto);
            etFrom.setText("");
        }
    };
    /*
    public void copiaTexto(View view) {
        String strTexto = etFrom.getText().toString();
        Log.d("Copias: ", "el texto que se va a copiar es:" + strTexto);
        etTo.setText(strTexto);
        etFrom.setText("");
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_copias, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
