package spotify.api.interfaces;

import spotify.api.enums.AlbumType;
import spotify.models.artists.ArtistFull;
import spotify.models.artists.ArtistSimplified;
import spotify.models.paging.Paging;

import java.util.List;

public interface ArtistApi {
    ArtistFull getArtist(String artistId);

    Paging<ArtistSimplified> getArtistAlbums(String artistId, List<AlbumType> listOfAlbumTypes, String country, int limit, int offset);
}
