import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ZipfsLaw {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer initialInput = new StringTokenizer(br.readLine());
		// number of songs
		int n = Integer.parseInt(initialInput.nextToken());
		// number of songs to show
		int m = Integer.parseInt(initialInput.nextToken());

		ArrayList<Song> songList = new ArrayList<Song>();

		for (int i = 0; i < n; i++) {
			StringTokenizer songInput = new StringTokenizer(br.readLine());
			// how many times song n was played
			long play = Long.parseLong(songInput.nextToken());
			// name of the song
			String name = songInput.nextToken();
			songList.add(new Song(play, name, (i + 1)));
			songList.get(i).setQuality(songList.get(i).getAmount() * (i + 1));
		}

		Collections.sort(songList);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			sb.append(songList.get(i) + "\n");
		}

		System.out.println(sb.toString());
	}
}
