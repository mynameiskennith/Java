package GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class MouseListenerInterfaceDemo implements MouseListener,MouseMotionListener{
JFrame f;
	public MouseListenerInterfaceDemo(){
		f=new JFrame();
		f.addMouseListener(this); // link the frame with ML
		f.addMouseMotionListener(this);
	    f.setSize(500,300); f.setVisible(true);}
	//the area where the contents of the JFrame is being displayed is actually the "content pane",and not contents of the JFrame itself.
	// to change the color of Frame,actually changes the property of "content pane* 
	public void mousePressed(MouseEvent e){
		f.getContentPane().setBackground(Color.CYAN);
		System.out.println("Mouse is Pressed");}
	public void mouseReleased(MouseEvent e){
		f.getContentPane().setBackground(Color.red);
	    System.out.println("Mouse is Released");}
	public void mouseClicked(MouseEvent e){
	   // setBackground(Color.green);
		f.getContentPane().setBackground(Color.GREEN);
	    System.out.println("Mouse is Clicked");	}
	public void mouseEntered(MouseEvent e){
		f.getContentPane().setBackground(Color.darkGray);
	    System.out.println("Mouse is Entered");	}
	public void mouseExited(MouseEvent e){
		f.getContentPane().setBackground(Color.magenta);
		System.out.println("Mouse is Exited");}
	public void mouseMoved(MouseEvent e) {
		Graphics g = f.getGraphics();
		g.setColor(Color.white);
		g.fillOval(e.getX(),e.getY(), 5, 5);
	}
	public void mouseDragged(MouseEvent e) {
		Graphics g = f.getGraphics();
		g.setColor(Color.black);
		g.fillOval(e.getX(), e.getY(), 5,5);
		System.out.println(e);
	}
	public static void main(String args[]){
	     new MouseListenerInterfaceDemo();
	     }}