public class Music {
  //Class to keep track of music 
  //CMP112 Ryan Slipher 13 February 2015

  String album;
  String artist;
  String genre;
  String media;
  String location;
  int copies;

/*--------------------------------------------------------------------------*/

  Music() {
    album = "No album";
    artist = "No artist";
    genre = "No genre";
    media = "None";
    location = "Nowhere";
    copies = 0;
    }

  public String toString() {
    String output = "";
    output = "Album: " + album + " Artist: " + artist + " Genre: " + genre + " Media: " + media + " Location: " + location + " Copies: " + copies;
    return output;
    }
} 
