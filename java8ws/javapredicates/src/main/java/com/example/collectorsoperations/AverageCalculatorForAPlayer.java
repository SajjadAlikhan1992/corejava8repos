package com.example.collectorsoperations;

import com.example.entites.Player;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageCalculatorForAPlayer {

    public static void main(String[] args) {

        List<Player> players = new LinkedList<>();
        players.add(new Player("Rohith Sharma", 100));
        players.add(new Player("Rohith Sharma", 100));
        players.add(new Player("Rohith Sharma", 100));
        players.add(new Player("Rohith Sharma", 100));
        players.add(new Player("Rohith Sharma", 100));

        Double avarageOfRohith = players.stream().collect(Collectors.averagingInt(player -> player.getScore()));
        System.out.println("Avarage batting of Rohith Sharma is -- " + avarageOfRohith);

    }
}
