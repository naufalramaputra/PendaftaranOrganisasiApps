package id.sch.smktelkom_mlg.tugas01.xiirpl1022.pendaftaranorganisasi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etHP;
    Spinner spKelas;
    RadioGroup rgOrgan;
    RadioButton rbOsis;
    CheckBox cbTertarik, cbTantangan, cbPengalaman, cbIkut;
    TextView tvNama, tvKelas, tvOrgan, tvHP, tvAlasan;
    LinearLayout layoutmiss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etHP = (EditText) findViewById(R.id.editTextHp);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        rgOrgan = (RadioGroup) findViewById(R.id.radioGroupOrgan);
        rbOsis = (RadioButton) findViewById(R.id.radioButtonOsis);
        cbTertarik = (CheckBox) findViewById(R.id.checkBoxTertarik);
        cbTantangan = (CheckBox) findViewById(R.id.checkBoxTantangan);
        cbPengalaman = (CheckBox) findViewById(R.id.checkBoxPengalaman);
        cbIkut = (CheckBox) findViewById(R.id.checkBoxIkut);
        tvNama = (TextView) findViewById(R.id.textViewNama);
        tvKelas = (TextView) findViewById(R.id.textViewKelas);
        tvOrgan = (TextView) findViewById(R.id.textViewOrgan);
        tvHP = (TextView) findViewById(R.id.textViewHP);
        tvAlasan = (TextView) findViewById(R.id.textViewAlasan);
        layoutmiss = (LinearLayout) findViewById(R.id.layoutmiss);


        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
        findViewById(R.id.buttonReset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doReset();
            }
        });

    }


    private void doClick() {
        findViewById(R.id.layoutmiss).setVisibility(View.VISIBLE);

        if (etValid()) {

            //Output nama dan no HP
            String nama = etNama.getText().toString();
            int nohp = Integer.parseInt(etHP.getText().toString());

            tvNama.setText("Nama\t: " + nama);
            tvHP.setText("No HP\t: " + nohp);
        } else {
            Clean();
        }

        //output Kelas
        tvKelas.setText("Kelas\t:\t" + spKelas.getSelectedItem().toString());

        //String radio;

        RadioButton rb = (RadioButton) findViewById(rgOrgan.getCheckedRadioButtonId());
        String radio = rb.getText().toString();
        tvOrgan.setText("Organisasi yang dipilih\t:\t" + radio);

        //Output Alasan yang dipilih
        String al = "Alasan karena ikut organisasi\t:\n";
        int startlen = al.length();
        if (cbTertarik.isChecked()) al += cbTertarik.getText() + "\n";
        if (cbTantangan.isChecked()) al += cbTantangan.getText() + "\n";
        if (cbPengalaman.isChecked()) al += cbPengalaman.getText() + "\n";
        if (cbIkut.isChecked()) al += cbIkut.getText() + "\n";

        if (al.length() == startlen) al += "Null";
        tvAlasan.setText(al);


    }

    private void doReset() {

        Clean();
        etNama.setText("");
        etHP.setText("");
        rbOsis.isFocusable();
        findViewById(R.id.layoutmiss).setVisibility(View.GONE);
    }


    private void Clean() {
        tvNama.setText("");
        tvKelas.setText("");
        tvOrgan.setText("");
        tvHP.setText("");
        tvAlasan.setText("");

    }


    private boolean etValid() {
        boolean valid = true;
        String nama = etNama.getText().toString();
        String nohp = etHP.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Tidak boleh kosong!");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Minimal 3 karakter!");
            valid = false;
        } else {
            etNama.setError(null);
        }

        if (nohp.isEmpty()) {
            etHP.setError("Tidak boleh kosong!");
            valid = false;
        } else if (nohp.length() > 12) {
            etHP.setError("Maksimal 12 karakter!");
            valid = false;
        } else {
            etHP.setError(null);
        }

        return valid;
    }

}

