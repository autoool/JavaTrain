package lambda.chapter9;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import lambda.LambdaTest;
import lambda.chapter01.Artist;

public class Chapter9Test {

    public static void main(String[] args) {

    }


    public Observable<Artist> search(String searchName,
                                     String nationality,
                                     int maxResults) {
        return null;
//		return LambdaTest.getSavedArtists()
//				.filter(name->name.contains(searchName))
//				.flatMap(new Function<Artist, Artist>() {
//
//				})
//				.filter(artist->artist.getNationality().contains(nationality))
//				.take(maxResults);

    }
}
