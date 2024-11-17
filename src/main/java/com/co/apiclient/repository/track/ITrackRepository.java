package com.co.apiclient.repository.track;


import com.co.apiclient.domain.track.Track;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;


public interface ITrackRepository extends ReactiveCrudRepository<Track, String> {

    @Query("{'idTrack':?0}")
    Flux<Track> findByIdTrack(Integer idTrack);
}
