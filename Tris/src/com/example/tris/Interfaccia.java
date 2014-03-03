package com.example.tris;

import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import com.example.tris.controllo;

public class Interfaccia {

	private int i;
	private char campo[][]=new char[3][3];
	
	public void set_campo(char pc[][])
	{
		campo=pc;
	}
	
	public void testoBottone(TextView casella,Button btn,int n1,int n2)
	{
		//se la i è pari metterà "X" altrimenti "O"
		controllo control=new controllo();
		
		if(campo[n1][n2]!=' ')
		{
			Log.i("Errore", "Non puoi sovrascrivere una mossa del tuo avversario");
		}
		else
		{
			if(i%2==0)
			{
				campo[n1][n2]='X';
				casella.setText("g2");
			}
			else
			{
				campo[n1][n2]='O';
				casella.setText("g1");
			}
			i++;
		}
		btn.setText(""+campo[n1][n2]);
		
		//controlli di vittoria//
		if(control.controlli()==1)
			Log.i("Fine partita!!", "vittoria del g1");
		
		if(control.controlli()==2)
			Log.i("Fine partita!!", "vittoria del g2");

	}
	}

