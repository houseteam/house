package com.example.tris;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.tris.controllo;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//--dichiarazione campo
		char campo[][]=new char[3][3];
		
		//-- dichiarazione casella di testo(g1,g2)
		final TextView casella=(TextView)findViewById(R.id.textView2);
		
		//--settaggio campo nella classe controllo e settaggio
		final controllo control = new controllo();
		control.set_dati(campo);
		
		//--settaggio campo nella classe interfaccia e settaggio
		final Interfaccia i = new Interfaccia();
		i.set_campo(campo);
		
		//--DICHIARAZIONE BOTTONI--//
		final Button btn1=(Button)findViewById(R.id.button1);
		final Button btn2=(Button)findViewById(R.id.button2);
		final Button btn3=(Button)findViewById(R.id.button3);
		
		final Button btn4=(Button)findViewById(R.id.button4);
		final Button btn5=(Button)findViewById(R.id.button5);
		final Button btn6=(Button)findViewById(R.id.button6);
		
		final Button btn7=(Button)findViewById(R.id.button7);
		final Button btn8=(Button)findViewById(R.id.button8);
		final Button btn9=(Button)findViewById(R.id.button9);
		//--FINE DICHIARAZIONE--//
		
		//pulisce la matrice il primo turno
			for(int k=0;k<3;k++)
			{
				for(int j=0;j<3;j++)
				{
					campo[k][j]=' ';
				}
			}
		
		//--inizio click listener dei bottoni--//
		 btn1.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {//azioni da eseguire al tocco 
            	 i.testoBottone(casella,btn1, 0,0);}
         });  
		 
		 btn2.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
                 i.testoBottone(casella,btn2,0,1);}
         });
		 
		 btn3.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(casella,btn3,0,2);}
         });
		 
		 btn4.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(casella,btn4,1,0);}
         });
		 
		 btn5.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(casella,btn5,1,1);}
         });
		 
		 btn6.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(casella,btn6,1,2);}
         });
		 
		 btn7.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(casella,btn7,2,0);}
         });
		 
		 btn8.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(casella,btn8,2,1);}
         });
		 
		 btn9.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(casella,btn9,2,2);} 
         });
		 //--fine listener--//
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
