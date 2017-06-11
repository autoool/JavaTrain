package lambda.chapter9;

import java.util.List;
import java.util.stream.Collectors;

import io.reactivex.Observable;
import io.reactivex.Observer;
import lambda.chapter01.Artist;

public class RxExample {

	private static final int String = 0;
	private final List<Artist> savedArtists;
	private final List<String> savedArtistNames;
	
	public RxExample(List<Artist> artists) {
		this.savedArtists = artists;
		savedArtistNames = savedArtists.stream()
				.map(Artist::getName)
				.collect(Collectors.toList());
	}
	
	public Observable<Artist> search(String searchName,
			String nationality,
			int maxResults) {
	
		return getSavedArtists()
				.filter(name->name.contains(searchName))
				.flatMap(this::lookupArtist)
				.filter(artist->artist.getNationality().contains(nationality))
				.take(maxResults);
		
				
	}
	
	public Observable<String> getSavedArtists() {
		return null;
	}
	
	public Observable<List<String>> getSavedArtistss() {		
		return Observable.just(savedArtistNames);
	}

	private Observable<Artist> lookupArtist(String name) {
		Artist required = savedArtists.stream()
				.filter(artist->artist.getName().equals(name))
				.findFirst()
				.get();
		return Observable.just(required);
	}
	
	private void creationCodeSample() {
		Observer<String> observer = null;
		observer.onNext("a");
		observer.onNext("b");
		observer.onNext("c");
		observer.onComplete();
		observer.onError(new Exception());
	}
	
	
	
	
}
