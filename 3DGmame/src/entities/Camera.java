package entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Vector3f;

public class Camera {
	private Vector3f position = new Vector3f(10,5,100);
	private float pitch = 10;
	private float yaw;
	private float roll;
	
	public Camera() {
		
	}
	
	public void move() {
		//System.out.println(position.x);
		//System.out.println(position.y);
		//System.out.println(position.z);
		if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
			position.z -= 1f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
			position.z += 1f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
			position.x += 1f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
			position.x -= 1f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_Q)) {
			position.y -= 1f;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_E)) {
			position.y += 1f;
		}
		
	}

	public Vector3f getPosition() {
		return position;
	}

	public float getPitch() {
		return pitch;
	}

	public float getYaw() {
		return yaw;
	}

	public float getRoll() {
		return roll;
	}

}
