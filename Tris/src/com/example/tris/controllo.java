package com.example.tris;

public class controllo {
private int i, j, t, k;
private int r=3;
private int c=3;
private char m[][];
public void set_dati(char pm[][])
{
	m=new char[r][c];
        m=pm;
}
public int controlli()
{
	//se questo metodo restituisce:
	//1 il giocatore X vince
	//2 il giocatore O vince
	//0 la parita prosegue
	
	t=0;
	//contatore per verificare un tris
	
	//controllo di un tris orizzontale
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(m[i][j]=='X')
			{
				t++;
				if(t==3)
				{
					return (1);
				}}
			if(m[i][j]=='O')
			{
				t++;
				if(t==3)
				{
					return (2);
				}}
			}}
	
	//controllo di un tris verticale
	for(j=0;j<c;j++)
	{
		for(i=0;i<r;i++)
		{
			if(m[i][j]=='X')
			{
				t++;
				if(t==3)
				{
					return (1);
				}}
			if(m[i][j]=='O')
			{
				t++;
				if(t==3)
				{
					return (2);
				}}
			}}
	
	//controllo di un tris obliquo ij 00
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(m[i][i]=='X')
			{
				t++;
				if(t==3)
				{
					return (1);
				}}
			if(m[i][i]=='O')
			{
				t++;
				if(t==3)
				{
					return (2);
				}}
			}}
			
	//controllo di un tris obliquo ij 20
	i=2;
	j=0;
	for(k=0;i<3;k++)
	{
		if(m[i][j]=='X')
			{
				t++;
				if(t==3)
				{
					return (1);
				}}
			if(m[i][j]=='O')
			{
				t++;
				if(t==3)
				{
					return (2);
				}}
		i--;
		j++;
	}
        
        //la parita continua
        return (0);
}}
			
	
			
