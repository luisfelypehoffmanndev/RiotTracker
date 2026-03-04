package com.riottracker;

public class App {
    public static void main(String[] args) throws Exception {
        String apiKey = System.getenv("RIOT_API_KEY");
        RiotClientApi client = new RiotClientApi(apiKey);

        ChallengerLeague response = client.getChallenger();

        for (int i = 0; i < 50; i++) {
            ChallengerPlayer player = response.getEntries().get(i);
            System.out.println("Player: " + i);
            System.out.println("Nome: " + player.getSummonerId());
            System.out.println("PuuID: " + player.getPuuid());
            System.out.println("Pontos: " + player.getLeaguePoints());
            System.out.println("Vitórias: " + player.getWins());
            System.out.println("Derrotas: " + player.getLosses());
            System.out.printf("Winrate: %.2f", (float) (100 * (float) player.getWins()
                    / (float) (player.getLosses() + (float) player.getWins())));
            System.out.println("");
            System.out.println("_________________________________________________________________________");
        }

    }
}
