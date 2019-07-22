package ajab_gajab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Car{
	int speed;
	int x;
	int y;
	float time;
	
	public Car(int speed, int x, int y) {
		this.speed = speed;
		this.x = x;
		this.y = y;
		this.time =  (float) (Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2)) / this.speed);
	}
}

/*
 *  5

	5 12 1
	
	16 63 5
	
	-10 24 2
	
	7 24 2
	
	-24 7 2
 */

public class Collision {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		HashMap<Float,Integer> hm = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String str[] = bf.readLine().split(" ");
			float time = new Car(Integer.parseInt(str[2]),Integer.parseInt(str[0]),Integer.parseInt(str[1])).time;
			
			if (hm.containsKey(time)) {
				hm.put(time, hm.get(time)+1);
			}
			else {
				hm.put(time, 1);
			}
		}
		
		int coll = 0;
		for (Map.Entry<Float,Integer> ent : hm.entrySet()) {
			if (ent.getValue() > 1) {
				int val = ent.getValue();
				
				coll += ((val-1)*(val))/2;
			}
		}
		
		System.out.println(coll);
	}

}
