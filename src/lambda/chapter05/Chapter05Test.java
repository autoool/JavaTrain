package lambda.chapter05;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import lambda.chapter01.Album;
import lambda.chapter01.Artist;

public class Chapter05Test {
	
	public static void main(String[] args) {
		
	}   
	
	
	/**
	 * 找出成员最多的乐队
	 * @param arstits
	 * @return
	 */
	public Optional<Artist> biggestGroup(Stream<Artist> arstits){
		Function<Artist, Long> getCount = arstit->arstit.getMembers().count();
		return arstits.collect(Collectors.maxBy(Comparator.comparing(getCount)));
	}
	
	/**
	 * 找出一组专辑上曲目的平均数
	 * collect 收集结果
	 */
	public double averageNumberOfTracks(List<Album> albums){
		return albums.stream().collect(Collectors.averagingInt(
				album->album.getTrackList().size()));
	}
	
	/**
	 * 将艺术家组成分为乐队和独唱歌手两部分
	 * @param artists
	 * @return
	 */
	public Map<Boolean, List<Artist>> bandsAndSolo(Stream<Artist> artists) {
		return artists.collect(Collectors.partitioningBy(
				artist->artist.isSolo()));
	}
	
	/**
	 * 使用方法引用将艺术家组成分为乐队和独唱歌手两部分
	 */
	public Map<Boolean, List<Artist>> bandsAndSoloRef(Stream<Artist> artists) {
		return artists.collect(Collectors.partitioningBy(
				Artist::isSolo));
	}
	
	//数据分组
	/**
	 * 使用主唱对专辑分组
	 * @param albums
	 * @return
	 */
	public Map<Artist, List<Album>> albumsByArtist(Stream<Album> albums) {
		return albums.collect(Collectors.groupingBy(
				album->album.getMainMusician()));
	}
	
	/**
	 * 艺术家专辑数
	 */
	public Map<Artist, Long> numberOfAlbums(Stream<Album> albums) {
		return albums.collect(Collectors.groupingBy(
				album->album.getMainMusician(),
				Collectors.counting()));
	}
	
	//简单方式求每个艺术家的专辑名
	public Map<Artist, List<String>> nameOfAlbumsDumb(Stream<Album> albums){
		Map<Artist, List<Album>> albumByArtist = 
				albums.collect(Collectors.groupingBy(album->album.getMainMusician()));
		Map<Artist, List<String>> albumByNames = 
				new HashMap<>();
		for(Entry<Artist, List<Album>> entry:albumByArtist.entrySet()){
			albumByNames.put(entry.getKey(), 
					entry.getValue().stream()
					.map(Album::getName).collect(Collectors.toList()));
		}
		return albumByNames;
	}
	
	/**
	 * 集合方式获取每个技术加的专辑名
	 */
	public Map<Artist, List<String>> nameOfAlbums(Stream<Album> albums){
		return albums.collect(Collectors.groupingBy(
				Album::getMainMusician,
				Collectors.mapping(Album::getName, Collectors.toList())));
	}
	
	//537
	public void Test537(List<Artist> artists) {
		StringBuilder builder = new StringBuilder("[");
		for(Artist artist:artists)	{
			if (builder.length()>1) {
				builder.append(",");
			}
			String name = artist.getName();
			builder.append(name);
		}
		builder.append("]");
		String result = builder.toString();
		
		artists.stream()
		.map(Artist::getName)
		.forEach(name->{
			if (builder.length()>1) {
				builder.append(",");
			}
			builder.append(name);
		});
		
		builder.append("]");
	
		StringCombiner combined = 
				artists.stream()
				.map(Artist::getName)	
				.reduce(new StringCombiner(",","[","]"),
						StringCombiner::add,
						StringCombiner::merge);
		
		String result1 = artists.stream()
				.map(Artist::getName)
				.collect(new StringColector(",","[","]"));
	}
	
	public void  countOfAlbum() {
		Map<Artist, List<Album>> albums = new HashMap<>();
		Map<Artist, Integer> countOfAlbum = new HashMap<>();
		for(Entry<Artist, List<Album>> entry:albums.entrySet()){
			Artist artist = entry.getKey();
			List<Album> list = entry.getValue();
			countOfAlbum.put(artist, list.size());
		}
		//遍历map
		albums.forEach((artis,albumss)->{
			countOfAlbum.put(artis, albumss.size());
		});
	}
	
	
	
	
	
	
}
