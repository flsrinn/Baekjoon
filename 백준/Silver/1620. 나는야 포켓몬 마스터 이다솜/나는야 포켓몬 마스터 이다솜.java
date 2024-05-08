import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static boolean isNumber(String answer) {
        try {
            Integer.parseInt(answer);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strings = br.readLine();
        String[] string = strings.split(" ");
        int pokemonCount = Integer.parseInt(string[0]);
        int answerCount = Integer.parseInt(string[1]);

        HashMap<Integer, String> pokemons = new HashMap<>();
        HashMap<String, Integer> reversePokemons = new HashMap<>();
        for (int i=0; i<pokemonCount; i++) {
            String pokemon = br.readLine();
            pokemons.put(i+1, pokemon);
            reversePokemons.put(pokemon, i+1);
        }

        for (int i=0; i<answerCount; i++) {
            String answer = br.readLine();
            if(isNumber(answer)) {
                bw.write(pokemons.get(Integer.parseInt(answer)) + "\n");
            }
            else {
                bw.write(reversePokemons.get(answer) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
