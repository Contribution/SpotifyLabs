public class Song implements Comparable<Song> {

	private long listenedToAmount;
	private int trackNumber;
	private String name;
	private long quality;

	/**
	 * Constructs a Song object.
	 * 
	 * @param listenedToAmount
	 *            The amount of times a song was played on an album.
	 * @param name
	 *            The name of the song.
	 * @param trackNumber
	 *            The numerical value in which a song appears on an album.
	 */
	public Song(long listenedToAmount, String name, int trackNumber) {
		this.listenedToAmount = listenedToAmount;
		this.name = name;
		this.trackNumber = trackNumber;
		this.quality = 0;
	}

	/**
	 *
	 * @return The song name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @return The amount of times a song has been played.
	 */
	public long getAmount() {
		return this.listenedToAmount;
	}

	/**
	 * 
	 * @param l
	 *            The value to set the quality property of a song to.
	 */
	public void setQuality(long l) {
		this.quality = l;
	}

	/**
	 * 
	 * @return The quality of the song.
	 */
	public long getQuality() {
		return this.quality;
	}

	/**
	 * 
	 * @return The track number of the song.
	 */
	public int getTrackNumber() {
		return this.trackNumber;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Song s) {

		if (this.quality > s.getQuality()) {
			return -1;
		}

		if (s.getQuality() > this.quality) {
			return 1;
		}

		if (this.trackNumber < s.getTrackNumber()) {
			return -1;
		}

		return 1;

	}

}
