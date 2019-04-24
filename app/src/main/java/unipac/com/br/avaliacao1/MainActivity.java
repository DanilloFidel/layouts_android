package unipac.com.br.avaliacao1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button btnMudar;

  @Override

 protected void  onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);


      Toast.makeText(this,"Tela Inicial", Toast.LENGTH_LONG).show();

      btnMudar = (Button) findViewById(R.id.btnMudar);
      btnMudar.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v){
              Intent i = new Intent(MainActivity.this, Main2Activity.class);
              startActivity(i);

          }


      });







  }
}