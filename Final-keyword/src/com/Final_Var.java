package com;

public class Final_Var {

	static final int C_STA = 123;

	static final int R_STA;

	static {
		///
		R_STA = 123;
	}

	final int R_INS;

	public Final_Var(int v) {
		this.R_INS = v;
	}

	public static void main(String[] args) {

		final int C_LOC = 12;
		final int R_VAL;
		R_VAL = 123;
		

	}

}
