package edu.ucsb.cs56.drawings.koa.sato.advanced;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   A component that draws a picture of Cars and RaceCars by Koa Sato
   
   @author Koa Sato
   @version CS56, F16, UCSB
*/


public class MultiPictureComponent extends JComponent
{  
    private int whichPicture = 0;
    
    public MultiPictureComponent(int whichPicture) {
	this.whichPicture = whichPicture;
    }
    
    /** The paintComponent method is always required if you want
     * any graphics to appear in your JComponent.    
     * 
     * There is a paintComponent
     * method that is created for you in the JComponent class, but it
     * doesn't do what we want, so we have to "override" that method with
     * our own method.  
     */
    
    public void paintComponent(Graphics g)
    {  
	Graphics2D g2 = (Graphics2D) g;
	switch (this.whichPicture) {
	case 1:
	    AllMyDrawings.drawPicture1(g2);
	    break;
	case 2:
	    AllMyDrawings.drawPicture2(g2);
	    break;
	case 3:
	    AllMyDrawings.drawPicture3(g2);
	    break;
	default:
	    throw new IllegalArgumentException("Unknown value for whichPicture in MultiPictureComponent" + this.whichPicture);
	} // switch
    } // paintComponent
}