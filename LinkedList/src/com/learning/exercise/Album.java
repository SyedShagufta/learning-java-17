package com.learning.exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration)
    {
        Song s = findSong(title);
        if(s!=null){
            return false;
        }
        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title)
    {
        for(Song s: songs){
            if(s.getTitle().equals(title)){
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList)
    {
        if(trackNumber < 1 || trackNumber > songs.size()){
            return false;
        }

        return  playList.add(songs.get(trackNumber-1));

    }

    public boolean addToPlayList(String title, LinkedList<Song> playList)
    {
       if(findSong(title) != null){
           playList.add(findSong(title));
           return true;
       }
       return false;

    }




}
