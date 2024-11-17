package com.co.apiclient.service.track;

import com.co.apiclient.domain.track.Track;
import com.co.apiclient.repository.track.ITrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TrackService {

    @Autowired
    private ITrackRepository iTrackRepository;
    public Flux<Track> getTracks(Integer idTrack) {
        return iTrackRepository.findByIdTrack(idTrack);
    }

}
