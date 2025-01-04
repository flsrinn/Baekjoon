import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] counts = br.readLine().split(" ");
		int M = Integer.parseInt(counts[0]);
		int F = Integer.parseInt(counts[1]);
		
		ArrayList<Animal> animals = new ArrayList<>();
		ArrayList<Animal> bulls = new ArrayList<>();
		int totalId = 0;
		for (int i = 0; i < M; i++) {
		    String bull = br.readLine();
		    Animal a = new Animal(bull, totalId++);
		    bulls.add(a);
		    animals.add(a);
		}
		
		ArrayList<Animal> cows = new ArrayList<>();
		for (int i = 0; i < F; i++) {
		    String cow = br.readLine();
		    Animal a = new Animal(cow, totalId++);
		    cows.add(a);
		    animals.add(a);
		}
		
		for(Animal bull : bulls) {
			
			for(Animal cow : cows) {
				int count = 0;
				
				for(Animal animal : animals) {
					// 부모의 DNA일 경우 건너뛰기 
					if(animal.id == cow.id || animal.id == bull.id) continue;
					
					// 자식일 경우 true, 아닐 경우 false
					boolean isMatch = true;
					for(int i=0; i<25; i++) {
						// cow, bull 중에 DNA가 하나도 일치하지 않을 경우 
						if(animal.DNA.charAt(i) != cow.DNA.charAt(i) && 
								animal.DNA.charAt(i) != bull.DNA.charAt(i)) {
							isMatch = false;
							break;
						}
					}
					
					// 자식일 경우 count 값 증가 
					if(isMatch) count++;
				}
				
				sb.append(count).append(" ");
			}
			
			sb.append("\n");
		}
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
}

class Animal {
	String DNA;
	int id;
	
	Animal(String DNA, int id) {
		this.DNA = DNA;
		this.id = id;
	}
}
