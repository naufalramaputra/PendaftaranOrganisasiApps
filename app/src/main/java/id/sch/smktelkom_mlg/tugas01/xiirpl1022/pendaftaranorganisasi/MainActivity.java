package id.sch.smktelkom_mlg.tugas01.xiirpl1022.pendaftaranorganisasi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etHP;
    Spinner spKelas;
    RadioGroup rgOrgan;
    CheckBox cbTertarik, cbTantangan, cbPengalaman, cbIkut;
    TextView tvNama, tvKelas, tvOrgan, tvHP, tvAlasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etHP = (EditText) findViewById(R.id.editTextHp);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        rgOrgan = (RadioGroup) findViewById(R.id.radioGroupOrgan);
        cbTertarik = (CheckBox) findViewById(R.id.checkBoxTertarik);
        cbTantangan = (CheckBox) findViewById(R.id.checkBoxTantangan);
        cbPengalaman = (CheckBox) findViewById(R.id.checkBoxPengalaman);
        cbIkut = (CheckBox) findViewById(R.id.checkBoxIkut);
        tvNama = (TextView) findViewById(R.id.textViewNama);
        tvKelas = (TextView) findViewById(R.id.textViewKelas);
        tvOrgan = (TextView) findViewById(R.id.textViewOrgan);
        tvHP = (TextView) findViewById(R.id.textViewHP);
        tvAlasan = (TextView) findViewById(R.id.textViewAlasan);


        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });

    }

    private void doClick() {


    }
}
