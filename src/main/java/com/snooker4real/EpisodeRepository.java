package com.snooker4real;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class EpisodeRepository implements PanacheRepository<Episode> {

    public List<Episode> findByEpisode(String episode) {
        return Episode.find("title", episode).list();
    }

}
