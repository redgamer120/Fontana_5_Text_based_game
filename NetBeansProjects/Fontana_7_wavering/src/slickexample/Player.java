/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slickexample;

import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 *
 * @author Redgamer120
 */
public class Player {

	public static float x = 64f;

	public static float y = 132f;

	public static int health = 100000;
	
	public static float speed = .2f;

	static float hitboxX = x + 2f;

	static float hitboxY = y + 2f;

	private static int startX, startY, width = 30, height = 30;

	public static Shape rect = new Rectangle(getplayershitboxX(),
			getplayershitboxY(), 32, 32);
	public static float pdelta;

	public static Animation playeranime;

	public static void setpdelta(float somenum) {

		pdelta = somenum;

	}

	public static float getpdelta() {

		return pdelta;

	}

	public static float getplayersX() {

		return x;

	}

	public static float getplayersY() {

		return y;

	}

	public static float getplayershitboxX() {

		return x + 18f;

	}

	public static float getplayershitboxY() {

		return y + 18f;

	}

	public static void setplayershitboxX() {

		hitboxX = getplayershitboxX();

	}

	public static void setplayershitboxY() {

		hitboxY = getplayershitboxY();

	}

}