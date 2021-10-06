package Section_8_exercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album_ex46 {
    private String name, artist;
    private ArrayList<Song_ex46> songs;

    public Album_ex46(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songName, double songDuration) {
        if (findSong(songName) != null)
            return false;
        Song_ex46 newSong = new Song_ex46(songName, songDuration);
        if (songs.add(newSong))
            return true;
        else
            return false;
    }

    private Song_ex46 findSong(String songName) {
        Song_ex46 songToreturn = null;
        for (Song_ex46 song : songs) {
            if (song.getTitle().equals(songName))
                songToreturn = song;
        }
        return songToreturn;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song_ex46> playlist) {
        if (trackNumber >= songs.size() || trackNumber < 0)
            return false;
        Song_ex46 song = songs.get(trackNumber);
        if (playlist.add(song))
            return true;
        else
            return false;
    }

    public boolean addToPlaylist(String songName, LinkedList<Song_ex46> playlist) {
        if (findSong(songName) == null)
            return false;
        Song_ex46 song = findSong(songName);
        if(playlist.add(song))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        ArrayList<Album_ex46> albums = new ArrayList<>();

        Album_ex46 album = new Album_ex46("Stormbringer", "Deep Purple");
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

        album = new Album_ex46("For those about to rock", "AC/DC");
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

}