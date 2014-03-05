package com.example.tris;

import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import com.example.tris.controlli;

public class Interfaccia {

	private int i;
	private char campo[][]=new char[3][3];
	private TextView casella1;
	private TextView casella;
	private TextView log;
	
	public void set_campo(TextView cas,TextView ella,TextView plog)
	{
		casella1=cas;
		casella=ella;
		log=plog;
		
		for(int c=0;c<3;c++)
		{
			for(int j=0;j<3;j++)
			{
				campo[i][j]=' ';
			}
		}
	}
	
	public void testoBottone(Button btn,int n1,int n2)
	{
		//se la i è pari metterà "X" altrimenti "O"
		controlli control=new controlli();
		if(control.control(campo)==0)
		{
			if(campo[n1][n2]==' ')
			{	if(i%2==0)
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
		}
		btn.setText(""+campo[n1][n2]);
		
		//controlli di vittoria//
		
		if(i==9)
			log.setText("Parità");
		
		switch(control.control(campo))
		{
		case 1:
			log.setText("Vittoria X");
			break;
		case 2:
			log.setText("Vittoria O");
		}
			
	}
	
	public void clearScreen(Button btn1,Button btn2,Button btn3,Button btn4,Button btn5,Button btn6,Button btn7,Button btn8,Button btn9)
	{
		btn1.setText(" ");
		btn2.setText(" ");
		btn3.setText(" ");
		btn4.setText(" ");
		btn5.setText(" ");
		btn6.setText(" ");
		btn7.setText(" ");
		btn8.setText(" ");
		btn9.setText(" ");
		i=0;
		casella1.setText("E' il turno del ");
		casella.setText("g1");
		log.setText(" ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				campo[i][j]=' ';
			}
		}
	}
	}

