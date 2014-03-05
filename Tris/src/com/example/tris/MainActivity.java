package com.example.tris;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
				
		//--settaggio campo nella classe interfaccia e settaggio caselle e matrice
		final Interfaccia i = new Interfaccia();
		i.set_campo((TextView)findViewById(R.id.textView1),(TextView)findViewById(R.id.textView2),(TextView)findViewById(R.id.textView3));
		
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
		
		final Button btnClear=(Button)findViewById(R.id.button10);
		//--FINE DICHIARAZIONE--//
		
		i.clearScreen(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
		
		//bottone azzera matrice, contatore e bottoni
		btnClear.setOnClickListener(new View.OnClickListener(){  
            @Override  
            public void onClick(View arg0) {//azioni da eseguire al tocco 
            	i.clearScreen(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);}
        });
		
		//--inizio click listener dei bottoni--//
		 btn1.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {//azioni da eseguire al tocco 
            	 i.testoBottone(btn1, 0,0);}
         });  
		 
		 btn2.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
                 i.testoBottone(btn2,0,1);}
         });
		 
		 btn3.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(btn3,0,2);}
         });
		 
		 btn4.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(btn4,1,0);}
         });
		 
		 btn5.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(btn5,1,1);}
         });
		 
		 btn6.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(btn6,1,2);}
         });
		 
		 btn7.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(btn7,2,0);}
         });
		 
		 btn8.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(btn8,2,1);}
         });
		 
		 btn9.setOnClickListener(new View.OnClickListener(){  
             @Override  
             public void onClick(View arg0) {  
            	 i.testoBottone(btn9,2,2);} 
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
