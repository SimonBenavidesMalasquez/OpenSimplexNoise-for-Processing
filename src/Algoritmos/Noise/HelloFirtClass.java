
// ----------------------------------------------------------------------------------------------------
// PROGRAMA : CREACION DE LIBRERIA EN PROCESSING
// AUTOR    : SIMON
// FECHA    : 10 MAY 2022
// DESCRIP. : USAR ESTA PLANTILLA CONFIGURADA EN MAC 
// ----------------------------------------------------------------------------------------------------

/*
   1. USAR GitHub , crear nuevo repositorio en escritorio
   2. Copiar archivos de la plantilla OpenSimpleNoise-for-Processing a nuevo repositorio
   3. Usar proyecto en eclipse 
*/


package Algoritmos.Noise;

import processing.core.*; 

/**
 * This is a template class and can be used to start a new processing Library.
 * Make sure you rename this class as well as the name of the example package
 * 'template' to your own Library naming convention.
 * 
 * (the tag example followed by the name of an example included in folder
 * 'examples' will automatically include the example in the javadoc.)
 *
 * @example Hello
 */

public class HelloFirtClass {

	// myParent is a reference to the parent sketch
	PApplet myParent;

	int myVariable = 0;

	public final static String VERSION = "##library.prettyVersion##";

	/**
	 * a Constructor, usually called in the setup() method in your sketch to
	 * initialize and start the Library.
	 * 
	 * @example Hello
	 * @param theParent the parent PApplet
	 */
	public HelloFirtClass(PApplet theParent) {
		myParent = theParent;
		welcome();
	}

	private void welcome() {
		System.out.println("##library.name## ##library.prettyVersion## by ##author##");
	}

	public String sayHello() {
		return "hello library.";
	}

	/**
	 * return the version of the Library.
	 * 
	 * @return String
	 */
	public static String version() {
		return VERSION;
	}

	/** 
	 * 
	 * @param theA the width of test
	 * @param theB the height of test
	 */
	public void setVariable(int theA, int theB) {
		myVariable = theA + theB;
	}

	/**
	 * 
	 * @return int
	 */
	public int getVariable() {
		return myVariable;
	}

}
