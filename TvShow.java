public class TvShow {
    private final String title;
    private final int episodeCount;
    private final String genre;

    public TvShow(String title, int episodeCount, String genre) {
        this.title = title;
        this.episodeCount = episodeCount;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public String getGenre() {
        return genre;
    }
    @Override
    public String toString() {
        return "The name of the show is " + title + " with " + episodeCount + " number of episodes. the genre is "
                + genre;
    }
}
