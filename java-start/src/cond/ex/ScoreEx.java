package cond.ex;

public class ScoreEx {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("학점 A");
		}else if(score >= 80) {
			System.out.println("학점 B");
		}else if(score >= 70) {
			System.out.println("학점 C");
		}else if(score >= 60) {
			System.out.println("학점 D");
		}else {
			System.out.println("학점 F");
		}
	}

}
