import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//±×·¡ÇÈ

public class ElevatorController extends Subject {
	private int currentFloor = 1;
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void gotoFloor(int destination) {
		currentFloor = destination;
		notifyObservers();
	}
	
	public int getCurFloor() {
		return currentFloor;
	}

}
