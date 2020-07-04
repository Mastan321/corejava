package jlc.programs;

public class Test739 {
	public static void main(String[] args) {
		Hello739 h=new Hello739();
		h.sum(20,22,55,44);
		h.sum(new int[] {1,2});

	}
}

class Hello739 {
	int s = 0;

	void sum(int... arr) {
		System.out.println(arr.length);
		for (int i : arr) {
			System.out.println(i);
		}

	}
}