import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> pastListeners;
    public Song(String title, String artist){
        this.pastListeners = new ArrayList<>();
        this.title = title;
        this.artist = artist;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int howMany(ArrayList<String> arrayList) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            boolean isNewListener = true;
            for (int e = 0; e < this.pastListeners.size(); e++) {
                if (arrayList.get(i).toLowerCase().equals(pastListeners.get(e).toLowerCase())) {
                    isNewListener = false;
                    break;
                }
            }
            if (isNewListener) {
                pastListeners.add(arrayList.get(i));
                count++;
            }
        }
        return count;
    }
}
