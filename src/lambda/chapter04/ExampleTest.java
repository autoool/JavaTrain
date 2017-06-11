package lambda.chapter04;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import lambda.LambdaTest;
import lambda.chapter01.Album;
import lambda.chapter01.Artist;

public class ExampleTest {
	
	@Test
	public void test512(){
		List<Artist> list = LambdaTest.getArtists();
		String result = list.stream()
				.map(Artist::getName)
				.collect(Collectors.joining(", ","[","]"));
		System.out.println(result);
	}
	
	/**
	 * 每个艺术家专辑数量简单方法
	 */
	@Test
	public void test513(){
		List<Album> albums = new ArrayList<>();
		Map<Artist, List<Album>> albumsByArtist = 
				albums.stream().collect(Collectors.groupingBy(
						album->album.getMainMusician()));
		Map<Artist, Integer> numberOfAlbums = new HashMap<>();
		Map<Artist, List<String>> namesOfAlbums = new HashMap<>();
		
		for(Entry<Artist, List<Album>> entry:albumsByArtist.entrySet()){
			numberOfAlbums.put(entry.getKey(), entry.getValue().size());
			
			//515
			namesOfAlbums.put(entry.getKey(), entry.getValue()
					.stream()
					.map(Album::getName)
					.collect(Collectors.toList()));
			
//			List<String> names = new ArrayList<>();
//			for(Album item:entry.getValue()){
//				names.add(item.getName());
//			}
//			namesOfAlbums.put(entry.getKey(), names);
		}
	}
	//514 看不懂了 = =
	public Map<Artist, Long> numberOfAlbums(Stream<Album> albums) {
		return albums.collect(Collectors.groupingBy(
				album->album.getMainMusician(),
				Collectors.counting()));
	}
	
	
}
