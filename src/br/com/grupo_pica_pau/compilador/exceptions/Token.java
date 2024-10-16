package br.com.grupo_pica_pau.compilador.exceptions;

public class Token {
	public static final int TK_Space        = -1;
	public static final int TK_IDENTIFIER   = 0;
	public static final int TK_NUMBER       = 1;
	public static final int TK_CHARACTER    = 2;
	public static final int TK_PONTUATION   = 3;
	public static final int TK_ASSIGN       = 4;
	public static final int TK_OPAritmetric = 5;
	public static final int TK_CEsp         = 6;
	public static final int TK_CResv        = 7;
	public static final int TK_Float        = 8;
	public static final int TK_Integrantes  = 9;
	

	private int type;
	private String text;
	private String nome;

	public Token(int type, String text) {
		super();
		this.type = type;
		this.text = text;
	}

	public Token() {
		super();
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	@Override
	public String toString() {
		return "Token type= " + type + " - "+ nome +" -  text= " + text;
	}

}
