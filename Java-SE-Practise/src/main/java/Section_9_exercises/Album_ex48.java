package Section_9_exercises;

import Section_8_exercises.Song_ex46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album_ex48 {
    private String name, artist;
    private SongList songs;

    public Album_ex48(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String songName, double songDuration) {
        if (songs.findSong(songName) != null)
            return false;
        Song_ex46 newSong = new Song_ex46(songName, songDuration);
        if (songs.add(newSong))
            return true;
        else
            return false;
    }
/*
    private Song_ex46 findSong(String songName) {
        Song_ex46 songToreturn = null;
        for (Song_ex46 song : songs) {
            if (song.getTitle().equals(songName))
                songToreturn = song;
        }
        return songToreturn;
    }
*/
    public boolean addToPlaylist(int trackNumber, LinkedList<Song_ex46> playlist) {

        Song_ex46 song = songs.findSong(trackNumber);
        if (playlist.add(song))
            return true;
        else
            return false;
    }

    public boolean addToPlaylist(String songName, LinkedList<Song_ex46> playlist) {
        if (songs.findSong(songName) == null)
            return false;
        Song_ex46 song = songs.findSong(songName);
        if(playlist.add(song))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        ArrayList<Album_ex48> albums = new ArrayList<>();

        Album_ex48 album = new Album_ex48("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);

        albums.add(album);

        album = new Album_ex48("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song_ex46> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("You can't do it right", playList);
        albums.get(0).addToPlaylist("Holy man", playList);
        albums.get(0).addToPlaylist("Speed king", playList);  // Does not exist
        albums.get(0).addToPlaylist(9, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(24, playList);  // There is no track 24
        System.out.println(playList.toString());
    }
    public static class SongList{
        private ArrayList<Song_ex46> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }
        private boolean add(Song_ex46 song){
            if(songs.contains(song)){
                return false;
            }
            else{
                songs.add(song);
                return true;
            }
        }
        private Song_ex46 findSong(String songName){
            Song_ex46 songToReturn = null;
            for (Song_ex46 song : songs) {
                if(song.getTitle().equals(songName))
                    songToReturn = song;
            }

            return songToReturn;
        }
        private Song_ex46 findSong(int trackId){
            if(trackId < 0 || trackId >= songs.size()){
                System.out.println("This album does not have a track with id = " + trackId);
                return null;
            }
            else{
                return songs.get(trackId);
            }
        }
    }
}