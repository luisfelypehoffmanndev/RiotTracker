package com.riottracker;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RiotClientApi {

    private final String API_KEY;
    private static final String BASE_URL = "https://br1.api.riotgames.com";
    private final HttpClient client;
    private final ObjectMapper mapper = new ObjectMapper();

    public RiotClientApi(String API_KEY) {
        this.API_KEY = API_KEY;
        this.client = HttpClient.newHttpClient();
    }

    public ChallengerLeague getChallenger() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/lol/league/v4/challengerleagues/by-queue/RANKED_SOLO_5x5"))
                .header("X-Riot-Token", API_KEY)
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ApiResponse apiResponse = new ApiResponse(response);
        ChallengerLeague league = new ChallengerLeague();
        if (apiResponse.isSuccess()) {
            league = mapper.readValue(response.body(), ChallengerLeague.class);
            return league;
        } else {
            errorHandler(apiResponse);
            return null;
        }
    }

    public static void errorHandler(ApiResponse response) {
        if (!response.isSuccess()) {
            switch (response.getStatusCode()) {
                case 401 -> System.err.println("API Key inválida ou ausente!");
                case 403 -> System.err.println("Acesso negado!");
                case 404 -> System.err.println("Recurso não encontrado!");
                case 429 -> System.err.println("Rate limit atingido!");
                case 500 -> System.err.println("Erro interno da Riot API!");
                default -> System.err.println("Erro inesperado: " + response.getStatusCode());
            }
        }
    }

}
