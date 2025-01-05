import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Integer> candidates = new HashMap<>();
		
		while(true) {
			String name = br.readLine();
			if(name.equals("***")) break;
			
			candidates.put(name, candidates.getOrDefault(name, 0)+1);
		}
		
		int max = 0;
		for(Map.Entry<String, Integer> candidate : candidates.entrySet()) {
			int votes = candidate.getValue();
			if(max < votes) 
				max = votes;
			
		}
		
		ArrayList<String> topCandidates = new ArrayList<>();
		for(Map.Entry<String, Integer> candidate : candidates.entrySet()) {
			int votes = candidate.getValue();
			if(votes == max) 
				topCandidates.add(candidate.getKey());
		}
		
		if(topCandidates.size() == 0 || topCandidates.size() >= 2)
			bw.write("Runoff!");
		else 
			bw.write(topCandidates.get(0));
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}
