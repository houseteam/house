package com.example.tris;

public class controlli {

	public int control(char m[][])
	{
		/*
		 * Controlli orizzontali X
		 */
		if(m[0][0]=='X' && m[0][1]=='X' && m[0][2]=='X')
			return 1;
		if(m[1][0]=='X' && m[1][1]=='X' && m[1][2]=='X')
			return 1;
		if(m[2][0]=='X' && m[2][1]=='X' && m[2][2]=='X')
			return 1;
		
		/*
		 * Controlli orizzontali O
		 */
		if(m[0][0]=='O' && m[0][1]=='O' && m[0][2]=='O')
			return 2;
		if(m[1][0]=='O' && m[1][1]=='O' && m[1][2]=='O')
			return 2;
		if(m[2][0]=='O' && m[2][1]=='O' && m[2][2]=='O')
			return 2;
		
		/*
		 * Controlli verticali X
		 */
		if(m[0][0]=='X' && m[1][0]=='X' && m[2][0]=='X')
			return 1;
		if(m[0][1]=='X' && m[1][1]=='X' && m[2][1]=='X')
			return 1;
		if(m[0][2]=='X' && m[1][2]=='X' && m[2][2]=='X')
			return 1;
		
		/*
		 * Controlli verticali O
		 */
		if(m[0][0]=='O' && m[1][0]=='O' && m[2][0]=='O')
			return 2;
		if(m[0][1]=='O' && m[1][1]=='O' && m[2][1]=='O')
			return 2;
		if(m[0][2]=='O' && m[1][2]=='O' && m[2][2]=='O')
			return 2;
		
		/*
		 * Controlli obliqui X (alto sx basso dx)
		 */
		if(m[0][0]=='X' && m[1][1]=='X' && m[2][2]=='X')
			return 1;
		
		/*
		 * Controlli obliqui O (alto sx basso dx)
		 */
		if(m[0][0]=='O' && m[1][1]=='O' && m[2][2]=='O')
			return 2;
		
		/*
		 * Controlli obliqui X (alto dx basso sx)
		 */
		if(m[0][2]=='X' && m[1][1]=='X' && m[2][0]=='X')
			return 1;
		
		/*
		 * Controlli obliqui O (alto dx basso sx)
		 */
		if(m[0][2]=='O' && m[1][1]=='O' && m[2][0]=='O')
			return 2;
			
		return 0;
}}