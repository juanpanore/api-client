package com.co.apiclient.controllers.track;


import com.co.apiclient.domain.track.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import com.co.apiclient.service.track.TrackService;


@RestController
@RequestMapping("/api/v1/rest")
public class TrackController {

    @Autowired
    private TrackService trackService;

    @GetMapping("/track/{idTrack}")
    public Flux<Track> get(@PathVariable Integer idTrack) {

        return trackService.getTracks(idTrack);
    }
}
