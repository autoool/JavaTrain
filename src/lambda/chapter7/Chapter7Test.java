package lambda.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lambda.LambdaTest;
import lambda.chapter01.Album;

public class Chapter7Test {
	
	List<Album> albums = LambdaTest.getAlbums();
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.stream()
		.map(item->item.toUpperCase())
		.collect(Collectors.<String>toList());
	}
	
	//每首曲目长度
	public long countRunningTime() {
		return albums.stream()
				.mapToLong(album->album.getTracks()
						.mapToLong(track->track.getLength())
						.sum())
				.sum();
	}
	
	public static List<String> elementFirstToUpperCase(List<String> words) {
		return words.stream()
				.map(Chapter7Test::firstToUppercase)
				.collect(Collectors.<String>toList());
	}
	
	public static String firstToUppercase(String value) {
		char firstChar = Character.toUpperCase(value.charAt(0));
		return firstChar + value.substring(1);
	}
	
	
	
}
