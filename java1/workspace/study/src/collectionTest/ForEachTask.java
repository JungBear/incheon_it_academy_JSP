package collectionTest;

public class ForEachTask {

	public static void main(String[] args) {
		/*
		 * 각 학생의 총점과 평균을 출력하기
		 * 
		 */
		
		int[][] scores = {{100, 80, 60},{40, 77, 30}};
		
		int total = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int[] score : scores) {
			for(int s : score) {
				total += s;
			}
			count += score.length;
		}
		avg = (double)total / count;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

	}

}
